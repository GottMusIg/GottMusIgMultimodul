
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
    "Crit",
    "Haste",
    "Int",
    "Mastery",
    "SP",
    "Vers",
    "Agi",
    "AP",
    "Wdps"
})

@EqualsAndHashCode
@Getter
@ToString
public class ScaleFactors {

    
    @JsonProperty("Crit")
    private Double crit;
    
    @JsonProperty("Haste")
    private Double haste;
    
    @JsonProperty("Int")
    private Double _int;
    
    @JsonProperty("Mastery")
    private Double mastery;
    
    @JsonProperty("SP")
    private Double sP;
    
    @JsonProperty("Vers")
    private Double vers;
    
    @JsonProperty("Agi")
    private Double agi;
    
    @JsonProperty("AP")
    private double ap;

    @JsonProperty("Wdps")
    private double wdps;
}
