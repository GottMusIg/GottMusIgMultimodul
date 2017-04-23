package com.gottmusig.gottmusig.facade.processes.delegates.common;

import com.gottmusig.gottmusig.facade.adapter.processengine.impl.CamundaSupportImpl;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Christoph on 23.04.2017.
 */

@Service
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
        execution.setVariable(ProcessVars.IS_NEW_SIMC_VERSION, versionWasAlreadySimulated);
    }
}
