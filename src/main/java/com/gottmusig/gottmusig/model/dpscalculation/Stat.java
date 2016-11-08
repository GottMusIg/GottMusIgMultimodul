
package com.gottmusig.gottmusig.model.dpscalculation;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

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

@EqualsAndHashCode
@Getter
@ToString
public class Stat {

    
    @JsonProperty("actual_amount")
    private ActualAmount actualAmount;
    
    @JsonProperty("direct_results_detail")
    private List<DirectResultsDetail> directResultsDetail = new ArrayList<DirectResultsDetail>();
    
    @JsonProperty("direct_results")
    private List<DirectResult> directResults = new ArrayList<DirectResult>();
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("num_executes")
    private NumExecutes numExecutes;
    
    @JsonProperty("num_refreshes")
    private NumRefreshes numRefreshes;
    
    @JsonProperty("num_tick_results")
    private NumTickResults numTickResults;
    
    @JsonProperty("num_ticks")
    private NumTicks numTicks;
    
    @JsonProperty("portion_amount")
    private Double portionAmount;
    
    @JsonProperty("portion_aps")
    private PortionAps portionAps;
    
    @JsonProperty("portion_apse")
    private PortionApse portionApse;
    
    @JsonProperty("resource_gain")
    private ResourceGain resourceGain;
    
    @JsonProperty("school")
    private String school;
    
    @JsonProperty("tick_results_detail")
    private List<TickResultsDetail> tickResultsDetail = new ArrayList<TickResultsDetail>();
    
    @JsonProperty("tick_results")
    private List<TickResult> tickResults = new ArrayList<TickResult>();
    
    @JsonProperty("total_amount")
    private TotalAmount totalAmount;
    
    @JsonProperty("total_execute_time")
    private TotalExecuteTime totalExecuteTime;
    
    @JsonProperty("total_intervals")
    private TotalIntervals totalIntervals;
    
    @JsonProperty("total_tick_time")
    private TotalTickTime totalTickTime;
    
    @JsonProperty("type")
    private String type;
 
}
