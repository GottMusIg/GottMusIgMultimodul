
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
    "Crit",
    "Haste",
    "Int",
    "Mastery",
    "SP",
    "Vers"
})
public class ScaleFactors {

    /**
     * 
     */
    @JsonProperty("Crit")
    private Double crit;
    /**
     * 
     */
    @JsonProperty("Haste")
    private Double haste;
    /**
     * 
     */
    @JsonProperty("Int")
    private Double _int;
    /**
     * 
     */
    @JsonProperty("Mastery")
    private Double mastery;
    /**
     * 
     */
    @JsonProperty("SP")
    private Double sP;
    /**
     * 
     */
    @JsonProperty("Vers")
    private Double vers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The crit
     */
    @JsonProperty("Crit")
    public Double getCrit() {
        return crit;
    }

    /**
     * 
     * @param crit
     *     The Crit
     */
    @JsonProperty("Crit")
    public void setCrit(Double crit) {
        this.crit = crit;
    }

    /**
     * 
     * @return
     *     The haste
     */
    @JsonProperty("Haste")
    public Double getHaste() {
        return haste;
    }

    /**
     * 
     * @param haste
     *     The Haste
     */
    @JsonProperty("Haste")
    public void setHaste(Double haste) {
        this.haste = haste;
    }

    /**
     * 
     * @return
     *     The _int
     */
    @JsonProperty("Int")
    public Double getInt() {
        return _int;
    }

    /**
     * 
     * @param _int
     *     The Int
     */
    @JsonProperty("Int")
    public void setInt(Double _int) {
        this._int = _int;
    }

    /**
     * 
     * @return
     *     The mastery
     */
    @JsonProperty("Mastery")
    public Double getMastery() {
        return mastery;
    }

    /**
     * 
     * @param mastery
     *     The Mastery
     */
    @JsonProperty("Mastery")
    public void setMastery(Double mastery) {
        this.mastery = mastery;
    }

    /**
     * 
     * @return
     *     The sP
     */
    @JsonProperty("SP")
    public Double getSP() {
        return sP;
    }

    /**
     * 
     * @param sP
     *     The SP
     */
    @JsonProperty("SP")
    public void setSP(Double sP) {
        this.sP = sP;
    }

    /**
     * 
     * @return
     *     The vers
     */
    @JsonProperty("Vers")
    public Double getVers() {
        return vers;
    }

    /**
     * 
     * @param vers
     *     The Vers
     */
    @JsonProperty("Vers")
    public void setVers(Double vers) {
        this.vers = vers;
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
        return new HashCodeBuilder().append(crit).append(haste).append(_int).append(mastery).append(sP).append(vers).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScaleFactors) == false) {
            return false;
        }
        ScaleFactors rhs = ((ScaleFactors) other);
        return new EqualsBuilder().append(crit, rhs.crit).append(haste, rhs.haste).append(_int, rhs._int).append(mastery, rhs.mastery).append(sP, rhs.sP).append(vers, rhs.vers).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
