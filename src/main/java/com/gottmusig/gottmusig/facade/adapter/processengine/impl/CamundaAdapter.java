package com.gottmusig.gottmusig.facade.adapter.processengine.impl;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import com.gottmusig.gottmusig.facade.adapter.processengine.BpeAdapter;
import com.gottmusig.gottmusig.facade.processes.vars.Message;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CamundaAdapter implements BpeAdapter {

    @Autowired
    private RuntimeService runtimeService;

    @Nonnull
    @Override
    public String startItemRankingCalculation(@Nonnull String simcVersion) {
        Map<String, Object> args = new HashMap<>();
        args.put(ProcessVars.SIMC_VERSION, simcVersion);
        return startProcessByMessage(Message.START_ITEM_DPS_RANKING, args);
    }

    @Nonnull
    @Override public String startMainPageDpsSimulation(@Nonnull String simcVersion) {
        Map<String, Object> args = new HashMap<>();
        args.put(ProcessVars.SIMC_VERSION, simcVersion);
        return startProcessByMessage(Message.START_MAIN_PAGE_DPS_SIMULATION, args);
    }

    private String startProcessByMessage(@Nonnull  Message message,@Nonnull Map<String, Object> args){

        ProcessInstance processInstance = runtimeService.startProcessInstanceByMessage(message.name(),args);
        String processInstanceId =  processInstance.getProcessInstanceId();
        log.debug(">>>>>>>>>>>>>>> Process was started by message: "+message.name());
        return processInstanceId;
    }

}
