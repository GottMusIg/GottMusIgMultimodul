package com.gottmusig.gottmusig.gateway;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraftInputs;

import lombok.NoArgsConstructor;

public class SimCraftExecuter {

	private static final String SIMULATION_CRAFT_DIR = "C://Softwareengineering//simc-710-01-win64";
	private static final String SIMULATION_CRAFT_RESULTS_DIR = "C://Softwareengineering//SimulationCraftResults";

	public SimCraftExecuter() {
		File simcraftResultDir = new File(SIMULATION_CRAFT_RESULTS_DIR);
		if (!simcraftResultDir.exists()) {
			simcraftResultDir.mkdir();
			System.out.println(simcraftResultDir.getAbsolutePath());
		}
	}

	public File execute(SimulationCraftInputs inputs) throws IOException, InterruptedException {

		File result = new File(SIMULATION_CRAFT_RESULTS_DIR+"/ResultsFor" + inputs.getRegion() + inputs.getServer() + inputs.getUser());
		System.out.println(result.getAbsolutePath());
		result.createNewFile();

		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c",
				"simc.exe armory=" + inputs.getRegion() + "," + inputs.getServer() + "," + inputs.getUser() + " "
						+ inputs.getCommand() + " json=" + result.getAbsolutePath());

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
		return result;
	}

}
