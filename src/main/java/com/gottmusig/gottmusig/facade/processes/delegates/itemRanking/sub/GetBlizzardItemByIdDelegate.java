package com.gottmusig.gottmusig.facade.processes.delegates.itemRanking.sub;

import java.util.ArrayList;
import java.util.List;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import com.gottmusig.gottmusig.gateway.BlizzardGateway;
import com.gottmusig.gottmusig.model.blizzard.BlizzardItem;
import com.gottmusig.gottmusig.model.dpscalculation.Proc;

@Service
public class GetBlizzardItemByIdDelegate implements JavaDelegate {

    @Autowired
    private BlizzardGateway blizzardGateway;

    @Override public void execute(DelegateExecution execution) throws Exception {

        int itemId = (Integer) execution.getVariable(ProcessVars.WOW_HEAD_ITEM_ID);

        BlizzardItem blizzardItem = blizzardGateway.getItemWithId(""+itemId);

        //TODO OPTIMISTIC LOCKING WHEN ADDING NEW ITEM INTO PROCESS ENGINE - WHAT WILL HAPPEN?

        List<BlizzardItem> blizzardItems = (ArrayList<BlizzardItem>) execution.getVariable(ProcessVars.Blizzard_ITEMS);
        if(blizzardItems == null){
            blizzardItems = new ArrayList<>();
        }

        blizzardItems.add(blizzardItem);
        execution.setVariable(ProcessVars.Blizzard_ITEMS, blizzardItems);
    }
}
