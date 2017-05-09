package com.gottmusig.gottmusig.model.dpscalculation;

import java.io.Serializable;
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
    "armor",
    "health",
    "ap_from_sp",
    "ap_from_sp",
    "sp_from_ap",
    "sp_from_sp"
})

@EqualsAndHashCode
@Getter
@ToString
public class OwnerCoefficient implements Serializable {

	@JsonProperty("armor")
	private double armor;
	
	@JsonProperty("health")
	private double health;
	
	@JsonProperty("ap_from_ap")
	private double ap_from_ap;
	
	@JsonProperty("ap_from_sp")
	private double ap_from_sp;
	
	@JsonProperty("sp_from_ap")
	private double sp_from_ap;
	
	@JsonProperty("sp_from_sp")
	private double sp_from_sp;

}
