
package com.gottmusig.gottmusig.model.dpscalculation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"name",
    "count",
    "mean",
    "sum",
    "min",
    "max"
})

@EqualsAndHashCode
@Getter
@ToString
public class TotalAmount {

	@JsonProperty("name")
	private String name;
    
    @JsonProperty("count")
    private Double count;
    
    @JsonProperty("mean")
    private Double mean;
    
    @JsonProperty("sum")
    private Double sum;
 
    @JsonProperty("min")
    private Double min;
    
    @JsonProperty("max")
    private Double max;

}
