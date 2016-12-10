
package com.gottmusig.gottmusig.model.dpscalculation;

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
    "activated",
    "can_cancel",
    "constant",
    "cooldown",
    "default_chance",
    "default_value",
    "name",
    "overridden",
    "quiet",
    "reactable",
    "reverse",
    "source",
    "spell_data",
    "uptime_array",
    "stacks"
})

@EqualsAndHashCode
@Getter
@ToString
public class Buff {

    @JsonProperty("activated")
    private Boolean activated;

    @JsonProperty("can_cancel")
    private Boolean canCancel;

    @JsonProperty("constant")
    private Boolean constant;

    @JsonProperty("cooldown")
    private Cooldown cooldown;

    @JsonProperty("default_chance")
    private Double defaultChance;

    @JsonProperty("default_value")
    private Double defaultValue;

    @JsonProperty("name")
    private String name;

    @JsonProperty("overridden")
    private Boolean overridden;

    @JsonProperty("quiet")
    private Boolean quiet;

    @JsonProperty("reactable")
    private Boolean reactable;

    @JsonProperty("reverse")
    private Boolean reverse;

    @JsonProperty("source")
    private String source;

    @JsonProperty("spell_data")
    private SpellData spellData;

    @JsonProperty("uptime_array")
    private UptimeArray uptimeArray;
    
    @JsonProperty("stacks")
    private int stacks;
 
}
