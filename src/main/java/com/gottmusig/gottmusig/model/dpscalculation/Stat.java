
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
    "actual_amount",
    "direct_results_detail",
    "direct_results",
    "name",
    "num_executes",
    "num_refreshes",
    "num_tick_results",
    "num_ticks",
    "portion_amount",
    "portion_aps",
    "portion_apse",
    "resource_gain",
    "school",
    "tick_results_detail",
    "tick_results",
    "total_amount",
    "total_execute_time",
    "total_intervals",
    "total_tick_time",
    "type"
})
public class Stat {

    /**
     * 
     */
    @JsonProperty("actual_amount")
    private ActualAmount actualAmount;
    /**
     * 
     */
    @JsonProperty("direct_results_detail")
    private List<DirectResultsDetail> directResultsDetail = new ArrayList<DirectResultsDetail>();
    /**
     * 
     */
    @JsonProperty("direct_results")
    private List<DirectResult> directResults = new ArrayList<DirectResult>();
    /**
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     */
    @JsonProperty("num_executes")
    private NumExecutes numExecutes;
    /**
     * 
     */
    @JsonProperty("num_refreshes")
    private NumRefreshes numRefreshes;
    /**
     * 
     */
    @JsonProperty("num_tick_results")
    private NumTickResults numTickResults;
    /**
     * 
     */
    @JsonProperty("num_ticks")
    private NumTicks numTicks;
    /**
     * 
     */
    @JsonProperty("portion_amount")
    private Double portionAmount;
    /**
     * 
     */
    @JsonProperty("portion_aps")
    private PortionAps portionAps;
    /**
     * 
     */
    @JsonProperty("portion_apse")
    private PortionApse portionApse;
    /**
     * 
     */
    @JsonProperty("resource_gain")
    private ResourceGain resourceGain;
    /**
     * 
     */
    @JsonProperty("school")
    private String school;
    /**
     * 
     */
    @JsonProperty("tick_results_detail")
    private List<TickResultsDetail> tickResultsDetail = new ArrayList<TickResultsDetail>();
    /**
     * 
     */
    @JsonProperty("tick_results")
    private List<TickResult> tickResults = new ArrayList<TickResult>();
    /**
     * 
     */
    @JsonProperty("total_amount")
    private TotalAmount totalAmount;
    /**
     * 
     */
    @JsonProperty("total_execute_time")
    private TotalExecuteTime totalExecuteTime;
    /**
     * 
     */
    @JsonProperty("total_intervals")
    private TotalIntervals totalIntervals;
    /**
     * 
     */
    @JsonProperty("total_tick_time")
    private TotalTickTime totalTickTime;
    /**
     * 
     */
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The actualAmount
     */
    @JsonProperty("actual_amount")
    public ActualAmount getActualAmount() {
        return actualAmount;
    }

