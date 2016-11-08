
package com.gottmusig.gottmusig.model.dpscalculation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"mana"
})

//TODO leeres Object?
@EqualsAndHashCode
@Getter
@ToString
public class Data {

	@JsonProperty("mana")
	private Mana mana;
	
}
