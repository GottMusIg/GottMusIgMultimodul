
package com.gottmusig.gottmusig.model.dpscalculation;

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
    "count",
    "max",
    "mean",
    "min",
    "name",
    "sum",
    "variance",
    "std_dev",
    "mean_variance",
    "mean_std_dev"
})

@EqualsAndHashCode
@Getter
@ToString
public class Htps {

    
    @JsonProperty("count")
    private Double count;
    
    @JsonProperty("max")
    private Double max;
    
    @JsonProperty("mean")
    private Double mean;
    
    @JsonProperty("min")
    private Double min;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("sum")
    private Double sum;
 
    @JsonProperty("variance")
    private Double variance;
    
    @JsonProperty("std_dev")
    private Double std_dev;
    
    @JsonProperty("mean_variance")
    private Double mean_variance;
    
    @JsonProperty("mean_std_dev")
    private Double mean_std_dev;
    
}
