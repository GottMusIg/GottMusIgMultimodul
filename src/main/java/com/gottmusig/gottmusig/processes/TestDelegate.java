package com.gottmusig.gottmusig.processes;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class TestDelegate implements JavaDelegate {

    @Override public void execute(DelegateExecution execution) throws Exception {

    }
}
