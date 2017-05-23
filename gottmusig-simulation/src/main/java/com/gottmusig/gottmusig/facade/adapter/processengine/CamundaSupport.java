package com.gottmusig.gottmusig.facade.adapter.processengine;

import java.util.List;
import javax.annotation.Nonnull;
import org.camunda.bpm.engine.runtime.Execution;
import com.gottmusig.gottmusig.facade.processes.vars.Message;

public interface CamundaSupport {
    /**
     * Find process by message and process instance id.
     * @param processInstanceId the process instance id
     * @param message the message
     * @param processName the process name
     *
     * @return the execution
     */
    Execution findExecutionByProcessInstanceIdAndMessage(String processInstanceId, Message message, String processName);

    /**
     * Find execution by variable and message.
     * <p>
     * Variables are bound to the ProcessInstance whereas Message subscriptions are bound to the scoped execution.
     * That is why we have to use a two phase lookup here.
     * </p>
     * <p>
     * An Exception will be thrown if no matching execution was found.
     * </p>
     *
     * @param varname the varname
     * @param value the value
     * @param message the message
     * @param processName the process name
     * @return the execution
     */
    @Nonnull
    Execution findExecutionByVariableAndMessage(String varname, Object value, Message message, String processName);

    /**
     * Find execution by variable and message.
     * <p>
     * Variables are bound to the ProcessInstance whereas Message subscriptions are bound to the scoped execution.
     * That is why we have to use a two phase lookup here.
     * </p>
     * <p>
     * No Exception will be thrown if no matching execution was found. Instead an empty List will be returned.
     * </p>
     *
     * @param varname the varname
     * @param value the value
     * @param message the message
     * @return the execution list
     */
    @Nonnull
    List<Execution> findExecutionListByVariableAndMessage(String varname, Object value, Message message);
}
