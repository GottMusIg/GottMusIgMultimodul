package com.gottmusig.gottmusig.facade.processes.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gottmusig.gottmusig.facade.Control;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;

@Service
public class SimulatePlayerDpsDelegate implements JavaDelegate{

    @Autowired
    private Control control;

    @Override public void execute(DelegateExecution execution) throws Exception {

        String playerName = (String) execution.getVariable(ProcessVars.PLAYER_NAME);
        String playerRealm = (String) execution.getVariable(ProcessVars.PLAYER_REALM);
        String playerRegion = (String) execution.getVariable(ProcessVars.PLAYER_REGION);

       SimulationCraft simulationCraft =  control.getSpecificSimulationCraftData(playerRegion, playerRealm, playerName);
       execution.setVariable(ProcessVars.SIMULATIONCRAFT, simulationCraft);
    }
}
