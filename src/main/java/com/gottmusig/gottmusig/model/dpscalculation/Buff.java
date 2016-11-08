
package com.gottmusig.gottmusig.model.dpscalculation;

import java.util.HashMap;
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
    "activated",
    "can_cancel",
    "constant",
    "cooldown",
    "default_chance",
    "default_value",
    "name",
    "overridden",
    "quiet",
    "reactable",
    "reverse",
    "source",
    "spell_data",
    "uptime_array"
})
public class Buff {

    /**
     * 
     */
    @JsonProperty("activated")
    private Boolean activated;
    /**
     * 
     */
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    /**
     * 
     */
    @JsonProperty("constant")
    private Boolean constant;
    /**
     * 
     */
    @JsonProperty("cooldown")
    private Cooldown cooldown;
    /**
     * 
     */
    @JsonProperty("default_chance")
    private Double defaultChance;
    /**
     * 
     */
    @JsonProperty("default_value")
    private Double defaultValue;
    /**
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     */
    @JsonProperty("overridden")
    private Boolean overridden;
    /**
     * 
     */
    @JsonProperty("quiet")
    private Boolean quiet;
    /**
     * 
     */
    @JsonProperty("reactable")
    private Boolean reactable;
    /**
     * 
     */
    @JsonProperty("reverse")
    private Boolean reverse;
    /**
     * 
     */
    @JsonProperty("source")
    private String source;
    /**
     * 
     */
    @JsonProperty("spell_data")
    private SpellData spellData;
    /**
     * 
     */
    @JsonProperty("uptime_array")
    private UptimeArray uptimeArray;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The activated
     */
    @JsonProperty("activated")
    public Boolean getActivated() {
        return activated;
    }

    /**
     * 
     * @param activated
     *     The activated
     */
    @JsonProperty("activated")
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    /**
     * 
     * @return
     *     The canCancel
     */
    @JsonProperty("can_cancel")
    public Boolean getCanCancel() {
        return canCancel;
    }

    /**
     * 
     * @param canCancel
     *     The can_cancel
     */
    @JsonProperty("can_cancel")
    public void setCanCancel(Boolean canCancel) {
        this.canCancel = canCancel;
    }

    /**
     * 
     * @return
     *     The constant
     */
    @JsonProperty("constant")
    public Boolean getConstant() {
        return constant;
    }

    /**
     * 
     * @param constant
     *     The constant
     */
    @JsonProperty("constant")
    public void setConstant(Boolean constant) {
        this.constant = constant;
    }

    /**
     * 
     * @return
     *     The cooldown
     */
    @JsonProperty("cooldown")
    public Cooldown getCooldown() {
        return cooldown;
    }

    /**
     * 
     * @param cooldown
     *     The cooldown
     */
    @JsonProperty("cooldown")
    public void setCooldown(Cooldown cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * 
     * @return
     *     The defaultChance
     */
    @JsonProperty("default_chance")
    public Double getDefaultChance() {
        return defaultChance;
    }

    /**
     * 
     * @param defaultChance
     *     The default_chance
     */
    @JsonProperty("default_chance")
    public void setDefaultChance(Double defaultChance) {
        this.defaultChance = defaultChance;
    }

    /**
     * 
     * @return
     *     The defaultValue
     */
    @JsonProperty("default_value")
    public Double getDefaultValue() {
        return defaultValue;
    }

    /**
     * 
     * @param defaultValue
     *     The default_value
     */
    @JsonProperty("default_value")
    public void setDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
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
     *     The overridden
     */
    @JsonProperty("overridden")
    public Boolean getOverridden() {
        return overridden;
    }

    /**
     * 
     * @param overridden
     *     The overridden
     */
    @JsonProperty("overridden")
    public void setOverridden(Boolean overridden) {
        this.overridden = overridden;
    }

    /**
     * 
     * @return
     *     The quiet
     */
    @JsonProperty("quiet")
    public Boolean getQuiet() {
        return quiet;
    }

    /**
     * 
     * @param quiet
     *     The quiet
     */
    @JsonProperty("quiet")
    public void setQuiet(Boolean quiet) {
        this.quiet = quiet;
    }

    /**
     * 
     * @return
     *     The reactable
     */
    @JsonProperty("reactable")
    public Boolean getReactable() {
        return reactable;
    }

    /**
     * 
     * @param reactable
     *     The reactable
     */
    @JsonProperty("reactable")
    public void setReactable(Boolean reactable) {
        this.reactable = reactable;
    }

    /**
     * 
     * @return
     *     The reverse
     */
    @JsonProperty("reverse")
    public Boolean getReverse() {
        return reverse;
    }

    /**
     * 
     * @param reverse
     *     The reverse
     */
    @JsonProperty("reverse")
    public void setReverse(Boolean reverse) {
        this.reverse = reverse;
    }

    /**
     * 
     * @return
     *     The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The spellData
     */
    @JsonProperty("spell_data")
    public SpellData getSpellData() {
        return spellData;
    }

    /**
     * 
     * @param spellData
     *     The spell_data
     */
    @JsonProperty("spell_data")
    public void setSpellData(SpellData spellData) {
        this.spellData = spellData;
    }

    /**
     * 
     * @return
     *     The uptimeArray
     */
    @JsonProperty("uptime_array")
    public UptimeArray getUptimeArray() {
        return uptimeArray;
    }

    /**
     * 
     * @param uptimeArray
     *     The uptime_array
     */
    @JsonProperty("uptime_array")
    public void setUptimeArray(UptimeArray uptimeArray) {
        this.uptimeArray = uptimeArray;
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
        return new HashCodeBuilder().append(activated).append(canCancel).append(constant).append(cooldown).append(defaultChance).append(defaultValue).append(name).append(overridden).append(quiet).append(reactable).append(reverse).append(source).append(spellData).append(uptimeArray).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Buff) == false) {
            return false;
        }
        Buff rhs = ((Buff) other);
        return new EqualsBuilder().append(activated, rhs.activated).append(canCancel, rhs.canCancel).append(constant, rhs.constant).append(cooldown, rhs.cooldown).append(defaultChance, rhs.defaultChance).append(defaultValue, rhs.defaultValue).append(name, rhs.name).append(overridden, rhs.overridden).append(quiet, rhs.quiet).append(reactable, rhs.reactable).append(reverse, rhs.reverse).append(source, rhs.source).append(spellData, rhs.spellData).append(uptimeArray, rhs.uptimeArray).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
