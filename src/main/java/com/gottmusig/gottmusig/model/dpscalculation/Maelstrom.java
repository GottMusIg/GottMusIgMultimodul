
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
    "max",
    "mean",
    "min",
    "sum"
})
public class Maelstrom {

    /**
     * 
     */
    @JsonProperty("count")
    private Double count;
    /**
     * 
     */
    @JsonProperty("max")
    private Double max;
    /**
     * 
     */
    @JsonProperty("mean")
    private Double mean;
    /**
     * 
     */
    @JsonProperty("min")
    private Double min;
    /**
     * 
     */
    @JsonProperty("sum")
    private Double sum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public Double getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(Double count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The max
     */
    @JsonProperty("max")
    public Double getMax() {
        return max;
    }

    /**
     * 
     * @param max
     *     The max
     */
    @JsonProperty("max")
    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * 
     * @return
     *     The mean
     */
    @JsonProperty("mean")
    public Double getMean() {
        return mean;
    }

    /**
     * 
     * @param mean
     *     The mean
     */
    @JsonProperty("mean")
    public void setMean(Double mean) {
        this.mean = mean;
    }

    /**
     * 
     * @return
     *     The min
     */
    @JsonProperty("min")
    public Double getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    @JsonProperty("min")
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * 
     * @return
     *     The sum
     */
    @JsonProperty("sum")
    public Double getSum() {
        return sum;
    }

    /**
     * 
     * @param sum
     *     The sum
     */
    @JsonProperty("sum")
    public void setSum(Double sum) {
        this.sum = sum;
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
        return new HashCodeBuilder().append(count).append(max).append(mean).append(min).append(sum).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Maelstrom) == false) {
            return false;
        }
        Maelstrom rhs = ((Maelstrom) other);
        return new EqualsBuilder().append(count, rhs.count).append(max, rhs.max).append(mean, rhs.mean).append(min, rhs.min).append(sum, rhs.sum).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
