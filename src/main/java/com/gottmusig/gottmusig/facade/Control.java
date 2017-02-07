package com.gottmusig.gottmusig.facade;

import java.io.IOException;

import com.gottmusig.gottmusig.gateway.SimCraftExecuter;
import com.gottmusig.gottmusig.gateway.WowHeadDatabaseGateway;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraftInputs;
import com.gottmusig.gottmusig.model.wowhead.Classes;
import com.gottmusig.gottmusig.model.wowhead.Quality;
import com.gottmusig.gottmusig.model.wowhead.Slot;
import com.gottmusig.gottmusig.model.wowhead.WowHead;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Slf4j
public class Control {

	private SimCraftExecuter simcExecuter = new SimCraftExecuter();
	private WowHeadDatabaseGateway wowHeadDatabaseGateway = new WowHeadDatabaseGateway();
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
	

	public WowHead test(){
		try {
			return wowHeadDatabaseGateway.getItemsFor(Classes.WARRIOR, Slot.HEAD, Quality.EPIC);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
