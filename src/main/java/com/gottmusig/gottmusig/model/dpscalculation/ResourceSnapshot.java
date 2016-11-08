
package com.gottmusig.gottmusig.model.dpscalculation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "astral_power",
    "combo_points",
    "energy",
    "health",
    "mana",
    "rage"
})

@EqualsAndHashCode
@Getter
@ToString
public class ResourceSnapshot {

    
    @JsonProperty("astral_power")
    private Double astralPower;
    
    @JsonProperty("combo_points")
    private Double comboPoints;
    
    @JsonProperty("energy")
    private Double energy;
    
    @JsonProperty("health")
    private Double health;
    
    @JsonProperty("mana")
    private Double mana;
    
    @JsonProperty("rage")
    private Double rage;
 
}
