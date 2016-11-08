
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
    "dps_plot_debug",
    "dps_plot_iterations",
    "dps_plot_negative",
    "dps_plot_points",
    "dps_plot_positive",
    "dps_plot_stat_str",
    "dps_plot_step",
    "dps_plot_target_error"
})
public class Plot {

    /**
     * 
     */
    @JsonProperty("dps_plot_debug")
    private Double dpsPlotDebug;
    /**
     * 
     */
    @JsonProperty("dps_plot_iterations")
    private Double dpsPlotIterations;
    /**
     * 
     */
    @JsonProperty("dps_plot_negative")
    private Boolean dpsPlotNegative;
    /**
     * 
     */
    @JsonProperty("dps_plot_points")
    private Double dpsPlotPoints;
    /**
     * 
     */
    @JsonProperty("dps_plot_positive")
    private Boolean dpsPlotPositive;
    /**
     * 
     */
    @JsonProperty("dps_plot_stat_str")
    private String dpsPlotStatStr;
    /**
     * 
     */
    @JsonProperty("dps_plot_step")
    private Double dpsPlotStep;
    /**
     * 
     */
    @JsonProperty("dps_plot_target_error")
    private Double dpsPlotTargetError;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The dpsPlotDebug
     */
    @JsonProperty("dps_plot_debug")
    public Double getDpsPlotDebug() {
        return dpsPlotDebug;
    }

    /**
     * 
     * @param dpsPlotDebug
     *     The dps_plot_debug
     */
    @JsonProperty("dps_plot_debug")
    public void setDpsPlotDebug(Double dpsPlotDebug) {
        this.dpsPlotDebug = dpsPlotDebug;
    }

    /**
     * 
     * @return
     *     The dpsPlotIterations
     */
    @JsonProperty("dps_plot_iterations")
    public Double getDpsPlotIterations() {
        return dpsPlotIterations;
    }

    /**
     * 
     * @param dpsPlotIterations
     *     The dps_plot_iterations
     */
    @JsonProperty("dps_plot_iterations")
    public void setDpsPlotIterations(Double dpsPlotIterations) {
        this.dpsPlotIterations = dpsPlotIterations;
    }

    /**
     * 
     * @return
     *     The dpsPlotNegative
     */
    @JsonProperty("dps_plot_negative")
    public Boolean getDpsPlotNegative() {
        return dpsPlotNegative;
    }

    /**
     * 
     * @param dpsPlotNegative
     *     The dps_plot_negative
     */
    @JsonProperty("dps_plot_negative")
    public void setDpsPlotNegative(Boolean dpsPlotNegative) {
        this.dpsPlotNegative = dpsPlotNegative;
    }

    /**
     * 
     * @return
     *     The dpsPlotPoints
     */
    @JsonProperty("dps_plot_points")
    public Double getDpsPlotPoints() {
        return dpsPlotPoints;
    }

    /**
     * 
     * @param dpsPlotPoints
     *     The dps_plot_points
     */
    @JsonProperty("dps_plot_points")
    public void setDpsPlotPoints(Double dpsPlotPoints) {
        this.dpsPlotPoints = dpsPlotPoints;
    }

    /**
     * 
     * @return
     *     The dpsPlotPositive
     */
    @JsonProperty("dps_plot_positive")
    public Boolean getDpsPlotPositive() {
        return dpsPlotPositive;
    }

    /**
     * 
     * @param dpsPlotPositive
     *     The dps_plot_positive
     */
    @JsonProperty("dps_plot_positive")
    public void setDpsPlotPositive(Boolean dpsPlotPositive) {
        this.dpsPlotPositive = dpsPlotPositive;
    }

    /**
     * 
     * @return
     *     The dpsPlotStatStr
     */
    @JsonProperty("dps_plot_stat_str")
    public String getDpsPlotStatStr() {
        return dpsPlotStatStr;
    }

    /**
     * 
     * @param dpsPlotStatStr
     *     The dps_plot_stat_str
     */
    @JsonProperty("dps_plot_stat_str")
    public void setDpsPlotStatStr(String dpsPlotStatStr) {
        this.dpsPlotStatStr = dpsPlotStatStr;
    }

    /**
     * 
     * @return
     *     The dpsPlotStep
     */
    @JsonProperty("dps_plot_step")
    public Double getDpsPlotStep() {
        return dpsPlotStep;
    }

    /**
     * 
     * @param dpsPlotStep
     *     The dps_plot_step
     */
    @JsonProperty("dps_plot_step")
    public void setDpsPlotStep(Double dpsPlotStep) {
        this.dpsPlotStep = dpsPlotStep;
    }

    /**
     * 
     * @return
     *     The dpsPlotTargetError
     */
    @JsonProperty("dps_plot_target_error")
    public Double getDpsPlotTargetError() {
        return dpsPlotTargetError;
    }

    /**
     * 
     * @param dpsPlotTargetError
     *     The dps_plot_target_error
     */
    @JsonProperty("dps_plot_target_error")
    public void setDpsPlotTargetError(Double dpsPlotTargetError) {
        this.dpsPlotTargetError = dpsPlotTargetError;
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
        return new HashCodeBuilder().append(dpsPlotDebug).append(dpsPlotIterations).append(dpsPlotNegative).append(dpsPlotPoints).append(dpsPlotPositive).append(dpsPlotStatStr).append(dpsPlotStep).append(dpsPlotTargetError).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Plot) == false) {
            return false;
        }
        Plot rhs = ((Plot) other);
        return new EqualsBuilder().append(dpsPlotDebug, rhs.dpsPlotDebug).append(dpsPlotIterations, rhs.dpsPlotIterations).append(dpsPlotNegative, rhs.dpsPlotNegative).append(dpsPlotPoints, rhs.dpsPlotPoints).append(dpsPlotPositive, rhs.dpsPlotPositive).append(dpsPlotStatStr, rhs.dpsPlotStatStr).append(dpsPlotStep, rhs.dpsPlotStep).append(dpsPlotTargetError, rhs.dpsPlotTargetError).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
