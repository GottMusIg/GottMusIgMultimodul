
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
    "bleeding",
    "bloodlust",
    "mortal_wounds",
    "target_health"
})

@EqualsAndHashCode
@Getter
@ToString
public class Overrides {

    
    @JsonProperty("bleeding")
    private Double bleeding;
    
    @JsonProperty("bloodlust")
    private Double bloodlust;
    
    @JsonProperty("mortal_wounds")
    private Double mortalWounds;
    
    @JsonProperty("target_health")
    private List<Object> targetHealth = new ArrayList<Object>();
 
}
