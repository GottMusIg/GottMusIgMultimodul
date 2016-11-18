
package com.gottmusig.gottmusig.model.dpscalculation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "build_level",
    "wow_version"
})

@EqualsAndHashCode
@Getter
@ToString
public class Live {

    
    @JsonProperty("build_level")
    private Double buildLevel;
    
    @JsonProperty("wow_version")
    private String wowVersion;
    
}
