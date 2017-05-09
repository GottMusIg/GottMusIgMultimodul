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
import com.gottmusig.gottmusig.model.wowhead.ClassSpec;
import com.gottmusig.gottmusig.model.wowhead.Classes;
import lombok.extern.slf4j.Slf4j;

@Slf4j @Service public class SimCraftExecuter {

    // TODO ACHTUNG KEINE LEERZEICHEN IM PFAD -- SIMC IST BEHINDERT
    private static final String ROOT_DIR = "C://Softwareengineering/";

    private static final String SIMC_VERSION = "720-02";

    private static final String SIMULATION_CRAFT_DIR = ROOT_DIR + "Simulationcraft/" + SIMC_VERSION;

    private static final String SIMULATION_CRAFT_STANDARD_PROFILES_DIR = SIMULATION_CRAFT_DIR + "/profiles/";

    private static final String SIMULATION_CRAFT_RESULTS_DIR = ROOT_DIR + "Results";

    private static final String SIMULATION_CRAFT_PROFILES_DIR = ROOT_DIR + "Profiles";

    private static final String JSON = ".json";

    private static final String SIMC = ".simc";

    private ObjectMapper mapper = new ObjectMapper();

    public SimCraftExecuter() {
        checkForExistingDir(SIMULATION_CRAFT_RESULTS_DIR);
        checkForExistingDir(SIMULATION_CRAFT_PROFILES_DIR);
    }

    private void checkForExistingDir(String dirPath) {
        File simcraftResultDir = new File(dirPath);
        if (!simcraftResultDir.exists()) {
            simcraftResultDir.mkdir();
            System.out.println(simcraftResultDir.getAbsolutePath());
        }
    }

    public SimulationCraft execute(SimulationCraftInputs inputs) throws Exception {

        File jsonResult = createNewJsonFile();
        SimulationCraft simulationcraft = null;
        File simcProfile = createNewSimcProfile();
        String simcProfileString = "";

        if (inputs.simulateWithGeneratedClass()) {

            File standartProfile = getMatchingProfileFile(inputs.getClazz(), inputs.getSpec());
            simcProfileString = "\"" + standartProfile.getAbsolutePath() + "\" " + inputs.getCommand() + " " + SimcCommands.RESULT
                    .getCommand() + jsonResult.getAbsolutePath();

        } else {
            simcProfileString =
                    SimcCommands.ARMORY.getCommand() + "\"" + inputs.getRegion() + "," + inputs.getServer() + "," + inputs
                            .getUser() + "\" " + inputs.getCommand() + " " + SimcCommands.RESULT.getCommand() + jsonResult
                            .getAbsolutePath();

        }

        Files.write(simcProfile.toPath(), simcProfileString.getBytes());

        String command = "simc.exe input=\"" + simcProfile.getAbsolutePath() + "\"";
        log.debug("SimcCommand: " + command);
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);

        simulationcraft = getSimulationCraftData(builder, jsonResult);

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

    private File createNewSimcProfile() throws IOException {
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

    public static String getSimcVersion() {
        return SIMC_VERSION;
    }

    private File getMatchingProfileFile(Classes clazz, ClassSpec spec) throws Exception {

        File[] files = new File(SIMULATION_CRAFT_STANDARD_PROFILES_DIR).listFiles();

        for (File file : files) {
            if (file.isDirectory() && file.getName().contains("M")) {

                for (File profile : file.listFiles()) {

                    String fileName = profile.getName().toLowerCase();

                    if (fileName.startsWith(clazz.name().toLowerCase()) && fileName.contains(spec.name().toLowerCase())) {
                        return profile;
                    }
                }
            }
        }

        throw new Exception("Could not find a profile for: " + clazz.name() + ", " + spec.name()); //TODO

    }

}
