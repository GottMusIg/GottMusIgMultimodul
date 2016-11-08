
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
    "mean_std_dev",
    "mean_variance",
    "mean",
    "min",
    "name",
    "std_dev",
    "sum",
    "variance"
})
public class Dps {

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
    @JsonProperty("mean_std_dev")
    private Double meanStdDev;
    /**
     * 
     */
    @JsonProperty("mean_variance")
    private Double meanVariance;
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
    @JsonProperty("name")
    private String name;
    /**
     * 
     */
    @JsonProperty("std_dev")
    private Double stdDev;
    /**
     * 
     */
    @JsonProperty("sum")
    private Double sum;
    /**
     * 
     */
    @JsonProperty("variance")
    private Double variance;
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
     *     The meanVariance
     */
    @JsonProperty("mean_variance")
    public Double getMeanVariance() {
        return meanVariance;
    }

    /**
     * 
     * @param meanVariance
     *     The mean_variance
     */
    @JsonProperty("mean_variance")
    public void setMeanVariance(Double meanVariance) {
        this.meanVariance = meanVariance;
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

    /**
     * 
     * @return
     *     The stdDev
     */
    @JsonProperty("std_dev")
    public Double getStdDev() {
        return stdDev;
    }

    /**
     * 
     * @param stdDev
     *     The std_dev
     */
    @JsonProperty("std_dev")
    public void setStdDev(Double stdDev) {
        this.stdDev = stdDev;
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

    /**
     * 
     * @return
     *     The variance
     */
    @JsonProperty("variance")
    public Double getVariance() {
        return variance;
    }

    /**
     * 
     * @param variance
     *     The variance
     */
    @JsonProperty("variance")
    public void setVariance(Double variance) {
        this.variance = variance;
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
        return new HashCodeBuilder().append(count).append(max).append(meanStdDev).append(meanVariance).append(mean).append(min).append(name).append(stdDev).append(sum).append(variance).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dps) == false) {
            return false;
        }
        Dps rhs = ((Dps) other);
        return new EqualsBuilder().append(count, rhs.count).append(max, rhs.max).append(meanStdDev, rhs.meanStdDev).append(meanVariance, rhs.meanVariance).append(mean, rhs.mean).append(min, rhs.min).append(name, rhs.name).append(stdDev, rhs.stdDev).append(sum, rhs.sum).append(variance, rhs.variance).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
