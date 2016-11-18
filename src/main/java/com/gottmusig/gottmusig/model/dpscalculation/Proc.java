
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
    "interval_sum",
    "name"
})

@EqualsAndHashCode
@Getter
@ToString
public class Proc {

    
    @JsonProperty("count")
    private Count count;
    
    @JsonProperty("interval_sum")
    private IntervalSum intervalSum;
    
    @JsonProperty("name")
    private String name;
 
}
