
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
    "bleeding",
    "bloodlust",
    "mortal_wounds",
    "target_health"
})
public class Overrides {

    /**
     * 
     */
    @JsonProperty("bleeding")
    private Double bleeding;
    /**
     * 
     */
    @JsonProperty("bloodlust")
    private Double bloodlust;
    /**
     * 
     */
    @JsonProperty("mortal_wounds")
    private Double mortalWounds;
    /**
     * 
     */
    @JsonProperty("target_health")
    private List<Object> targetHealth = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The bleeding
     */
    @JsonProperty("bleeding")
    public Double getBleeding() {
        return bleeding;
    }

    /**
     * 
     * @param bleeding
     *     The bleeding
     */
    @JsonProperty("bleeding")
    public void setBleeding(Double bleeding) {
        this.bleeding = bleeding;
    }

    /**
     * 
     * @return
     *     The bloodlust
     */
    @JsonProperty("bloodlust")
    public Double getBloodlust() {
        return bloodlust;
    }

    /**
     * 
     * @param bloodlust
     *     The bloodlust
     */
    @JsonProperty("bloodlust")
    public void setBloodlust(Double bloodlust) {
        this.bloodlust = bloodlust;
    }

    /**
     * 
     * @return
     *     The mortalWounds
     */
    @JsonProperty("mortal_wounds")
    public Double getMortalWounds() {
        return mortalWounds;
    }

    /**
     * 
     * @param mortalWounds
     *     The mortal_wounds
     */
    @JsonProperty("mortal_wounds")
    public void setMortalWounds(Double mortalWounds) {
        this.mortalWounds = mortalWounds;
    }

    /**
     * 
     * @return
     *     The targetHealth
     */
    @JsonProperty("target_health")
    public List<Object> getTargetHealth() {
        return targetHealth;
    }

    /**
     * 
     * @param targetHealth
     *     The target_health
     */
    @JsonProperty("target_health")
    public void setTargetHealth(List<Object> targetHealth) {
        this.targetHealth = targetHealth;
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
        return new HashCodeBuilder().append(bleeding).append(bloodlust).append(mortalWounds).append(targetHealth).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Overrides) == false) {
            return false;
        }
        Overrides rhs = ((Overrides) other);
        return new EqualsBuilder().append(bleeding, rhs.bleeding).append(bloodlust, rhs.bloodlust).append(mortalWounds, rhs.mortalWounds).append(targetHealth, rhs.targetHealth).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
