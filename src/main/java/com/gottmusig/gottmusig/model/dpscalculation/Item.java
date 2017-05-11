
package com.gottmusig.gottmusig.model.dpscalculation;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "ilevel"
})
@Getter
@Setter
public class Item implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("ilevel")
    private Integer ilevel;
    private final static long serialVersionUID = -1393567761539854412L;

}
