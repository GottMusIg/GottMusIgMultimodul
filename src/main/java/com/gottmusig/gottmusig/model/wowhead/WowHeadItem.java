
package com.gottmusig.gottmusig.model.wowhead;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "armor",
    "classs",
    "displayid",
    "flags2",
    "id",
    "level",
    "name",
    "namedesc",
    "pvpUpgrade",
    "reqlevel",
    "reqrace",
    "side",
    "slot",
    "slotbak",
    "subclass",
    "firstseenpatch",
    "reqclass"
})
@EqualsAndHashCode(of={"id"})
public class WowHeadItem {

	@JsonProperty("armor")
    private Integer armor;
    @JsonProperty("classs")
    private Integer classs;
    @JsonProperty("displayid")
    private Integer displayid;
    @JsonProperty("flags2")
    private Integer flags2;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("name")
    private String name;
    @JsonProperty("namedesc")
    private String namedesc;
    @JsonProperty("pvpUpgrade")
    private Integer pvpUpgrade;
    @JsonProperty("reqlevel")
    private Integer reqlevel;
    @JsonProperty("reqrace")
    private Integer reqrace;
    @JsonProperty("side")
    private Integer side;
    @JsonProperty("slot")
    private Integer slot;
    @JsonProperty("slotbak")
    private Integer slotbak;
    @JsonProperty("subclass")
    private Integer subclass;
    @JsonProperty("firstseenpatch")
    private Integer firstseenpatch;
    @JsonProperty("reqclass")
    private Integer reqclass;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("armor")
    public Integer getArmor() {
        return armor;
    }

    @JsonProperty("armor")
    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    @JsonProperty("classs")
    public Integer getClasss() {
        return classs;
    }

    @JsonProperty("classs")
    public void setClasss(Integer classs) {
        this.classs = classs;
    }

    @JsonProperty("displayid")
    public Integer getDisplayid() {
        return displayid;
    }

    @JsonProperty("displayid")
    public void setDisplayid(Integer displayid) {
        this.displayid = displayid;
    }

    @JsonProperty("flags2")
    public Integer getFlags2() {
        return flags2;
    }

    @JsonProperty("flags2")
    public void setFlags2(Integer flags2) {
        this.flags2 = flags2;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("namedesc")
    public String getNamedesc() {
        return namedesc;
    }

    @JsonProperty("namedesc")
    public void setNamedesc(String namedesc) {
        this.namedesc = namedesc;
    }

    @JsonProperty("pvpUpgrade")
    public Integer getPvpUpgrade() {
        return pvpUpgrade;
    }

    @JsonProperty("pvpUpgrade")
    public void setPvpUpgrade(Integer pvpUpgrade) {
        this.pvpUpgrade = pvpUpgrade;
    }

    @JsonProperty("reqlevel")
    public Integer getReqlevel() {
        return reqlevel;
    }

    @JsonProperty("reqlevel")
    public void setReqlevel(Integer reqlevel) {
        this.reqlevel = reqlevel;
    }

    @JsonProperty("reqrace")
    public Integer getReqrace() {
        return reqrace;
    }

    @JsonProperty("reqrace")
    public void setReqrace(Integer reqrace) {
        this.reqrace = reqrace;
    }

    @JsonProperty("side")
    public Integer getSide() {
        return side;
    }

    @JsonProperty("side")
    public void setSide(Integer side) {
        this.side = side;
    }

    @JsonProperty("slot")
    public Integer getSlot() {
        return slot;
    }

    @JsonProperty("slot")
    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    @JsonProperty("slotbak")
    public Integer getSlotbak() {
        return slotbak;
    }

    @JsonProperty("slotbak")
    public void setSlotbak(Integer slotbak) {
        this.slotbak = slotbak;
    }

    @JsonProperty("subclass")
    public Integer getSubclass() {
        return subclass;
    }

    @JsonProperty("subclass")
    public void setSubclass(Integer subclass) {
        this.subclass = subclass;
    }

    @JsonProperty("firstseenpatch")
    public Integer getFirstseenpatch() {
        return firstseenpatch;
    }

    @JsonProperty("firstseenpatch")
    public void setFirstseenpatch(Integer firstseenpatch) {
        this.firstseenpatch = firstseenpatch;
    }

    @JsonProperty("reqclass")
    public Integer getReqclass() {
        return reqclass;
    }

    @JsonProperty("reqclass")
    public void setReqclass(Integer reqclass) {
        this.reqclass = reqclass;
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
