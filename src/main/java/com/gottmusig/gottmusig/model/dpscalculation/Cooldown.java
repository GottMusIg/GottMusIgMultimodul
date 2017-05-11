
package com.gottmusig.gottmusig.model.dpscalculation;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "duration"
})
@Getter
@Setter
public class Cooldown implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("duration")
    private Double duration;
    private final static long serialVersionUID = -1666414231445769355L;

}
