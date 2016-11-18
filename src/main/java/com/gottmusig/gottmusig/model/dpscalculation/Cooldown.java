
package com.gottmusig.gottmusig.model.dpscalculation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "charges",
    "duration",
    "name"
})

@EqualsAndHashCode
@Getter
@ToString
public class Cooldown {

    
    @JsonProperty("charges")
    private Double charges;
    
    @JsonProperty("duration")
    private Double duration;
    
    @JsonProperty("name")
    private String name;
 
}
