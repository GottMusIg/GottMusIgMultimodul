
package com.gottmusig.gottmusig.model.dpscalculation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

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

@EqualsAndHashCode
@Getter
@ToString
public class Plot {

    
    @JsonProperty("dps_plot_debug")
    private Double dpsPlotDebug;
    
    @JsonProperty("dps_plot_iterations")
    private Double dpsPlotIterations;
    
    @JsonProperty("dps_plot_negative")
    private Boolean dpsPlotNegative;
    
    @JsonProperty("dps_plot_points")
    private Double dpsPlotPoints;
    
    @JsonProperty("dps_plot_positive")
    private Boolean dpsPlotPositive;
    
    @JsonProperty("dps_plot_stat_str")
    private String dpsPlotStatStr;
    
    @JsonProperty("dps_plot_step")
    private Double dpsPlotStep;
    
    @JsonProperty("dps_plot_target_error")
    private Double dpsPlotTargetError;
 
}
