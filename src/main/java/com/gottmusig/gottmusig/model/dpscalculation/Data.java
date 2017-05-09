
package com.gottmusig.gottmusig.model.dpscalculation;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
	"mana",
	"rage",
	"fury",
	"combo_points",
	"energy",
	"chi",
	"soul_shard",
	"focus"
})

//TODO leeres Object?
@EqualsAndHashCode
@Getter
@ToString
public class Data implements Serializable {

	@JsonProperty("mana")
	private Mana mana;
	
	@JsonProperty("rage")
	private Rage rage;
	
	@JsonProperty("fury")
	private Fury fury;
	
	@JsonProperty("combo_points")
	private ComboPoints combo_points;
	
	@JsonProperty("energy")
	private Energy energy;
	
	@JsonProperty("chi")
	private Chi chi;
	
	@JsonProperty("soul_shard")
	private SoulShard soul_shard;
	
	@JsonProperty("focus")
	private Focus focus;
}
