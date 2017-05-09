package com.gottmusig.gottmusig.facade.processes.delegates.common;

import com.gottmusig.gottmusig.facade.adapter.processengine.impl.CamundaSupportImpl;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Christoph on 23.04.2017.
 */

@Service
@Slf4j
public class CheckSimcVersionDelegate implements JavaDelegate {

    @Autowired
    private CamundaSupportImpl camundaSupport;

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        String requestedSimcVersion = (String) execution.getVariable(ProcessVars.SIMC_VERSION);
        boolean versionWasAlreadySimulated = false;

        if(camundaSupport.itemRankingSimulationWasAlreadyStartedFor(requestedSimcVersion)){
            versionWasAlreadySimulated = true;
        }

        log.info("CheckSimcVersionDelegate: Version was already simulated:  "+versionWasAlreadySimulated);
        execution.setVariable(ProcessVars.WAS_ALREADY_STARTED_WITH_WANTED_VERSION, versionWasAlreadySimulated);
    }
}
