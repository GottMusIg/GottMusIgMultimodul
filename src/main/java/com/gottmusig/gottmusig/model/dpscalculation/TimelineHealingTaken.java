
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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "max",
    "mean_std_dev",
    "mean",
    "min"
})

@EqualsAndHashCode
@Getter
@ToString
public class TimelineHealingTaken {

    
    @JsonProperty("data")
    private List<Object> data = new ArrayList<Object>();
    
    @JsonProperty("max")
    private Double max;
    
    @JsonProperty("mean_std_dev")
    private Double meanStdDev;
    
    @JsonProperty("mean")
    private Double mean;
    
    @JsonProperty("min")
    private Double min;

}
