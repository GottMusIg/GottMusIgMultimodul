
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
    "Live",
    "version_used"
})
public class Dbc {

    /**
     * 
     */
    @JsonProperty("Live")
    private Live live;
    /**
     * 
     */
    @JsonProperty("version_used")
    private String versionUsed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The live
     */
    @JsonProperty("Live")
    public Live getLive() {
        return live;
    }

    /**
     * 
     * @param live
     *     The Live
     */
    @JsonProperty("Live")
    public void setLive(Live live) {
        this.live = live;
    }

    /**
     * 
     * @return
     *     The versionUsed
     */
    @JsonProperty("version_used")
    public String getVersionUsed() {
        return versionUsed;
    }

    /**
     * 
     * @param versionUsed
     *     The version_used
     */
    @JsonProperty("version_used")
    public void setVersionUsed(String versionUsed) {
        this.versionUsed = versionUsed;
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
        return new HashCodeBuilder().append(live).append(versionUsed).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dbc) == false) {
            return false;
        }
        Dbc rhs = ((Dbc) other);
        return new EqualsBuilder().append(live, rhs.live).append(versionUsed, rhs.versionUsed).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
