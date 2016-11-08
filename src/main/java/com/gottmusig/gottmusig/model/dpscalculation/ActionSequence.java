
package com.gottmusig.gottmusig.model.dpscalculation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "action_name",
    "buffs",
    "resource_max_snapshot",
    "resource_snapshot",
    "target_name",
    "time"
})
public class ActionSequence {

    /**
     * 
     */
    @JsonProperty("action_name")
    private String actionName;
    /**
     * 
     */
    @JsonProperty("buffs")
    private List<Buff> buffs = new ArrayList<Buff>();
    /**
     * 
     */
    @JsonProperty("resource_max_snapshot")
    private ResourceMaxSnapshot resourceMaxSnapshot;
    /**
     * 
     */
    @JsonProperty("resource_snapshot")
    private ResourceSnapshot resourceSnapshot;
    /**
     * 
     */
    @JsonProperty("target_name")
    private String targetName;
    /**
     * 
     */
    @JsonProperty("time")
    private Double time;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The actionName
     */
    @JsonProperty("action_name")
    public String getActionName() {
        return actionName;
    }

    /**
     * 
     * @param actionName
     *     The action_name
     */
    @JsonProperty("action_name")
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * 
     * @return
     *     The buffs
     */
    @JsonProperty("buffs")
    public List<Buff> getBuffs() {
        return buffs;
    }

    /**
     * 
     * @param buffs
     *     The buffs
     */
    @JsonProperty("buffs")
    public void setBuffs(List<Buff> buffs) {
        this.buffs = buffs;
    }

    /**
     * 
     * @return
     *     The resourceMaxSnapshot
     */
    @JsonProperty("resource_max_snapshot")
    public ResourceMaxSnapshot getResourceMaxSnapshot() {
        return resourceMaxSnapshot;
    }

    /**
     * 
     * @param resourceMaxSnapshot
     *     The resource_max_snapshot
     */
    @JsonProperty("resource_max_snapshot")
    public void setResourceMaxSnapshot(ResourceMaxSnapshot resourceMaxSnapshot) {
        this.resourceMaxSnapshot = resourceMaxSnapshot;
    }

    /**
     * 
     * @return
     *     The resourceSnapshot
     */
    @JsonProperty("resource_snapshot")
    public ResourceSnapshot getResourceSnapshot() {
        return resourceSnapshot;
    }

    /**
     * 
     * @param resourceSnapshot
     *     The resource_snapshot
     */
    @JsonProperty("resource_snapshot")
    public void setResourceSnapshot(ResourceSnapshot resourceSnapshot) {
        this.resourceSnapshot = resourceSnapshot;
    }

    /**
     * 
     * @return
     *     The targetName
     */
    @JsonProperty("target_name")
    public String getTargetName() {
        return targetName;
    }

    /**
     * 
     * @param targetName
     *     The target_name
     */
    @JsonProperty("target_name")
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * 
     * @return
     *     The time
     */
    @JsonProperty("time")
    public Double getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    @JsonProperty("time")
    public void setTime(Double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(actionName).append(buffs).append(resourceMaxSnapshot).append(resourceSnapshot).append(targetName).append(time).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActionSequence) == false) {
            return false;
        }
        ActionSequence rhs = ((ActionSequence) other);
        return new EqualsBuilder().append(actionName, rhs.actionName).append(buffs, rhs.buffs).append(resourceMaxSnapshot, rhs.resourceMaxSnapshot).append(resourceSnapshot, rhs.resourceSnapshot).append(targetName, rhs.targetName).append(time, rhs.time).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
