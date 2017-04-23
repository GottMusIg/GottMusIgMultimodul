package com.gottmusig.gottmusig.facade.processes.delegates.itemRanking.sub;

import com.gottmusig.gottmusig.model.wowhead.*;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import com.gottmusig.gottmusig.gateway.WowHeadDatabaseGateway;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GetItemIdsFromWowHeadStep implements JavaDelegate {

    @Autowired
    private WowHeadDatabaseGateway wowHeadDatabaseGateway;

    @Override public void execute(DelegateExecution execution) throws Exception {

        WowHeadOpt wowHeadOpt = (WowHeadOpt) execution.getVariable(ProcessVars.WOW_HEAD_OPTS);

        WowHead wowHead = wowHeadDatabaseGateway.getItemsFor(wowHeadOpt.getClazz(), wowHeadOpt.getMinLvl(), wowHeadOpt.getMaxLvl(), wowHeadOpt.getSlot(), wowHeadOpt.getQuality());

        execution.setVariable(ProcessVars.WOW_HEAD_ITEM_IDs, wowHead.getItems());

    }
}
