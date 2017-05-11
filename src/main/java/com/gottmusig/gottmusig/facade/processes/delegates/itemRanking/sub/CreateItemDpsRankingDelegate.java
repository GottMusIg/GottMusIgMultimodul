package com.gottmusig.gottmusig.facade.processes.delegates.itemRanking.sub;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import com.gottmusig.gottmusig.model.dpscalculation.Player;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;
import com.gottmusig.gottmusig.model.wowhead.WowHeadItem;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CreateItemDpsRankingDelegate implements JavaDelegate {

    @Override public void execute(DelegateExecution execution) throws Exception {

        List<WowHeadItem> items = (List<WowHeadItem>) execution.getVariable(ProcessVars.WOW_HEAD_ITEMS);
        SimulationCraft simc = (SimulationCraft) execution.getVariable(ProcessVars.SIMULATIONCRAFT);



        Map<WowHeadItem, Double> dpsPerItem = new HashMap<WowHeadItem, Double>();

        for (Player simulatedItem : simc.getSim().getPlayers()) {

            String simulationName = simulatedItem.getName();

            for (WowHeadItem item : items) {

                String generatedItemName = createProfileName(item);
                if (simulationName.equals(generatedItemName)) {

                    log.debug(simulationName + "=" + generatedItemName + "?");

                    dpsPerItem.put(item, simulatedItem.getCollectedData().getDps().getMean());
                }

            }
        }

        dpsPerItem = sortMapByDps(dpsPerItem);

        log.debug(items.size() + "vs" + dpsPerItem.size());

        for (Map.Entry<WowHeadItem, Double> itemByDps : dpsPerItem.entrySet()) {
            log.debug(createProfileName(itemByDps.getKey()) + " --> " + itemByDps.getValue());
            log.debug("URL for wowhead: " + itemByDps.getKey().getWowHeadToolTipLink());
        }

        List<Map<WowHeadItem, Double>> simulationResults = (List<Map<WowHeadItem, Double>>) execution.getVariable(ProcessVars.SIMULATION_RESULT_LIST);
        simulationResults.add(dpsPerItem);
        execution.setVariable(ProcessVars.SIMULATION_RESULT_LIST, simulationResults);
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

    private Map<WowHeadItem, Double> sortMapByDps(Map<WowHeadItem, Double> map) {
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }
}
