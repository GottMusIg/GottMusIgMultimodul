
package com.gottmusig.gottmusig.model.dpscalculation;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "action_name",
    "buffs",
    "resource_max_snapshot",
    "resource_snapshot",
    "target_name",
    "time",
    "wait_time"
})
@EqualsAndHashCode
@Getter
@ToString
public class ActionSequence {

    @JsonProperty("action_name")
    private String actionName;
   
    @JsonProperty("buffs")
    private List<Buff> buffs = new ArrayList<Buff>();
    
    @JsonProperty("resource_max_snapshot")
    private ResourceMaxSnapshot resourceMaxSnapshot;
    
    @JsonProperty("resource_snapshot")
    private ResourceSnapshot resourceSnapshot;
    
    @JsonProperty("target_name")
    private String targetName;
    
    @JsonProperty("time")
    private Double time;
    
    @JsonProperty("wait_time")
    private Double wait_time;

}
