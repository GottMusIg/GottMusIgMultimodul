
package com.gottmusig.gottmusig.model.dpscalculation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "count",
    "max",
    "mean_std_dev",
    "mean_variance",
    "mean",
    "min",
    "name",
    "std_dev",
    "sum",
    "variance"
})

@EqualsAndHashCode
@Getter
@ToString
public class TheckMeloreeIndex {

    
    @JsonProperty("count")
    private Double count;
    
    @JsonProperty("max")
    private Double max;
    
    @JsonProperty("mean_std_dev")
    private Double meanStdDev;
    
    @JsonProperty("mean_variance")
    private Double meanVariance;
    
    @JsonProperty("mean")
    private Double mean;
    
    @JsonProperty("min")
    private Double min;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("std_dev")
    private Double stdDev;
    
    @JsonProperty("sum")
    private Double sum;
    
    @JsonProperty("variance")
    private Double variance;
 
}
