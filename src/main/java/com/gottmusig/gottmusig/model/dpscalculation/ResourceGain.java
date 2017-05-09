
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
    "data",
    "name"
})

@EqualsAndHashCode
@Getter
@ToString
public class ResourceGain implements Serializable {

    
    @JsonProperty("data")
    private Data data;
    
    @JsonProperty("name")
    private String name;
 
}
