
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
    "count",
    "interval_sum",
    "name"
})
public class Proc {

    /**
     * 
     */
    @JsonProperty("count")
    private Count count;
    /**
     * 
     */
    @JsonProperty("interval_sum")
    private IntervalSum intervalSum;
    /**
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public Count getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(Count count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The intervalSum
     */
    @JsonProperty("interval_sum")
    public IntervalSum getIntervalSum() {
        return intervalSum;
    }

    /**
     * 
     * @param intervalSum
     *     The interval_sum
     */
    @JsonProperty("interval_sum")
    public void setIntervalSum(IntervalSum intervalSum) {
        this.intervalSum = intervalSum;
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
        return new HashCodeBuilder().append(count).append(intervalSum).append(name).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Proc) == false) {
            return false;
        }
        Proc rhs = ((Proc) other);
        return new EqualsBuilder().append(count, rhs.count).append(intervalSum, rhs.intervalSum).append(name, rhs.name).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
