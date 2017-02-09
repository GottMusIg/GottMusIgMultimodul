
package com.gottmusig.gottmusig.model.wowhead;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "items"
})

@Slf4j
public class WowHead {

    @JsonProperty("items")
    private List<Item> items = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }
    
    private List<Item> removeDoubleItems(List<Item> originalList){
    	log.debug("Original item size: "+originalList.size());
    	List<Item> deduped = originalList.stream().distinct().collect(Collectors.toList());
    	log.debug("New size :"+deduped.size());
    	return deduped;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = removeDoubleItems(items);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
