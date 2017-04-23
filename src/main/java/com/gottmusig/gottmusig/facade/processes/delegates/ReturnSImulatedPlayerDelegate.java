package com.gottmusig.gottmusig.facade.processes.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;

public class ReturnSImulatedPlayerDelegate implements JavaDelegate {

    @Override public void execute(DelegateExecution execution) throws Exception {
        SimulationCraft simulationCraft = (SimulationCraft) execution.getVariable(ProcessVars.SIMULATIONCRAFT);


    }
}
