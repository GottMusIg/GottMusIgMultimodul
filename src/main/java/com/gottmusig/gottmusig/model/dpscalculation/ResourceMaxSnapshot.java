
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
    "astral_power",
    "combo_points",
    "energy",
    "health",
    "mana",
    "rage"
})
public class ResourceMaxSnapshot {

    /**
     * 
     */
    @JsonProperty("astral_power")
    private Double astralPower;
    /**
     * 
     */
    @JsonProperty("combo_points")
    private Double comboPoints;
    /**
     * 
     */
    @JsonProperty("energy")
    private Double energy;
    /**
     * 
     */
    @JsonProperty("health")
    private Double health;
    /**
     * 
     */
    @JsonProperty("mana")
    private Double mana;
    /**
     * 
     */
    @JsonProperty("rage")
    private Double rage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The astralPower
     */
    @JsonProperty("astral_power")
    public Double getAstralPower() {
        return astralPower;
    }

    /**
     * 
     * @param astralPower
     *     The astral_power
     */
    @JsonProperty("astral_power")
    public void setAstralPower(Double astralPower) {
        this.astralPower = astralPower;
    }

    /**
     * 
     * @return
     *     The comboPoints
     */
    @JsonProperty("combo_points")
    public Double getComboPoints() {
        return comboPoints;
    }

    /**
     * 
     * @param comboPoints
     *     The combo_points
     */
    @JsonProperty("combo_points")
    public void setComboPoints(Double comboPoints) {
        this.comboPoints = comboPoints;
    }

    /**
     * 
     * @return
     *     The energy
     */
    @JsonProperty("energy")
    public Double getEnergy() {
        return energy;
    }

    /**
     * 
     * @param energy
     *     The energy
     */
    @JsonProperty("energy")
    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    /**
     * 
     * @return
     *     The health
     */
    @JsonProperty("health")
    public Double getHealth() {
        return health;
    }

    /**
     * 
     * @param health
     *     The health
     */
    @JsonProperty("health")
    public void setHealth(Double health) {
        this.health = health;
    }

    /**
     * 
     * @return
     *     The mana
     */
    @JsonProperty("mana")
    public Double getMana() {
        return mana;
    }

    /**
     * 
     * @param mana
     *     The mana
     */
    @JsonProperty("mana")
    public void setMana(Double mana) {
        this.mana = mana;
    }

    /**
     * 
     * @return
     *     The rage
     */
    @JsonProperty("rage")
    public Double getRage() {
        return rage;
    }

    /**
     * 
     * @param rage
     *     The rage
     */
    @JsonProperty("rage")
    public void setRage(Double rage) {
        this.rage = rage;
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
        return new HashCodeBuilder().append(astralPower).append(comboPoints).append(energy).append(health).append(mana).append(rage).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceMaxSnapshot) == false) {
            return false;
        }
        ResourceMaxSnapshot rhs = ((ResourceMaxSnapshot) other);
        return new EqualsBuilder().append(astralPower, rhs.astralPower).append(comboPoints, rhs.comboPoints).append(energy, rhs.energy).append(health, rhs.health).append(mana, rhs.mana).append(rage, rhs.rage).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
