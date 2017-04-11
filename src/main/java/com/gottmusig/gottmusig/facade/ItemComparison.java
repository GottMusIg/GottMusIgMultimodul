package com.gottmusig.gottmusig.facade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.gottmusig.gottmusig.gateway.BlizzardGateway;
import com.gottmusig.gottmusig.gateway.SimCraftExecuter;
import com.gottmusig.gottmusig.gateway.WowHeadDatabaseGateway;
import com.gottmusig.gottmusig.model.blizzard.BlizzardItem;
import com.gottmusig.gottmusig.model.blizzard.WowChar;
import com.gottmusig.gottmusig.model.dpscalculation.Player;
import com.gottmusig.gottmusig.model.dpscalculation.SimcCommands;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraftInputs;
import com.gottmusig.gottmusig.model.wowhead.ClassSpec;
import com.gottmusig.gottmusig.model.wowhead.Classes;
import com.gottmusig.gottmusig.model.wowhead.Quality;
import com.gottmusig.gottmusig.model.wowhead.Slot;
import com.gottmusig.gottmusig.model.wowhead.WowHead;
import com.gottmusig.gottmusig.model.wowhead.WowHeadItem;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@Service
public class ItemComparison {

	@Autowired
	BlizzardGateway blizzardGateway;
	@Autowired
	WowHeadDatabaseGateway wowHeadDatabaseGateway;
	@Autowired
	SimCraftExecuter simcExecuter;

	public Map<BlizzardItem, Double> getItemRanking(Classes wowClass, ClassSpec spec, int minLvl, int maxLvl, Slot slot,
			Quality quality) {

		List<BlizzardItem> items = getItemsBy(wowClass, minLvl, maxLvl, slot, spec, quality);
		
		return null; // noch nicht implementiert
	}

	public Map<BlizzardItem, Double> getItemRankingBy(String region, String realm, String name, String slot, String quality)
			throws Exception {

		List<BlizzardItem> items = getItemsBy(region, realm, name, slot, quality);

		SimulationCraftInputs simcInputs = SimulationCraftInputs.builder() //
				.region(region) //
				.server(realm) //
				.user(name)//
				.command(SimcCommands.COMPARE_ITEMS.getCommand()) //
				.build();

		simcInputs = addCommandsTo(simcInputs, items, slot);

		SimulationCraft simulation = startComparison(simcInputs);
		return evaluateSimcResult(simulation, items);
	}

