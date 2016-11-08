
package com.gottmusig.gottmusig.model.dpscalculation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

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
    "tooltip"
})
public class SpellData {

    /**
     * 
     */
    @JsonProperty("category")
    private Double category;
    /**
     * 
     */
    @JsonProperty("charge_cooldown")
    private Double chargeCooldown;
    /**
     * 
     */
    @JsonProperty("charges")
    private Double charges;
    /**
     * 
     */
    @JsonProperty("class_mask")
    private Double classMask;
    /**
     * 
     */
    @JsonProperty("cooldown")
    private Double cooldown;
    /**
     * 
     */
    @JsonProperty("desc")
    private String desc;
    /**
     * 
     */
    @JsonProperty("duration")
    private Double duration;
    /**
     * 
     */
    @JsonProperty("effects")
    private List<Effect> effects = new ArrayList<Effect>();
    /**
     * 
     */
    @JsonProperty("found")
    private Boolean found;
    /**
     * 
     */
    @JsonProperty("gcd")
    private Double gcd;
    /**
     * 
     */
    @JsonProperty("id")
    private Double id;
    /**
     * 
     */
    @JsonProperty("initial_stacks")
    private Double initialStacks;
    /**
     * 
     */
    @JsonProperty("internal_cooldown")
    private Double internalCooldown;
    /**
     * 
     */
    @JsonProperty("level")
    private Double level;
    /**
     * 
     */
    @JsonProperty("max_level")
    private Double maxLevel;
    /**
     * 
     */
    @JsonProperty("max_range")
    private Double maxRange;
    /**
     * 
     */
    @JsonProperty("max_scaling_level")
    private Double maxScalingLevel;
    /**
     * 
     */
    @JsonProperty("max_stacks")
    private Double maxStacks;
    /**
     * 
     */
    @JsonProperty("min_range")
    private Double minRange;
    /**
     * 
     */
    @JsonProperty("missile_speed")
    private Double missileSpeed;
    /**
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     */
    @JsonProperty("ok")
    private Boolean ok;
    /**
     * 
     */
    @JsonProperty("proc_chance")
    private Double procChance;
    /**
     * 
     */
    @JsonProperty("proc_flags")
    private Double procFlags;
    /**
     * 
     */
    @JsonProperty("race_mask")
    private Double raceMask;
    /**
     * 
     */
    @JsonProperty("real_ppm")
    private Double realPpm;
    /**
     * 
     */
    @JsonProperty("replace_spell_id")
    private Double replaceSpellId;
    /**
     * 
     */
    @JsonProperty("scaling_class")
    private String scalingClass;
    /**
     * 
     */
    @JsonProperty("scaling_multiplier")
    private Double scalingMultiplier;
    /**
     * 
     */
    @JsonProperty("scaling_threshold")
    private Double scalingThreshold;
    /**
     * 
     */
    @JsonProperty("school_mask")
    private Double schoolMask;
    /**
     * 
     */
    @JsonProperty("school_type")
    private String schoolType;
    /**
     * 
     */
    @JsonProperty("tooltip")
    private String tooltip;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The category
     */
    @JsonProperty("category")
    public Double getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    @JsonProperty("category")
    public void setCategory(Double category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The chargeCooldown
     */
    @JsonProperty("charge_cooldown")
    public Double getChargeCooldown() {
        return chargeCooldown;
    }

    /**
     * 
     * @param chargeCooldown
     *     The charge_cooldown
     */
    @JsonProperty("charge_cooldown")
    public void setChargeCooldown(Double chargeCooldown) {
        this.chargeCooldown = chargeCooldown;
    }

    /**
     * 
     * @return
     *     The charges
     */
    @JsonProperty("charges")
    public Double getCharges() {
        return charges;
    }

    /**
     * 
     * @param charges
     *     The charges
     */
    @JsonProperty("charges")
    public void setCharges(Double charges) {
        this.charges = charges;
    }

    /**
     * 
     * @return
     *     The classMask
     */
    @JsonProperty("class_mask")
    public Double getClassMask() {
        return classMask;
    }

    /**
     * 
     * @param classMask
     *     The class_mask
     */
    @JsonProperty("class_mask")
    public void setClassMask(Double classMask) {
        this.classMask = classMask;
    }

    /**
     * 
     * @return
     *     The cooldown
     */
    @JsonProperty("cooldown")
    public Double getCooldown() {
        return cooldown;
    }

    /**
     * 
     * @param cooldown
     *     The cooldown
     */
    @JsonProperty("cooldown")
    public void setCooldown(Double cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * 
     * @return
     *     The desc
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * 
     * @param desc
     *     The desc
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 
     * @return
     *     The duration
     */
    @JsonProperty("duration")
    public Double getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    @JsonProperty("duration")
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The effects
     */
    @JsonProperty("effects")
    public List<Effect> getEffects() {
        return effects;
    }

    /**
     * 
     * @param effects
     *     The effects
     */
    @JsonProperty("effects")
    public void setEffects(List<Effect> effects) {
        this.effects = effects;
    }

    /**
     * 
     * @return
     *     The found
     */
    @JsonProperty("found")
    public Boolean getFound() {
        return found;
    }

    /**
     * 
     * @param found
     *     The found
     */
    @JsonProperty("found")
    public void setFound(Boolean found) {
        this.found = found;
    }

    /**
     * 
     * @return
     *     The gcd
     */
    @JsonProperty("gcd")
    public Double getGcd() {
        return gcd;
    }

    /**
     * 
     * @param gcd
     *     The gcd
     */
    @JsonProperty("gcd")
    public void setGcd(Double gcd) {
        this.gcd = gcd;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Double getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Double id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The initialStacks
     */
    @JsonProperty("initial_stacks")
    public Double getInitialStacks() {
        return initialStacks;
    }

    /**
     * 
     * @param initialStacks
     *     The initial_stacks
     */
    @JsonProperty("initial_stacks")
    public void setInitialStacks(Double initialStacks) {
        this.initialStacks = initialStacks;
    }

    /**
     * 
     * @return
     *     The internalCooldown
     */
    @JsonProperty("internal_cooldown")
    public Double getInternalCooldown() {
        return internalCooldown;
    }

    /**
     * 
     * @param internalCooldown
     *     The internal_cooldown
     */
    @JsonProperty("internal_cooldown")
    public void setInternalCooldown(Double internalCooldown) {
        this.internalCooldown = internalCooldown;
    }

    /**
     * 
     * @return
     *     The level
     */
    @JsonProperty("level")
    public Double getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    @JsonProperty("level")
    public void setLevel(Double level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The maxLevel
     */
    @JsonProperty("max_level")
    public Double getMaxLevel() {
        return maxLevel;
    }

    /**
     * 
     * @param maxLevel
     *     The max_level
     */
    @JsonProperty("max_level")
    public void setMaxLevel(Double maxLevel) {
        this.maxLevel = maxLevel;
    }

    /**
     * 
     * @return
     *     The maxRange
     */
    @JsonProperty("max_range")
    public Double getMaxRange() {
        return maxRange;
    }

    /**
     * 
     * @param maxRange
     *     The max_range
     */
    @JsonProperty("max_range")
    public void setMaxRange(Double maxRange) {
        this.maxRange = maxRange;
    }

    /**
     * 
     * @return
     *     The maxScalingLevel
     */
    @JsonProperty("max_scaling_level")
    public Double getMaxScalingLevel() {
        return maxScalingLevel;
    }

    /**
     * 
     * @param maxScalingLevel
     *     The max_scaling_level
     */
    @JsonProperty("max_scaling_level")
    public void setMaxScalingLevel(Double maxScalingLevel) {
        this.maxScalingLevel = maxScalingLevel;
    }

    /**
     * 
     * @return
     *     The maxStacks
     */
    @JsonProperty("max_stacks")
    public Double getMaxStacks() {
        return maxStacks;
    }

    /**
     * 
     * @param maxStacks
     *     The max_stacks
     */
    @JsonProperty("max_stacks")
    public void setMaxStacks(Double maxStacks) {
        this.maxStacks = maxStacks;
    }

    /**
     * 
     * @return
     *     The minRange
     */
    @JsonProperty("min_range")
    public Double getMinRange() {
        return minRange;
    }

    /**
     * 
     * @param minRange
     *     The min_range
     */
    @JsonProperty("min_range")
    public void setMinRange(Double minRange) {
        this.minRange = minRange;
    }

    /**
     * 
     * @return
     *     The missileSpeed
     */
    @JsonProperty("missile_speed")
    public Double getMissileSpeed() {
        return missileSpeed;
    }

    /**
     * 
     * @param missileSpeed
     *     The missile_speed
     */
    @JsonProperty("missile_speed")
    public void setMissileSpeed(Double missileSpeed) {
        this.missileSpeed = missileSpeed;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The ok
     */
    @JsonProperty("ok")
    public Boolean getOk() {
        return ok;
    }

    /**
     * 
     * @param ok
     *     The ok
     */
    @JsonProperty("ok")
    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    /**
     * 
     * @return
     *     The procChance
     */
    @JsonProperty("proc_chance")
    public Double getProcChance() {
        return procChance;
    }

    /**
     * 
     * @param procChance
     *     The proc_chance
     */
    @JsonProperty("proc_chance")
    public void setProcChance(Double procChance) {
        this.procChance = procChance;
    }

    /**
     * 
     * @return
     *     The procFlags
     */
    @JsonProperty("proc_flags")
    public Double getProcFlags() {
        return procFlags;
    }

    /**
     * 
     * @param procFlags
     *     The proc_flags
     */
    @JsonProperty("proc_flags")
    public void setProcFlags(Double procFlags) {
        this.procFlags = procFlags;
    }

    /**
     * 
     * @return
     *     The raceMask
     */
    @JsonProperty("race_mask")
    public Double getRaceMask() {
        return raceMask;
    }

    /**
     * 
     * @param raceMask
     *     The race_mask
     */
    @JsonProperty("race_mask")
    public void setRaceMask(Double raceMask) {
        this.raceMask = raceMask;
    }

    /**
     * 
     * @return
     *     The realPpm
     */
    @JsonProperty("real_ppm")
    public Double getRealPpm() {
        return realPpm;
    }

    /**
     * 
     * @param realPpm
     *     The real_ppm
     */
    @JsonProperty("real_ppm")
    public void setRealPpm(Double realPpm) {
        this.realPpm = realPpm;
    }

    /**
     * 
     * @return
     *     The replaceSpellId
     */
    @JsonProperty("replace_spell_id")
    public Double getReplaceSpellId() {
        return replaceSpellId;
    }

    /**
     * 
     * @param replaceSpellId
     *     The replace_spell_id
     */
    @JsonProperty("replace_spell_id")
    public void setReplaceSpellId(Double replaceSpellId) {
        this.replaceSpellId = replaceSpellId;
    }

    /**
     * 
     * @return
     *     The scalingClass
     */
    @JsonProperty("scaling_class")
    public String getScalingClass() {
        return scalingClass;
    }

    /**
     * 
     * @param scalingClass
     *     The scaling_class
     */
    @JsonProperty("scaling_class")
    public void setScalingClass(String scalingClass) {
        this.scalingClass = scalingClass;
    }

    /**
     * 
     * @return
     *     The scalingMultiplier
     */
    @JsonProperty("scaling_multiplier")
    public Double getScalingMultiplier() {
        return scalingMultiplier;
    }

    /**
     * 
     * @param scalingMultiplier
     *     The scaling_multiplier
     */
    @JsonProperty("scaling_multiplier")
    public void setScalingMultiplier(Double scalingMultiplier) {
        this.scalingMultiplier = scalingMultiplier;
    }

    /**
     * 
     * @return
     *     The scalingThreshold
     */
    @JsonProperty("scaling_threshold")
    public Double getScalingThreshold() {
        return scalingThreshold;
    }

    /**
     * 
     * @param scalingThreshold
     *     The scaling_threshold
     */
    @JsonProperty("scaling_threshold")
    public void setScalingThreshold(Double scalingThreshold) {
        this.scalingThreshold = scalingThreshold;
    }

    /**
     * 
     * @return
     *     The schoolMask
     */
    @JsonProperty("school_mask")
    public Double getSchoolMask() {
        return schoolMask;
    }

    /**
     * 
     * @param schoolMask
     *     The school_mask
     */
    @JsonProperty("school_mask")
    public void setSchoolMask(Double schoolMask) {
        this.schoolMask = schoolMask;
    }

    /**
     * 
     * @return
     *     The schoolType
     */
    @JsonProperty("school_type")
    public String getSchoolType() {
        return schoolType;
    }

    /**
     * 
     * @param schoolType
     *     The school_type
     */
    @JsonProperty("school_type")
    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    /**
     * 
     * @return
     *     The tooltip
     */
    @JsonProperty("tooltip")
    public String getTooltip() {
        return tooltip;
    }

    /**
     * 
     * @param tooltip
     *     The tooltip
     */
    @JsonProperty("tooltip")
    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(category).append(chargeCooldown).append(charges).append(classMask).append(cooldown).append(desc).append(duration).append(effects).append(found).append(gcd).append(id).append(initialStacks).append(internalCooldown).append(level).append(maxLevel).append(maxRange).append(maxScalingLevel).append(maxStacks).append(minRange).append(missileSpeed).append(name).append(ok).append(procChance).append(procFlags).append(raceMask).append(realPpm).append(replaceSpellId).append(scalingClass).append(scalingMultiplier).append(scalingThreshold).append(schoolMask).append(schoolType).append(tooltip).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpellData) == false) {
            return false;
        }
        SpellData rhs = ((SpellData) other);
        return new EqualsBuilder().append(category, rhs.category).append(chargeCooldown, rhs.chargeCooldown).append(charges, rhs.charges).append(classMask, rhs.classMask).append(cooldown, rhs.cooldown).append(desc, rhs.desc).append(duration, rhs.duration).append(effects, rhs.effects).append(found, rhs.found).append(gcd, rhs.gcd).append(id, rhs.id).append(initialStacks, rhs.initialStacks).append(internalCooldown, rhs.internalCooldown).append(level, rhs.level).append(maxLevel, rhs.maxLevel).append(maxRange, rhs.maxRange).append(maxScalingLevel, rhs.maxScalingLevel).append(maxStacks, rhs.maxStacks).append(minRange, rhs.minRange).append(missileSpeed, rhs.missileSpeed).append(name, rhs.name).append(ok, rhs.ok).append(procChance, rhs.procChance).append(procFlags, rhs.procFlags).append(raceMask, rhs.raceMask).append(realPpm, rhs.realPpm).append(replaceSpellId, rhs.replaceSpellId).append(scalingClass, rhs.scalingClass).append(scalingMultiplier, rhs.scalingMultiplier).append(scalingThreshold, rhs.scalingThreshold).append(schoolMask, rhs.schoolMask).append(schoolType, rhs.schoolType).append(tooltip, rhs.tooltip).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
