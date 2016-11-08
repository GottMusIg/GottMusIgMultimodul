
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
    "data",
    "max",
    "mean_std_dev",
    "mean",
    "min"
})
public class TimelineHealingTaken {

    /**
     * 
     */
    @JsonProperty("data")
    private List<Object> data = new ArrayList<Object>();
    /**
     * 
     */
    @JsonProperty("max")
    private Double max;
    /**
     * 
     */
    @JsonProperty("mean_std_dev")
    private Double meanStdDev;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public List<Object> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public void setData(List<Object> data) {
        this.data = data;
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
     *     The meanStdDev
     */
    @JsonProperty("mean_std_dev")
    public Double getMeanStdDev() {
        return meanStdDev;
    }

    /**
     * 
     * @param meanStdDev
     *     The mean_std_dev
     */
    @JsonProperty("mean_std_dev")
    public void setMeanStdDev(Double meanStdDev) {
        this.meanStdDev = meanStdDev;
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
        return new HashCodeBuilder().append(data).append(max).append(meanStdDev).append(mean).append(min).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimelineHealingTaken) == false) {
            return false;
        }
        TimelineHealingTaken rhs = ((TimelineHealingTaken) other);
        return new EqualsBuilder().append(data, rhs.data).append(max, rhs.max).append(meanStdDev, rhs.meanStdDev).append(mean, rhs.mean).append(min, rhs.min).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
