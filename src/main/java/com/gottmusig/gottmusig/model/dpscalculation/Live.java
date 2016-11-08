
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
    "build_level",
    "wow_version"
})
public class Live {

    /**
     * 
     */
    @JsonProperty("build_level")
    private Double buildLevel;
    /**
     * 
     */
    @JsonProperty("wow_version")
    private String wowVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The buildLevel
     */
    @JsonProperty("build_level")
    public Double getBuildLevel() {
        return buildLevel;
    }

    /**
     * 
     * @param buildLevel
     *     The build_level
     */
    @JsonProperty("build_level")
    public void setBuildLevel(Double buildLevel) {
        this.buildLevel = buildLevel;
    }

    /**
     * 
     * @return
     *     The wowVersion
     */
    @JsonProperty("wow_version")
    public String getWowVersion() {
        return wowVersion;
    }

    /**
     * 
     * @param wowVersion
     *     The wow_version
     */
    @JsonProperty("wow_version")
    public void setWowVersion(String wowVersion) {
        this.wowVersion = wowVersion;
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
        return new HashCodeBuilder().append(buildLevel).append(wowVersion).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Live) == false) {
            return false;
        }
        Live rhs = ((Live) other);
        return new EqualsBuilder().append(buildLevel, rhs.buildLevel).append(wowVersion, rhs.wowVersion).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
