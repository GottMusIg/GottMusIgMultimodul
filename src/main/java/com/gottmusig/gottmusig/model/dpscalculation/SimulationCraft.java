
package com.gottmusig.gottmusig.model.dpscalculation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "beta_enabled",
    "build_date",
    "build_time",
    "ptr_enabled",
    "sim",
    "version"
})

@EqualsAndHashCode
@Getter
@ToString
public class SimulationCraft {

    
    @JsonProperty("beta_enabled")
    private Double betaEnabled;
    
    @JsonProperty("build_date")
    private String buildDate;
    
    @JsonProperty("build_time")
    private String buildTime;
    
    @JsonProperty("ptr_enabled")
    private Double ptrEnabled;
    
    @JsonProperty("sim")
    private Sim sim;
    
    @JsonProperty("version")
    private String version;
  

}
