package com.gottmusig.gottmusig.facade.adapter.processengine.impl;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.gottmusig.gottmusig.facade.adapter.processengine.BpeAdapter;
import com.gottmusig.gottmusig.facade.processes.vars.Message;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;

public class CamundaAdapter implements BpeAdapter {

    @Inject
    private RuntimeService runtimeService;

    private static final Logger LOG = LoggerFactory.getLogger(CamundaAdapter.class);

    @Override
    @Nonnull
    public String startPlayerDpsCalculation(@Nonnull  String name, @Nonnull String realm, @Nonnull String region) {
        Map<String, Object> args = new HashMap<>();
        args.put(ProcessVars.PLAYER_NAME, name);
        args.put(ProcessVars.PLAYER_REALM, realm);
        args.put(ProcessVars.PLAYER_REGION, region);
        return startProcessByMessage(Message.START_PLAYER_DPS_CALUCALTION, args);
    }

    private String startProcessByMessage(@Nonnull  Message message,@Nonnull Map<String, Object> args){

        ProcessInstance processInstance = runtimeService.startProcessInstanceByMessage(message.name(),args);
        String processInstanceId =  processInstance.getProcessInstanceId();
        LOG.debug(">>>>>>>>>>>>>>> Process was started by message: "+message.name());
        return processInstanceId;
    }

}
