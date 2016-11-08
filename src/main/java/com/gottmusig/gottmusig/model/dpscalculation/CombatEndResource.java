
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
    "chi",
    "combo_points",
    "energy",
    "focus",
    "fury",
    "health",
    "holy_power",
    "insanity",
    "maelstrom",
    "mana",
    "none",
    "pain",
    "rage",
    "rune",
    "runic_power",
    "soul_shard"
})

@EqualsAndHashCode
@Getter
@ToString
public class CombatEndResource {

    
    @JsonProperty("astral_power")
    private AstralPower astralPower;
    
    @JsonProperty("chi")
    private Chi chi;
    
    @JsonProperty("combo_points")
    private ComboPoints comboPoints;
    
    @JsonProperty("energy")
    private Energy energy;
    
    @JsonProperty("focus")
    private Focus focus;
    
    @JsonProperty("fury")
    private Fury fury;
    
    @JsonProperty("health")
    private Health health;
    
    @JsonProperty("holy_power")
    private HolyPower holyPower;
    
    @JsonProperty("insanity")
    private Insanity insanity;
    
    @JsonProperty("maelstrom")
    private Maelstrom maelstrom;
    
    @JsonProperty("mana")
    private Mana mana;
    
    @JsonProperty("none")
    private None none;
    
    @JsonProperty("pain")
    private Pain pain;
    
    @JsonProperty("rage")
    private Rage rage;
    
    @JsonProperty("rune")
    private Rune rune;
    
    @JsonProperty("runic_power")
    private RunicPower runicPower;
    
    @JsonProperty("soul_shard")
    private SoulShard soulShard;

}
