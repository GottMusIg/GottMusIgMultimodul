
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
    "mean",
    "sum"
})
public class Count {

    /**
     * 
     */
    @JsonProperty("count")
    private Double count;
    /**
     * 
     */
    @JsonProperty("mean")
    private Double mean;
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
        return new HashCodeBuilder().append(count).append(mean).append(sum).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Count) == false) {
            return false;
        }
        Count rhs = ((Count) other);
        return new EqualsBuilder().append(count, rhs.count).append(mean, rhs.mean).append(sum, rhs.sum).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
