
package com.gottmusig.gottmusig.model.dpscalculation;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "charge_cooldown",
    "charges",
    "class_mask",
    "cooldown",
    "desc",
    "duration",
    "effects",
    "found",
    "gcd",
    "id",
    "initial_stacks",
    "internal_cooldown",
    "level",
    "max_level",
    "max_range",
    "max_scaling_level",
    "max_stacks",
    "min_range",
    "missile_speed",
    "name",
    "ok",
    "proc_chance",
    "proc_flags",
    "race_mask",
    "real_ppm",
    "replace_spell_id",
    "scaling_class",
    "scaling_multiplier",
    "scaling_threshold",
    "school_mask",
    "school_type",
    "tooltip",
    "powers",
    "rank_str",
    "desc_vars"
})

@EqualsAndHashCode
@Getter
@ToString
public class SpellData {

    
    @JsonProperty("category")
    private Double category;
    
    @JsonProperty("charge_cooldown")
    private Double chargeCooldown;
    
    @JsonProperty("charges")
    private Double charges;
    
    @JsonProperty("class_mask")
    private Double classMask;
    
    @JsonProperty("cooldown")
    private Double cooldown;
    
    @JsonProperty("desc")
    private String desc;
    
    @JsonProperty("duration")
    private Double duration;
    
    @JsonProperty("effects")
    private List<Effect> effects = new ArrayList<Effect>();
    
    @JsonProperty("found")
    private Boolean found;
    
    @JsonProperty("gcd")
    private Double gcd;
    
    @JsonProperty("id")
    private Double id;
    
    @JsonProperty("initial_stacks")
    private Double initialStacks;
    
    @JsonProperty("internal_cooldown")
    private Double internalCooldown;
    
    @JsonProperty("level")
    private Double level;
    
    @JsonProperty("max_level")
    private Double maxLevel;
    
    @JsonProperty("max_range")
    private Double maxRange;
    
    @JsonProperty("max_scaling_level")
    private Double maxScalingLevel;
    
    @JsonProperty("max_stacks")
    private Double maxStacks;
    
    @JsonProperty("min_range")
    private Double minRange;
    
    @JsonProperty("missile_speed")
    private Double missileSpeed;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ok")
    private Boolean ok;
    
    @JsonProperty("proc_chance")
    private Double procChance;
    
    @JsonProperty("proc_flags")
    private Double procFlags;
    
    @JsonProperty("race_mask")
    private Double raceMask;
    
    @JsonProperty("real_ppm")
    private Double realPpm;
    
    @JsonProperty("replace_spell_id")
    private Double replaceSpellId;
    
    @JsonProperty("scaling_class")
    private String scalingClass;
    
    @JsonProperty("scaling_multiplier")
    private Double scalingMultiplier;
    
    @JsonProperty("scaling_threshold")
    private Double scalingThreshold;
    
    @JsonProperty("school_mask")
    private Double schoolMask;
    
    @JsonProperty("school_type")
    private String schoolType;
    
    @JsonProperty("tooltip")
    private String tooltip;
    
    @JsonProperty("powers")
    private List<Power> powers = new ArrayList<Power>();
 
    @JsonProperty("rank_str")
    private String rank_str;

    @JsonProperty("desc_vars")
    private String desc_vars;
}
