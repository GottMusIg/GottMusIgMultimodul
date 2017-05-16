package com.gottmusig.gottmusig.facade.adapter.processengine.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.history.HistoricProcessInstance;
import org.camunda.bpm.engine.runtime.Execution;
import org.springframework.beans.factory.annotation.Autowired;
import com.gottmusig.gottmusig.facade.adapter.processengine.CamundaSupport;
import com.gottmusig.gottmusig.facade.processes.exceptions.ProcessExecutionNotFoundException;
import com.gottmusig.gottmusig.facade.processes.vars.Message;
import com.gottmusig.gottmusig.facade.processes.vars.ProcessVars;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CamundaSupportImpl implements CamundaSupport {

    private static final String FOUND_FOR = ") found for ";

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private HistoryService historyService;

    @Override
    public Execution findExecutionByProcessInstanceIdAndMessage(String processInstanceId, Message message, String processName) {
        Execution process = runtimeService.createExecutionQuery()
                .messageEventSubscriptionName(message.name())
                .processInstanceId(processInstanceId).singleResult();

        if (process == null) {
            String errorMessage =
                    "No matching Processexecution ("+processName+") found for ProcessInstanceId="+ processInstanceId;
            throw new ProcessExecutionNotFoundException(errorMessage);
        }
        return process;
    }

    @Override
    @Nonnull
    public Execution findExecutionByVariableAndMessage(String varname, Object value, Message message, String processName) {

        List<Execution> processes =
                runtimeService.createExecutionQuery()
                        .variableValueEquals(varname, value).list();

        if (processes.isEmpty()) {
            String errorMessage = "No matching Process (" + processName + FOUND_FOR + varname + "=" + value;
            throw new ProcessExecutionNotFoundException(errorMessage);
        }

        Execution task = null;

        for (Execution process : processes) {
            Execution candidate =
                    runtimeService.createExecutionQuery()
                            .messageEventSubscriptionName(message.name())
                            .processInstanceId(process.getProcessInstanceId()).singleResult();
            if (candidate != null) {
                if (task != null) {
                    String errorMessage = "More than one matching Process (" + processName + FOUND_FOR + varname + "="
                            + value;
                    throw new ProcessExecutionNotFoundException(errorMessage);
                }

                task = candidate;
            }
        }

        if (task == null) {
            String errorMessage = "No matching Execution (" + processName + FOUND_FOR + varname + "=" + value;
            throw new ProcessExecutionNotFoundException(errorMessage);
        }

        return task;
    }

    public boolean itemRankingSimulationWasAlreadyStartedFor(String simcVersion){
        return processExistedAlreadyWith(ProcessVars.SIMC_VERSION, simcVersion, ProcessVars.ITEM_RANKING_SIMULATION_ID);
    }

    public boolean mainPageDpsSimulationWasAlreadyStartedFor(String simcVersion){
        return processExistedAlreadyWith(ProcessVars.SIMC_VERSION, simcVersion, ProcessVars.MAIN_PAGE_DPS_SIMULATION_ID);
    }

    private boolean processExistedAlreadyWith(String varName, String value, String processDefinition){

        if (!(assertProcessIsStillRuningWith(varName, value, processDefinition))){
            return  assertProcessFinishedWith(varName, value, processDefinition);
        }
        return true;
    }

    private boolean assertProcessFinishedWith(String varName, String value, String processDefinition){

        List<HistoricProcessInstance> processes = historyService.createHistoricProcessInstanceQuery()
                .variableValueEquals(varName,value).processDefinitionKey(processDefinition).finished().list();

        if(processes.isEmpty()){
            return false;
        }
        return true;
    }

    private boolean assertProcessIsStillRuningWith(String varName, String value, String processDefinition){

      return !(runtimeService.createExecutionQuery()
                        .processDefinitionKey(processDefinition)
                        .variableValueEquals(varName, value).list().isEmpty());
    }


    @Override
    @Nonnull
    public List<Execution> findExecutionListByVariableAndMessage(String varname, Object value, Message message) {
        List<Execution> result = new ArrayList<>();

        List<Execution> processes =
                runtimeService.createExecutionQuery()
                        .variableValueEquals(varname, value).list();

        for (Execution processExecution : processes) {
            List<Execution> tasks =
                    runtimeService.createExecutionQuery()
                            .messageEventSubscriptionName(message.name())
                            .processInstanceId(processExecution.getProcessInstanceId()).list();
            result.addAll(tasks);
        }
        return result;
    }
}
