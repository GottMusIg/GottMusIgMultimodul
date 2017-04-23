package com.gottmusig.gottmusig.facade.processes.delegates.itemRanking;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import com.gottmusig.gottmusig.gateway.WowHeadDatabaseGateway;
import com.gottmusig.gottmusig.model.wowhead.Classes;
import com.gottmusig.gottmusig.model.wowhead.Quality;
import com.gottmusig.gottmusig.model.wowhead.Slot;
import com.gottmusig.gottmusig.model.wowhead.WowHead;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GetItemIdsFromWowHeadStep implements JavaDelegate {

    @Autowired
    private WowHeadDatabaseGateway wowHeadDatabaseGateway;


    @Override public void execute(DelegateExecution execution) throws Exception {

        Classes wowClass = Classes.findClassByName((String) execution.getVariable(ProcessVars.WOW_CLASS));
        Slot wowItemSlot = Slot.findSlotByName( (String) execution.getVariable(ProcessVars.WOW_ITEM_SLOT));
        Quality wowItemQuality = Quality.findQualityByName( (String) execution.getVariable(ProcessVars.WOW_ITEM_QUALITY));
        int minLvl = (Integer) execution.getVariable(ProcessVars.WOW_ITEM_MIN_LVL);
        int maxLvl = (Integer) execution.getVariable(ProcessVars.WOW_Item_MAX_LVL);

        WowHead wowHead = wowHeadDatabaseGateway.getItemsFor(wowClass, minLvl, maxLvl, wowItemSlot, wowItemQuality);

        execution.setVariable(ProcessVars.WOW_HEAD_ITEM_IDs, wowHead.getItems());

    }
}
