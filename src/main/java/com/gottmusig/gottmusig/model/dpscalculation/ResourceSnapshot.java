
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
    "astral_power",
    "combo_points",
    "energy",
    "health",
    "mana",
    "rage",
    "fury",
    "runic_power",
    "rune",
    "chi",
    "soul_shard",
    "focus"
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
 
    @JsonProperty("fury")
    private Double fury;
    
    @JsonProperty("runic_power")
    private Double runic_power;
    
    @JsonProperty("rune")
    private Double rune;
    
    @JsonProperty("chi")
    private Double chi;
    
    @JsonProperty("soul_shard")
    private Double soul_shard;
    
    @JsonProperty("focus")
    private Double focus;
}
