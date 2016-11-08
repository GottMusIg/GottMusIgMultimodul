
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
    "mean",
    "sum"
})

@EqualsAndHashCode
@Getter
@ToString
public class NumTicks {

    
    @JsonProperty("count")
    private Double count;
    
    @JsonProperty("mean")
    private Double mean;
    
    @JsonProperty("sum")
    private Double sum;
 

}
