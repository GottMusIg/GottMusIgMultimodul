package com.gottmusig.gottmusig.facade.processes.delegates.itemRanking;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ReturnItemRankingDataDelegate implements JavaDelegate {

    @Override public void execute(DelegateExecution execution) throws Exception {
        log.info("--------> Hello WOOOOORLD!");
    }
}
