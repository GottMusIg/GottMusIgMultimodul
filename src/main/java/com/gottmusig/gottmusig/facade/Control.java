package com.gottmusig.gottmusig.facade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.gottmusig.gottmusig.gateway.BlizzardGateway;
import com.gottmusig.gottmusig.gateway.SimCraftExecuter;
import com.gottmusig.gottmusig.gateway.WowHeadDatabaseGateway;
import com.gottmusig.gottmusig.model.blizzard.BlizzardItem;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraftInputs;
import com.gottmusig.gottmusig.model.wowhead.Classes;
import com.gottmusig.gottmusig.model.wowhead.Item;
import com.gottmusig.gottmusig.model.wowhead.Quality;
import com.gottmusig.gottmusig.model.wowhead.Slot;
import com.gottmusig.gottmusig.model.wowhead.WowHead;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Slf4j
public class Control {

	@Inject
	private SimCraftExecuter simcExecuter;
	@Inject
	private WowHeadDatabaseGateway wowHeadDatabaseGateway;
	@Inject
	private BlizzardGateway blizzardGateway;
	private SimulationCraft simulationcraft = null;

	public SimulationCraft getSpecificSimulationCraftData(String region, String server, String user) {

		SimulationCraftInputs inputs = SimulationCraftInputs.builder() //
				.region(region) //
				.server(server) //
				.user(user)//
				.command("calculate_scale_factors=0") //TODO
				.build();

		try {
			simulationcraft = simcExecuter.execute(inputs);
			// Test output
			System.out.println(simulationcraft.getSim().getPlayers().get(0).getName());

		} catch (IOException e) {
			e.printStackTrace();
		}
		return simulationcraft;
	}

	public String getDpsForStartPage(String command) {
		try {
			simulationcraft = simcExecuter.execute(command);
			// Test output
			return ""+(simulationcraft.getSim().getPlayers().get(0).getCollectedData().getDps().getMean()).intValue();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	

	public List<BlizzardItem> wowHeadTest(String requestedWowClass, String requestedSlot){
		
		List<BlizzardItem> blizzardItems = new ArrayList<>();
			
		try {
			Classes wowClass = Classes.findClassByName(requestedWowClass);
			Slot slot = Slot.findSlotByName(requestedSlot);
			
			WowHead wowhead =  wowHeadDatabaseGateway.getItemsFor(wowClass, 110,110, slot, Quality.EPIC);
			
			BlizzardItem blizzardItem;
			for(Item item : wowhead.getItems()){
				blizzardItem = blizzardGateway.getItemWithId(""+item.getId(), null); //Zum Testen nicht alle Contexte (hc, mythic etc.)
				blizzardItems.add(blizzardItem);
			}
			return blizzardItems;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
