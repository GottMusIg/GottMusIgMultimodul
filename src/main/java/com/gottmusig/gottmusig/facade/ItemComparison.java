package com.gottmusig.gottmusig.facade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.gottmusig.gottmusig.gateway.BlizzardGateway;
import com.gottmusig.gottmusig.gateway.SimCraftExecuter;
import com.gottmusig.gottmusig.gateway.WowHeadDatabaseGateway;
import com.gottmusig.gottmusig.model.blizzard.BlizzardItem;
import com.gottmusig.gottmusig.model.blizzard.WowChar;
import com.gottmusig.gottmusig.model.dpscalculation.SimcCommands;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraftInputs;
import com.gottmusig.gottmusig.model.wowhead.Classes;
import com.gottmusig.gottmusig.model.wowhead.Item;
import com.gottmusig.gottmusig.model.wowhead.Quality;
import com.gottmusig.gottmusig.model.wowhead.Slot;
import com.gottmusig.gottmusig.model.wowhead.WowHead;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ItemComparison {

	@Inject
	BlizzardGateway blizzardGateway;
	@Inject
	WowHeadDatabaseGateway wowHeadDatabaseGateway;
	@Inject
	SimCraftExecuter simcExecuter;

	public SimulationCraft getItemSlotRanking(String region, String realm, String name, String slot) throws Exception{
		
		log.debug("Trying to get BlizzardItems");
		List<BlizzardItem> items = getItemsFor(realm, name, slot);
		
		SimulationCraftInputs simcInputs = SimulationCraftInputs.builder() //
				.region(region) //
				.server(realm) //
				.user(name)//
				.command(SimcCommands.COMPARE_ITEMS.getCommand()) //
				.build();
		
		String copyCommand = "";
		String itemCommand = "";
		
		for(BlizzardItem blizzItem : items){
		
			if(blizzItem.getName() != null){ //TODO schauen warum es überhaupt null sein kann?!
				
			copyCommand = createCopyCommand(name, blizzItem);
			simcInputs.addCommand(copyCommand);
			
			itemCommand = createItemCommand(slot, blizzItem);
			simcInputs.addCommand(itemCommand);
			}
		}	
		return startComparison(simcInputs);
	}

	private String createCopyCommand(String userName, BlizzardItem item) {
		
		String createCommand = (SimcCommands.COPY.getCommand() + userName + "_" + item.getName() + "_" + item.getContext()).replaceAll("\\s+", "_");
		//return createCommand+System.getProperty("line.separator");
		return createCommand+"\n";
	}

	private String createItemCommand(String requestedSlot, BlizzardItem item) throws Exception {

		List<String> simcCommands = Slot.getSimcCommandForSlot(requestedSlot);
		String command = "";
		
		if(simcCommands.isEmpty()){
			throw new Exception(); //Itemslot ist noch nicht supported
		}
		
		//momentan wird immer der 1. Slot ersetzt, wenn zwei existieren (siehe Ringe, Trinkets)
		if (item.getBonusLists() == null || item.getBonusLists().isEmpty()) {
			command = simcCommands.get(0) + item.getName() + SimcCommands.SEPERATOR.getCommand() + SimcCommands.ID.getCommand() + item.getId(); 

		} else {
			command = simcCommands.get(0) + item.getName() + SimcCommands.SEPERATOR.getCommand() + SimcCommands.ID.getCommand() + item.getId()
					+ SimcCommands.SEPERATOR.getCommand() + SimcCommands.BONUS_ID.getCommand() + item.getBonusLists().get(0); //TODO Bonusliste anschauen
		}
		command = command.replaceAll("\\s+", "_");
		return command+"\n";
	}
	
	private SimulationCraft startComparison(SimulationCraftInputs inputs){
		
		SimulationCraft simulationCraft = null;
		
		try {
			simulationCraft = simcExecuter.execute(inputs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return simulationCraft;
	}
	
	private List<BlizzardItem> getItemsFor(String realm, String name, String slot) {

		List<BlizzardItem> blizzItems = new ArrayList<>();

		try {
			log.debug("Trying to get Wow-Char");
			WowChar wowChar = blizzardGateway.getCharWith(realm, name);
			log.debug("Found Wow-Char. Trying to get wowHead-Items");

			WowHead wowHead = wowHeadDatabaseGateway.getItemsFor(wowChar,Slot.findSlotByName(slot), Quality.EPIC);

			for (Item wowheadItem : wowHead.getItems()) {
				BlizzardItem blizzardItem = blizzardGateway.getItemWithId("" + wowheadItem.getId());

				if (blizzardItem.getAvailableContexts().isEmpty()) {
					blizzItems.add(blizzardItem);
				} else {
					for (String context : blizzardItem.getAvailableContexts()) {
						BlizzardItem item = blizzardGateway.getItemWithId("" + blizzardItem.getId(), context);
						blizzItems.add(item);
					}
				}

			}
			log.debug("collected " + blizzItems.size());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return blizzItems;
	}

}
