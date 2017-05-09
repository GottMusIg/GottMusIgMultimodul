package com.gottmusig.gottmusig.facade.processes.delegates.itemRanking.sub;

import java.util.List;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gottmusig.gottmusig.facade.ItemComparison;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import com.gottmusig.gottmusig.gateway.SimCraftExecuter;
import com.gottmusig.gottmusig.model.blizzard.BlizzardItem;
import com.gottmusig.gottmusig.model.dpscalculation.SimcCommands;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraftInputs;
import com.gottmusig.gottmusig.model.wowhead.ClassSpec;
import com.gottmusig.gottmusig.model.wowhead.Classes;
import com.gottmusig.gottmusig.model.wowhead.Slot;
import com.gottmusig.gottmusig.model.wowhead.WowHeadItem;
import com.gottmusig.gottmusig.model.wowhead.WowHeadOpt;

@Service
public class SimulateItemDelegate implements JavaDelegate {

    @Autowired
    private SimCraftExecuter simcExecuter;

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        List<WowHeadItem> items = (List<WowHeadItem>) execution.getVariable(ProcessVars.WOW_HEAD_ITEMS);
        WowHeadOpt wowHeadOpt = (WowHeadOpt) execution.getVariable(ProcessVars.WOW_HEAD_OPTION);

        //TODO standartprofil o.ä benutzen falls möglich.

        SimulationCraftInputs simcInputs = SimulationCraftInputs.builder() //
                .clazz(wowHeadOpt.getClazz())
                .spec(wowHeadOpt.getSpec())
                .command(SimcCommands.COMPARE_ITEMS.getCommand()) //
                .build();

        simcInputs = addCommandsTo(simcInputs, items);

        SimulationCraft simulationCraft = simcExecuter.execute(simcInputs);
        execution.setVariable(ProcessVars.SIMULATIONCRAFT, simulationCraft);

    }

    private SimulationCraftInputs addCommandsTo(SimulationCraftInputs simcInputs, List<WowHeadItem> items) throws Exception {

        String copyCommand = "";
        String itemCommand = "";

        for (WowHeadItem item : items) {

            Slot slot = Slot.findSlotById(item.getSlot());

            copyCommand = createCopyCommand(item);
            simcInputs.addCommand(copyCommand);

            itemCommand = createItemCommand(slot, item);
            simcInputs.addCommand(itemCommand);
        }
        return simcInputs;
    }

    private String createCopyCommand(WowHeadItem item) {
        return SimcCommands.COPY.getCommand() + createProfileName(item) + "\n";
    }

    private String createProfileName(WowHeadItem item) {

        String profilName = item.getName();
        Integer bonusId = item.getFirstBonus();

        if(bonusId != null){
            profilName += "_"+bonusId;
        }
        return replaceTroublingChars(profilName);
    }

    private String replaceTroublingChars(String string) {
        String replacedString = string;
        replacedString = replacedString.replaceAll("\\d","");
        replacedString = replacedString.replaceAll("\\s+", "_");
        replacedString = replacedString.replaceAll("-", "_");
        return replacedString;
    }

    private String createItemCommand(Slot slot, WowHeadItem item) throws Exception {

        List<String> simcCommands = slot.getSimcCommands();
        String command = "";

        if (item.getFirstBonus() == null) {
            command = simcCommands.get(0) + item.getName() + SimcCommands.SEPERATOR.getCommand()
                    + SimcCommands.ID.getCommand() + item.getId();

        } else {
            command = simcCommands.get(0) + item.getName() + SimcCommands.SEPERATOR.getCommand()
                    + SimcCommands.ID.getCommand() + item.getId() + SimcCommands.SEPERATOR.getCommand()
                    + SimcCommands.BONUS_ID.getCommand() + item.getFirstBonus();
        }
        command = replaceTroublingChars(command);
        return command + "\n";
    }
}
