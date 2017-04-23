package com.gottmusig.gottmusig.facade.adapter.processengine.impl;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.inject.Inject;

import com.gottmusig.gottmusig.model.dpscalculation.Proc;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.gottmusig.gottmusig.facade.adapter.processengine.BpeAdapter;
import com.gottmusig.gottmusig.facade.processes.vars.Message;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import org.springframework.beans.factory.annotation.Autowired;

public class CamundaAdapter implements BpeAdapter {

    @Autowired
    private RuntimeService runtimeService;

    private static final Logger LOG = LoggerFactory.getLogger(CamundaAdapter.class);

    @Nonnull
    @Override
    public String startItemRankingCalculation(@Nonnull String wowClass, @Nonnull String slot) {
        Map<String, Object> args = new HashMap<>();
        args.put(ProcessVars.WOW_CLASS, wowClass);
        args.put(ProcessVars.WOW_ITEM_SLOT, slot);
        return startProcessByMessage(Message.START_ITEM_DPS_RANKING, args);
    }

    private String startProcessByMessage(@Nonnull  Message message,@Nonnull Map<String, Object> args){

        ProcessInstance processInstance = runtimeService.startProcessInstanceByMessage(message.name(),args);
        String processInstanceId =  processInstance.getProcessInstanceId();
        LOG.debug(">>>>>>>>>>>>>>> Process was started by message: "+message.name());
        return processInstanceId;
    }

}
