package com.gottmusig.gottmusig.facade.processes.delegates.itemRanking;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class SimulateItemDelegate implements JavaDelegate {

    @Override public void execute(DelegateExecution execution) throws Exception {

    }
}