	private List<BlizzardItem> getItemsBy(Classes wowClass, int minLvl, int maxLvl, Slot slot, ClassSpec spec,
			Quality quality) {

		WowHead wowHead = null;
		
		try {
			wowHead = wowHeadDatabaseGateway.getItemsFor(wowClass, minLvl, maxLvl, slot, quality);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return getItemsFromBlizz(wowHead);
	}

	private List<BlizzardItem> getItemsBy(String region, String realm, String name, String slot, String quality) {

		List<BlizzardItem> blizzItems = new ArrayList<>();

		log.debug("Trying to get Wow-Char");
		WowChar wowChar;
		try {
			wowChar = blizzardGateway.getCharWith(region, realm, name); 
			WowHead wowHead = wowHeadDatabaseGateway.getItemsFor(wowChar, Slot.findSlotByName(slot), Quality.valueOf(quality));
			return getItemsFromBlizz(wowHead);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.debug("Found Wow-Char. Trying to get wowHead-Items");

		return blizzItems;
	}

	private List<BlizzardItem> getItemsFromBlizz(WowHead wowHead) {

		List<BlizzardItem> blizzItems = new ArrayList<>();

		BlizzardItem blizzardItem;

		if (wowHead != null) {

			for (WowHeadItem wowheadItem : wowHead.getItems()) {

				try {
					blizzardItem = blizzardGateway.getItemWithId("" + wowheadItem.getId());

					if (blizzardItem.getAvailableContexts().isEmpty()) {
						
						blizzItems.add(blizzardItem);
					} else {
						
						blizzItems.addAll(getAllItemVersions(blizzardItem));
					}

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		log.debug("collected " + blizzItems.size());
		return blizzItems;
	}

	private List<BlizzardItem> getAllItemVersions(BlizzardItem blizzardItem)
			throws JsonParseException, JsonMappingException, IOException {

		List<BlizzardItem> allVerisons = new ArrayList<>();

		for (String context : blizzardItem.getAvailableContexts()) {
			BlizzardItem item;
			item = blizzardGateway.getItemWithId("" + blizzardItem.getId(), context);
			allVerisons.add(item);
		}
		return allVerisons;
	}

	private SimulationCraftInputs addCommandsTo(SimulationCraftInputs simcInputs, List<BlizzardItem> items,
			String slot) throws Exception {

		String copyCommand = "";
		String itemCommand = "";

		for (BlizzardItem blizzItem : removeEqualItems(items)) {

			copyCommand = createCopyCommand(blizzItem);
			simcInputs.addCommand(copyCommand);

			itemCommand = createItemCommand(slot, blizzItem);
			simcInputs.addCommand(itemCommand);
		}
		return simcInputs;
	}

	private List<BlizzardItem> removeEqualItems(List<BlizzardItem> items) {
		return null;
		//return items.parallelStream().distinct().collect(Collectors.toList());
	}

	private String createCopyCommand(BlizzardItem item) {
		return SimcCommands.COPY.getCommand() + createProfileName(item) + "\n";
	}

	private String createProfileName(BlizzardItem item) {
		String profileName = item.getName() + "_" + item.getContext();
		return replaceTroublingChars(profileName);
	}

	private String replaceTroublingChars(String string) {
		String replacedString = string;
		replacedString = replacedString.replaceAll("\\s+", "_");
		replacedString = replacedString.replaceAll("-", "_");
		return replacedString;
	}

	private String createItemCommand(String requestedSlot, BlizzardItem item) throws Exception {

		List<String> simcCommands = Slot.getSimcCommandFor(requestedSlot);
		String command = "";

		if (item.getBonusLists() == null || item.getBonusLists().isEmpty()) {
			command = simcCommands.get(0) + item.getName() + SimcCommands.SEPERATOR.getCommand()
					+ SimcCommands.ID.getCommand() + item.getId();

		} else {
			command = simcCommands.get(0) + item.getName() + SimcCommands.SEPERATOR.getCommand()
					+ SimcCommands.ID.getCommand() + item.getId() + SimcCommands.SEPERATOR.getCommand()
					+ SimcCommands.BONUS_ID.getCommand() + item.getBonusLists().get(0);
		}
		command = replaceTroublingChars(command);
		return command + "\n";
	}

	private SimulationCraft startComparison(SimulationCraftInputs inputs) {

		SimulationCraft simulationCraft = null;

		try {
			simulationCraft = simcExecuter.execute(inputs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return simulationCraft;
	}

	public Map<BlizzardItem, Double> evaluateSimcResult(SimulationCraft simc, List<BlizzardItem> items) {

		Map<BlizzardItem, Double> dpsPerItem = new HashMap<BlizzardItem, Double>();

		// TODO BlizzardItem wird immer ersetzt, da key immer gleich ist ->
		// eignes nochmal schreiben,
		// andre equals methode + direkte wowhead infos etc. reinpacken? l

		for (Player simulatedItem : simc.getSim().getPlayers()) {

			String simulationName = simulatedItem.getName();

			for (BlizzardItem item : items) {

				String generatedItemName = createProfileName(item);
				if (simulationName.equals(generatedItemName)) {

					log.debug(simulationName + "=" + generatedItemName + "?");

					dpsPerItem.put(item, simulatedItem.getCollectedData().getDps().getMean());
				}

			}
		}

		dpsPerItem = sortMapByDps(dpsPerItem);

		log.debug(items.size() + "vs" + dpsPerItem.size());

		for (Map.Entry<BlizzardItem, Double> itemByDps : dpsPerItem.entrySet()) {
			log.debug(createProfileName(itemByDps.getKey()) + " --> " + itemByDps.getValue());
			log.debug("URL for wowhead: " + itemByDps.getKey().getWowHeadToolTipLink());
		}
		return dpsPerItem;
	}

	private Map<BlizzardItem, Double> sortMapByDps(Map<BlizzardItem, Double> map) {
		return null;
	//	return map.entrySet().stream().sorted(Map.Entry.comparingByValue())
	//			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
	}

}
