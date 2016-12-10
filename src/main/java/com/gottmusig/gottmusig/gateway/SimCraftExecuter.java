package com.gottmusig.gottmusig.gateway;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraftInputs;

public class SimCraftExecuter {

	//TODO ACHTUNG KEINE LEERZEICHEN IM PFAD -- SIMC IST BEHINDERT
	private static final String SIMULATION_CRAFT_DIR = "C://Softwareengineering//simc-710-02-win64";
	private static final String SIMULATION_CRAFT_RESULTS_DIR = "C://Softwareengineering";

	private ObjectMapper mapper = new ObjectMapper();

	public SimCraftExecuter() {
		File simcraftResultDir = new File(SIMULATION_CRAFT_RESULTS_DIR);
		if (!simcraftResultDir.exists()) {
			simcraftResultDir.mkdir();
			System.out.println(simcraftResultDir.getAbsolutePath());
		}
	}

	public SimulationCraft execute(SimulationCraftInputs inputs) throws IOException {

		File jsonResult = createNewJsonFile();

		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c",
				"simc.exe armory=" + inputs.getRegion() + "," + inputs.getServer() + "," + inputs.getUser() + " "
						+ inputs.getCommand() + " json=" + jsonResult.getAbsolutePath());

		return getSimulationCraftData(builder, jsonResult);
	}

	public String execute(String command) throws IOException {

		File jsonResult = createNewJsonFile();

		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c",
				"simc.exe " + command + " json=" + jsonResult.getAbsolutePath());

		//return getSimulationCraftData(builder, jsonResult);
		
		builder.redirectErrorStream(true);
		builder.directory(new File(SIMULATION_CRAFT_DIR));

		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		
		//HAAAAAAACK son bullshit
		String line;
		StringBuilder stringbuilder = new StringBuilder();
		while (true) {
			line = r.readLine();
			if (line == null) {
				break;
			}
			stringbuilder.append(line+"\n");
			System.out.println(line);
		}
		return stringbuilder.toString();
	}

	private SimulationCraft getSimulationCraftData(ProcessBuilder builder, File jsonResult) throws IOException {

		builder.redirectErrorStream(true);
		builder.directory(new File(SIMULATION_CRAFT_DIR));

		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while (true) {
			line = r.readLine();
			if (line == null) {
				break;
			}
			System.out.println(line);
		}
		return unmarshallJson(jsonResult);
	}

	private File createNewJsonFile() throws IOException {
		UUID uuid = UUID.randomUUID();

		File result = new File(SIMULATION_CRAFT_RESULTS_DIR + "/" + uuid.toString() + ".json");
		System.out.println(result.getAbsolutePath());
		result.createNewFile();
		return result;
	}

	private SimulationCraft unmarshallJson(File jsonFile) {
		SimulationCraft simulationcraft = null;
		try {
			simulationcraft = mapper.readValue(jsonFile, SimulationCraft.class);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jsonFile.delete();
		return simulationcraft;
	}

}
