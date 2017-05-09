
package com.gottmusig.gottmusig.model.dpscalculation;

import java.io.Serializable;
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
    "count",
    "max",
    "mean",
    "min",
    "name",
    "sum"
})

@EqualsAndHashCode
@Getter
@ToString
public class CompoundDmg implements Serializable {

    
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

}