    /**
     * 
     * @param actualAmount
     *     The actual_amount
     */
    @JsonProperty("actual_amount")
    public void setActualAmount(ActualAmount actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * 
     * @return
     *     The directResultsDetail
     */
    @JsonProperty("direct_results_detail")
    public List<DirectResultsDetail> getDirectResultsDetail() {
        return directResultsDetail;
    }

    /**
     * 
     * @param directResultsDetail
     *     The direct_results_detail
     */
    @JsonProperty("direct_results_detail")
    public void setDirectResultsDetail(List<DirectResultsDetail> directResultsDetail) {
        this.directResultsDetail = directResultsDetail;
    }

    /**
     * 
     * @return
     *     The directResults
     */
    @JsonProperty("direct_results")
    public List<DirectResult> getDirectResults() {
        return directResults;
    }

    /**
     * 
     * @param directResults
     *     The direct_results
     */
    @JsonProperty("direct_results")
    public void setDirectResults(List<DirectResult> directResults) {
        this.directResults = directResults;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The numExecutes
     */
    @JsonProperty("num_executes")
    public NumExecutes getNumExecutes() {
        return numExecutes;
    }

    /**
     * 
     * @param numExecutes
     *     The num_executes
     */
    @JsonProperty("num_executes")
    public void setNumExecutes(NumExecutes numExecutes) {
        this.numExecutes = numExecutes;
    }

    /**
     * 
     * @return
     *     The numRefreshes
     */
    @JsonProperty("num_refreshes")
    public NumRefreshes getNumRefreshes() {
        return numRefreshes;
    }

    /**
     * 
     * @param numRefreshes
     *     The num_refreshes
     */
    @JsonProperty("num_refreshes")
    public void setNumRefreshes(NumRefreshes numRefreshes) {
        this.numRefreshes = numRefreshes;
    }

    /**
     * 
     * @return
     *     The numTickResults
     */
    @JsonProperty("num_tick_results")
    public NumTickResults getNumTickResults() {
        return numTickResults;
    }

    /**
     * 
     * @param numTickResults
     *     The num_tick_results
     */
    @JsonProperty("num_tick_results")
    public void setNumTickResults(NumTickResults numTickResults) {
        this.numTickResults = numTickResults;
    }

    /**
     * 
     * @return
     *     The numTicks
     */
    @JsonProperty("num_ticks")
    public NumTicks getNumTicks() {
        return numTicks;
    }

    /**
     * 
     * @param numTicks
     *     The num_ticks
     */
    @JsonProperty("num_ticks")
    public void setNumTicks(NumTicks numTicks) {
        this.numTicks = numTicks;
    }

    /**
     * 
     * @return
     *     The portionAmount
     */
    @JsonProperty("portion_amount")
    public Double getPortionAmount() {
        return portionAmount;
    }

    /**
     * 
     * @param portionAmount
     *     The portion_amount
     */
    @JsonProperty("portion_amount")
    public void setPortionAmount(Double portionAmount) {
        this.portionAmount = portionAmount;
    }

    /**
     * 
     * @return
     *     The portionAps
     */
    @JsonProperty("portion_aps")
    public PortionAps getPortionAps() {
        return portionAps;
    }

    /**
     * 
     * @param portionAps
     *     The portion_aps
     */
    @JsonProperty("portion_aps")
    public void setPortionAps(PortionAps portionAps) {
        this.portionAps = portionAps;
    }

    /**
     * 
     * @return
     *     The portionApse
     */
    @JsonProperty("portion_apse")
    public PortionApse getPortionApse() {
        return portionApse;
    }

    /**
     * 
     * @param portionApse
     *     The portion_apse
     */
    @JsonProperty("portion_apse")
    public void setPortionApse(PortionApse portionApse) {
        this.portionApse = portionApse;
    }

    /**
     * 
     * @return
     *     The resourceGain
     */
    @JsonProperty("resource_gain")
    public ResourceGain getResourceGain() {
        return resourceGain;
    }

    /**
     * 
     * @param resourceGain
     *     The resource_gain
     */
    @JsonProperty("resource_gain")
    public void setResourceGain(ResourceGain resourceGain) {
        this.resourceGain = resourceGain;
    }

    /**
     * 
     * @return
     *     The school
     */
    @JsonProperty("school")
    public String getSchool() {
        return school;
    }

    /**
     * 
     * @param school
     *     The school
     */
    @JsonProperty("school")
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 
     * @return
     *     The tickResultsDetail
     */
    @JsonProperty("tick_results_detail")
    public List<TickResultsDetail> getTickResultsDetail() {
        return tickResultsDetail;
    }

    /**
     * 
     * @param tickResultsDetail
     *     The tick_results_detail
     */
    @JsonProperty("tick_results_detail")
    public void setTickResultsDetail(List<TickResultsDetail> tickResultsDetail) {
        this.tickResultsDetail = tickResultsDetail;
    }

    /**
     * 
     * @return
     *     The tickResults
     */
    @JsonProperty("tick_results")
    public List<TickResult> getTickResults() {
        return tickResults;
    }

    /**
     * 
     * @param tickResults
     *     The tick_results
     */
    @JsonProperty("tick_results")
    public void setTickResults(List<TickResult> tickResults) {
        this.tickResults = tickResults;
    }

    /**
     * 
     * @return
     *     The totalAmount
     */
    @JsonProperty("total_amount")
    public TotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * 
     * @param totalAmount
     *     The total_amount
     */
    @JsonProperty("total_amount")
    public void setTotalAmount(TotalAmount totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 
     * @return
     *     The totalExecuteTime
     */
    @JsonProperty("total_execute_time")
    public TotalExecuteTime getTotalExecuteTime() {
        return totalExecuteTime;
    }

    /**
     * 
     * @param totalExecuteTime
     *     The total_execute_time
     */
    @JsonProperty("total_execute_time")
    public void setTotalExecuteTime(TotalExecuteTime totalExecuteTime) {
        this.totalExecuteTime = totalExecuteTime;
    }

    /**
     * 
     * @return
     *     The totalIntervals
     */
    @JsonProperty("total_intervals")
    public TotalIntervals getTotalIntervals() {
        return totalIntervals;
    }

    /**
     * 
     * @param totalIntervals
     *     The total_intervals
     */
    @JsonProperty("total_intervals")
    public void setTotalIntervals(TotalIntervals totalIntervals) {
        this.totalIntervals = totalIntervals;
    }

    /**
     * 
     * @return
     *     The totalTickTime
     */
    @JsonProperty("total_tick_time")
    public TotalTickTime getTotalTickTime() {
        return totalTickTime;
    }

    /**
     * 
     * @param totalTickTime
     *     The total_tick_time
     */
    @JsonProperty("total_tick_time")
    public void setTotalTickTime(TotalTickTime totalTickTime) {
        this.totalTickTime = totalTickTime;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
        return new HashCodeBuilder().append(actualAmount).append(directResultsDetail).append(directResults).append(name).append(numExecutes).append(numRefreshes).append(numTickResults).append(numTicks).append(portionAmount).append(portionAps).append(portionApse).append(resourceGain).append(school).append(tickResultsDetail).append(tickResults).append(totalAmount).append(totalExecuteTime).append(totalIntervals).append(totalTickTime).append(type).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stat) == false) {
            return false;
        }
        Stat rhs = ((Stat) other);
        return new EqualsBuilder().append(actualAmount, rhs.actualAmount).append(directResultsDetail, rhs.directResultsDetail).append(directResults, rhs.directResults).append(name, rhs.name).append(numExecutes, rhs.numExecutes).append(numRefreshes, rhs.numRefreshes).append(numTickResults, rhs.numTickResults).append(numTicks, rhs.numTicks).append(portionAmount, rhs.portionAmount).append(portionAps, rhs.portionAps).append(portionApse, rhs.portionApse).append(resourceGain, rhs.resourceGain).append(school, rhs.school).append(tickResultsDetail, rhs.tickResultsDetail).append(tickResults, rhs.tickResults).append(totalAmount, rhs.totalAmount).append(totalExecuteTime, rhs.totalExecuteTime).append(totalIntervals, rhs.totalIntervals).append(totalTickTime, rhs.totalTickTime).append(type, rhs.type).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
