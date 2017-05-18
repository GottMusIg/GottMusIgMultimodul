package com.gottmusig.gottmusig.facade.processes.delegates.itemRanking;

import java.util.List;
import java.util.Map;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import com.gottmusig.gottmusig.model.wowhead.WowHeadItem;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ReturnItemRankingDataDelegate implements JavaDelegate {

    @Override public void execute(DelegateExecution execution) throws Exception {

        List<Map<WowHeadItem, Double>> simulationResults = (List<Map<WowHeadItem,Double>>) execution.getVariable(ProcessVars.SIMULATION_RESULT_LIST);

        //TODO send to Middleware api

        log.info("--------> Hello WOOOOORLD!");
    }
}
