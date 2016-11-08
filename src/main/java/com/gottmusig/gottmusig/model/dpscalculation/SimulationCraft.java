
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
    "beta_enabled",
    "build_date",
    "build_time",
    "ptr_enabled",
    "sim",
    "version"
})
public class SimulationCraft {

    /**
     * 
     */
    @JsonProperty("beta_enabled")
    private Double betaEnabled;
    /**
     * 
     */
    @JsonProperty("build_date")
    private String buildDate;
    /**
     * 
     */
    @JsonProperty("build_time")
    private String buildTime;
    /**
     * 
     */
    @JsonProperty("ptr_enabled")
    private Double ptrEnabled;
    /**
     * 
     */
    @JsonProperty("sim")
    private Sim sim;
    /**
     * 
     */
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The betaEnabled
     */
    @JsonProperty("beta_enabled")
    public Double getBetaEnabled() {
        return betaEnabled;
    }

    /**
     * 
     * @param betaEnabled
     *     The beta_enabled
     */
    @JsonProperty("beta_enabled")
    public void setBetaEnabled(Double betaEnabled) {
        this.betaEnabled = betaEnabled;
    }

    /**
     * 
     * @return
     *     The buildDate
     */
    @JsonProperty("build_date")
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * 
     * @param buildDate
     *     The build_date
     */
    @JsonProperty("build_date")
    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    /**
     * 
     * @return
     *     The buildTime
     */
    @JsonProperty("build_time")
    public String getBuildTime() {
        return buildTime;
    }

    /**
     * 
     * @param buildTime
     *     The build_time
     */
    @JsonProperty("build_time")
    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    /**
     * 
     * @return
     *     The ptrEnabled
     */
    @JsonProperty("ptr_enabled")
    public Double getPtrEnabled() {
        return ptrEnabled;
    }

    /**
     * 
     * @param ptrEnabled
     *     The ptr_enabled
     */
    @JsonProperty("ptr_enabled")
    public void setPtrEnabled(Double ptrEnabled) {
        this.ptrEnabled = ptrEnabled;
    }

    /**
     * 
     * @return
     *     The sim
     */
    @JsonProperty("sim")
    public Sim getSim() {
        return sim;
    }

    /**
     * 
     * @param sim
     *     The sim
     */
    @JsonProperty("sim")
    public void setSim(Sim sim) {
        this.sim = sim;
    }

    /**
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
        return new HashCodeBuilder().append(betaEnabled).append(buildDate).append(buildTime).append(ptrEnabled).append(sim).append(version).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimulationCraft) == false) {
            return false;
        }
        SimulationCraft rhs = ((SimulationCraft) other);
        return new EqualsBuilder().append(betaEnabled, rhs.betaEnabled).append(buildDate, rhs.buildDate).append(buildTime, rhs.buildTime).append(ptrEnabled, rhs.ptrEnabled).append(sim, rhs.sim).append(version, rhs.version).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
