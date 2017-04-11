package com.gottmusig.gottmusig.gateway;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.UUID;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gottmusig.gottmusig.model.dpscalculation.SimcCommands;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraftInputs;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SimCraftExecuter {

	// TODO ACHTUNG KEINE LEERZEICHEN IM PFAD -- SIMC IST BEHINDERT
	private static final String SIMULATION_CRAFT_DIR = "C://Simulationcraft(x64)/715-01/";
	private static final String SIMULATION_CRAFT_RESULTS_DIR = "C://Softwareengineering/Results";
	private static final String SIMULATION_CRAFT_PROFILES_DIR = "C://Softwareengineering/Profiles";
	private static final String JSON = ".json";
	private static final String SIMC = ".simc";

	private ObjectMapper mapper = new ObjectMapper();

	public SimCraftExecuter() {
		checkForExistingDir(SIMULATION_CRAFT_RESULTS_DIR);
		checkForExistingDir(SIMULATION_CRAFT_PROFILES_DIR);
	}
	
	private void checkForExistingDir(String dirPath){
		File simcraftResultDir = new File(dirPath);
		if (!simcraftResultDir.exists()) {
			simcraftResultDir.mkdir();
			System.out.println(simcraftResultDir.getAbsolutePath());
		}
	}

	public SimulationCraft execute(SimulationCraftInputs inputs) throws IOException {

		File jsonResult = createNewJsonFile();
		
		String simcProfileString = SimcCommands.ARMORY.getCommand() + "\"" + inputs.getRegion() + "," + inputs.getServer() + "," + inputs.getUser() + "\" " 
				+ inputs.getCommand() + " "+ SimcCommands.RESULT.getCommand() + jsonResult.getAbsolutePath();
		
		File simcProfile = createNewSimcProfile();
		Files.write(simcProfile.toPath(), simcProfileString.getBytes());

		
		String command = "simc.exe input=\""+simcProfile.getAbsolutePath()+"\"";
		log.debug("SimcCommand: "+command);
		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);

		SimulationCraft simulationcraft = getSimulationCraftData(builder, jsonResult);
		simcProfile.delete();
		return simulationcraft;
	}
	
	public SimulationCraft execute(String inputfile) throws IOException {

		File simFile = new File(SIMULATION_CRAFT_DIR + "/profiles/" + inputfile);
		System.out.println(simFile.getAbsolutePath());
		if (simFile.exists()) {
			File jsonResult = createNewJsonFile();
			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c",
					"simc.exe input=" + simFile.getAbsolutePath() + " json=" + jsonResult.getAbsolutePath());

			return getSimulationCraftData(builder, jsonResult);
		} else {
			throw new FileNotFoundException();
		}
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
			log.debug(line);
		}
		return unmarshallJson(jsonResult);
	}
	
	private File createNewSimcProfile() throws IOException{
		UUID uuid = UUID.randomUUID();

		File result = new File(SIMULATION_CRAFT_PROFILES_DIR + "/" + uuid.toString() + SIMC);
		System.out.println(result.getAbsolutePath());
		result.createNewFile();
		return result;
	}
	
	private File createNewJsonFile() throws IOException {
		UUID uuid = UUID.randomUUID();

		File result = new File(SIMULATION_CRAFT_RESULTS_DIR + "/" + uuid.toString() + JSON);
		System.out.println(result.getAbsolutePath());
		result.createNewFile();
		return result;
	}

	private SimulationCraft unmarshallJson(File jsonFile) {
		SimulationCraft simulationcraft = null;
		try {
			simulationcraft = mapper.readValue(jsonFile, SimulationCraft.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		jsonFile.delete();
		return simulationcraft;
	}

}
