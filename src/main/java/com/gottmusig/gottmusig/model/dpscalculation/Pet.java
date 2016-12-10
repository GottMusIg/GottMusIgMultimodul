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
    "stamina_per_owner",
    "intellect_per_owner",
    "pet_type",
    "owner_coefficients",
})

@EqualsAndHashCode
@Getter
@ToString
public class Pet {
	
	@JsonProperty("stamina_per_owner")
	private double staminaPerOwner;

	@JsonProperty("intellect_per_owner")
	private double intellectPerOwner;
	
	@JsonProperty("pet_type")
	private String petType;
	
	@JsonProperty("owner_coefficients")
	private OwnerCoefficient ownerCoefficients;


}
