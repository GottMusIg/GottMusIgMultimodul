
package com.gottmusig.gottmusig.model.dpscalculation;

import java.io.Serializable;
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
    "base_chi_regen_per_second",
    "base_energy_regen_per_second",
    "base_focus_regen_per_second",
    "base_gcd",
    "base_stats",
    "brain_lag_stddev",
    "brain_lag",
    "buffs",
    "bugs",
    "collected_data",
    "combat_reach",
    "consumables",
    "current_stats",
    "dbc",
    "death_pct",
    "diminishing_returns_constants",
    "gains",
    "gcd_ready",
    "pets",
    "height",
    "initial_stats",
    "invert_scaling",
    "level",
    "main_hand_weapon",
    "name",
    "off_hand_weapon",
    "party",
    "potion_used",
    "procs",
    "professions",
    "race",
    "reaction_mean",
    "reaction_nu",
    "reaction_offset",
    "reaction_stddev",
    "ready_type",
    "resources",
    "role",
    "scale_factors",
    "scale_player",
    "specialization",
    "started_waiting",
    "stats",
    "timeofday",
    "world_lag_override",
    "world_lag_stddev_override",
    "world_lag_stddev",
    "world_lag"
})

@EqualsAndHashCode
@Getter
@ToString
public class HealingPlayer implements Serializable {

    
    @JsonProperty("base_chi_regen_per_second")
    private Double baseChiRegenPerSecond;
    
    @JsonProperty("base_energy_regen_per_second")
    private Double baseEnergyRegenPerSecond;
    
    @JsonProperty("base_focus_regen_per_second")
    private Double baseFocusRegenPerSecond;
    
    @JsonProperty("base_gcd")
    private Double baseGcd;
    
    @JsonProperty("base_stats")
    private BaseStats baseStats;
    
    @JsonProperty("brain_lag_stddev")
    private Double brainLagStddev;
    
    @JsonProperty("brain_lag")
    private Double brainLag;
    
    @JsonProperty("buffs")
    private List<Buff> buffs = new ArrayList<Buff>();
    
    @JsonProperty("bugs")
    private Boolean bugs;
    
    @JsonProperty("collected_data")
    private CollectedData collectedData;
    
    @JsonProperty("combat_reach")
    private Double combatReach;
    
    @JsonProperty("consumables")
    private Consumables consumables;
    
    @JsonProperty("current_stats")
    private CurrentStats currentStats;
    
    @JsonProperty("dbc")
    private Dbc dbc;
    
    @JsonProperty("death_pct")
    private Double deathPct;
    
    @JsonProperty("diminishing_returns_constants")
    private DiminishingReturnsConstants diminishingReturnsConstants;
    
    @JsonProperty("gains")
    private List<Gain> gains = new ArrayList<Gain>();
    
    @JsonProperty("gcd_ready")
    private Double gcdReady;
    
    @JsonProperty("height")
    private Double height;
    
    @JsonProperty("initial_stats")
    private InitialStats initialStats;
    
    @JsonProperty("invert_scaling")
    private Double invertScaling;
    
    @JsonProperty("level")
    private Double level;
    
    @JsonProperty("main_hand_weapon")
    private MainHandWeapon mainHandWeapon;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("off_hand_weapon")
    private OffHandWeapon offHandWeapon;
    
    @JsonProperty("party")
    private Double party;
    
    @JsonProperty("potion_used")
    private Boolean potionUsed;
    
    @JsonProperty("procs")
    private List<Proc> procs = new ArrayList<Proc>();
    
    @JsonProperty("professions")
    private List<Object> professions = new ArrayList<Object>();
    
    @JsonProperty("race")
    private String race;
    
    @JsonProperty("reaction_mean")
    private Double reactionMean;
    
    @JsonProperty("reaction_nu")
    private Double reactionNu;
    
    @JsonProperty("reaction_offset")
    private Double reactionOffset;
    
    @JsonProperty("reaction_stddev")
    private Double reactionStddev;
    
    @JsonProperty("ready_type")
    private Double readyType;
    
    @JsonProperty("resources")
    private Resources resources;
    
    @JsonProperty("role")
    private String role;
    
    @JsonProperty("scale_factors")
    private ScaleFactors scaleFactors;
    
    @JsonProperty("scale_player")
    private Boolean scalePlayer;
    
    @JsonProperty("specialization")
    private String specialization;
    
    @JsonProperty("started_waiting")
    private Double startedWaiting;
    
    @JsonProperty("stats")
    private List<Stat> stats = new ArrayList<Stat>();
    
    @JsonProperty("timeofday")
    private String timeofday;
    
    @JsonProperty("world_lag_override")
    private Boolean worldLagOverride;
    
    @JsonProperty("world_lag_stddev_override")
    private Boolean worldLagStddevOverride;
    
    @JsonProperty("world_lag_stddev")
    private Double worldLagStddev;
    
    @JsonProperty("pets")
    private List<Pet> pets = new ArrayList<Pet>();
    @JsonProperty("world_lag")
    private Double worldLag;
  
}
