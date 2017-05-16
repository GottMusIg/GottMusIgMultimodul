package com.gottmusig.gottmusig.processes;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.Deployment;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.gottmusig.gottmusig.facade.adapter.processengine.BpeAdapter;
import com.gottmusig.gottmusig.utils.ProcessTestBase;

@Deployment(resources= {"processes/autodeploy/simulateMainPageDpsProcess.bpmn"})
@Transactional
public class MainPageDpsTest extends ProcessTestBase {

    @Autowired
    private BpeAdapter bpeAdapter;

    @Test
    public void mainPageDpsSimulationProcessShouldRun(){

        String id = bpeAdapter.startMainPageDpsSimulation("123");
        executeAsyncJobsLoop();
        ProcessInstance processInstance = getProcessInstanceBy(id).get(0); //Nur 1 ProcessInstance kann ausgeführt worden sein

        assertProcessFinished(processInstance);
    }

    @Test
    @Ignore
    public void shouldNotExecuteSimulationProcessTwiceWhenIdIsEqual(){

        String simcVersion = "123";

        String id = bpeAdapter.startMainPageDpsSimulation(simcVersion);
        executeAsyncJobsLoop();

        ProcessInstance processInstance = getProcessInstanceBy(id).get(0); //Nur 1 ProcessInstance kann ausgeführt worden sein

        assertStepsTakenFor(processInstance, "startMainPageDpsProcess", "checkVersionStep", "checkSimcVersionGateway", "simulateClassesStep", "returnDpsDataStep", "finalGateway", "processFinished");
        assertProcessFinished(processInstance);


        String id2 = bpeAdapter.startMainPageDpsSimulation(simcVersion);
        executeAsyncJobsLoop();
        ProcessInstance processInstance2 = getProcessInstanceBy(id).get(0); //Nur 1 ProcessInstance kann ausgeführt worden sein

        assertStepsTakenFor(processInstance2, "startMainPageDpsProcess", "checkVersionStep", "checkSimcVersionGateway","finalGateway", "processFinished");


    }

}
