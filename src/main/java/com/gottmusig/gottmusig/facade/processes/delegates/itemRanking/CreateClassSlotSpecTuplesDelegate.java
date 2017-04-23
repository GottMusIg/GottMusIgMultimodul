package com.gottmusig.gottmusig.facade.processes.delegates.itemRanking;

import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import com.gottmusig.gottmusig.model.wowhead.WowHeadOpt;
import com.gottmusig.gottmusig.model.wowhead.ClassSpec;
import com.gottmusig.gottmusig.model.wowhead.Classes;
import com.gottmusig.gottmusig.model.wowhead.Slot;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christoph on 23.04.2017.
 */

@Service
public class CreateClassSlotSpecTuplesDelegate implements JavaDelegate{

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        List<WowHeadOpt> wowHeadOpts = new ArrayList<>();

        for(Classes clazz : Classes.values()){

            for(ClassSpec spec : ClassSpec.getSpecBy(clazz)){

                for(Slot slot : Slot.values()){
                    wowHeadOpts.add(WowHeadOpt.builder() //
                            .clazz(clazz) //
                            .spec(spec) //
                            .slot(slot).build());
                }
            }
        }

        delegateExecution.setVariable(ProcessVars.CLASS_SLOT_TUPLE_LIST, wowHeadOpts);

    }
}
