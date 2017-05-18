package com.gottmusig.gottmusig.facade.processes.delegates.raidDps;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gottmusig.gottmusig.facade.adapter.processengine.impl.CamundaSupportImpl;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Christoph on 23.04.2017.
 */

@Service
@Slf4j
public class CheckSimcVersionMainPageDpsDelegate implements JavaDelegate {

    @Autowired
    private CamundaSupportImpl camundaSupport;

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        String requestedSimcVersion = (String) execution.getVariable(ProcessVars.SIMC_VERSION);
        String currentProcessId = execution.getProcessInstanceId();

        boolean versionWasAlreadySimulated = false;

        if(camundaSupport.mainPageDpsSimulationWasAlreadyStartedFor(requestedSimcVersion, currentProcessId)){
            versionWasAlreadySimulated = true;
        }

        log.info("CheckSimcVersionDelegate: Version was already simulated:  "+versionWasAlreadySimulated);
        execution.setVariable(ProcessVars.WAS_ALREADY_STARTED_WITH_WANTED_VERSION, versionWasAlreadySimulated);
    }
}
