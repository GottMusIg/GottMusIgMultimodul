package com.gottmusig.gottmusig.processes;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.Deployment;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.gottmusig.gottmusig.facade.adapter.processengine.BpeAdapter;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;

@Deployment(resources= {"processes/autodeploy/simulateMainPageDpsProcess.bpmn"})
@Transactional
public class MainPageDpsTest extends ProcessTestBase{

    @Autowired
    private BpeAdapter bpeAdapter;


    @Test
    public void firstTest(){

        String id = bpeAdapter.startMainPageDpsSimulation("123");
        executeAsyncJobsLoop();

        ProcessInstance processInstance = getProcessInstanceBy(id).get(0); //Nur 1 ProcessInstance kann ausgeführt worden sein
        assertProcessFinished(processInstance);
    }




}
