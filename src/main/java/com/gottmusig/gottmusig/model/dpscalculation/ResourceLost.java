
package com.gottmusig.gottmusig.model.dpscalculation;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "astral_power",
    "chi",
    "combo_points",
    "energy",
    "focus",
    "fury",
    "health",
    "holy_power",
    "insanity",
    "maelstrom",
    "mana",
    "none",
    "pain",
    "rage",
    "rune",
    "runic_power",
    "soul_shard"
})
public class ResourceLost {

    /**
     * 
     */
    @JsonProperty("astral_power")
    private AstralPower astralPower;
    /**
     * 
     */
    @JsonProperty("chi")
    private Chi chi;
    /**
     * 
     */
    @JsonProperty("combo_points")
    private ComboPoints comboPoints;
    /**
     * 
     */
    @JsonProperty("energy")
    private Energy energy;
    /**
     * 
     */
    @JsonProperty("focus")
    private Focus focus;
    /**
     * 
     */
    @JsonProperty("fury")
    private Fury fury;
    /**
     * 
     */
    @JsonProperty("health")
    private Health health;
    /**
     * 
     */
    @JsonProperty("holy_power")
    private HolyPower holyPower;
    /**
     * 
     */
    @JsonProperty("insanity")
    private Insanity insanity;
    /**
     * 
     */
    @JsonProperty("maelstrom")
    private Maelstrom maelstrom;
    /**
     * 
     */
    @JsonProperty("mana")
    private Mana mana;
    /**
     * 
     */
    @JsonProperty("none")
    private None none;
    /**
     * 
     */
    @JsonProperty("pain")
    private Pain pain;
    /**
     * 
     */
    @JsonProperty("rage")
    private Rage rage;
    /**
     * 
     */
    @JsonProperty("rune")
    private Rune rune;
    /**
     * 
     */
    @JsonProperty("runic_power")
    private RunicPower runicPower;
    /**
     * 
     */
    @JsonProperty("soul_shard")
    private SoulShard soulShard;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The astralPower
     */
    @JsonProperty("astral_power")
    public AstralPower getAstralPower() {
        return astralPower;
    }

    /**
     * 
     * @param astralPower
     *     The astral_power
     */
    @JsonProperty("astral_power")
    public void setAstralPower(AstralPower astralPower) {
        this.astralPower = astralPower;
    }

    /**
     * 
     * @return
     *     The chi
     */
    @JsonProperty("chi")
    public Chi getChi() {
        return chi;
    }

    /**
     * 
     * @param chi
     *     The chi
     */
    @JsonProperty("chi")
    public void setChi(Chi chi) {
        this.chi = chi;
    }

    /**
     * 
     * @return
     *     The comboPoints
     */
    @JsonProperty("combo_points")
    public ComboPoints getComboPoints() {
        return comboPoints;
    }

    /**
     * 
     * @param comboPoints
     *     The combo_points
     */
    @JsonProperty("combo_points")
    public void setComboPoints(ComboPoints comboPoints) {
        this.comboPoints = comboPoints;
    }

    /**
     * 
     * @return
     *     The energy
     */
    @JsonProperty("energy")
    public Energy getEnergy() {
        return energy;
    }

    /**
     * 
     * @param energy
     *     The energy
     */
    @JsonProperty("energy")
    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    /**
     * 
     * @return
     *     The focus
     */
    @JsonProperty("focus")
    public Focus getFocus() {
        return focus;
    }

    /**
     * 
     * @param focus
     *     The focus
     */
    @JsonProperty("focus")
    public void setFocus(Focus focus) {
        this.focus = focus;
    }

    /**
     * 
     * @return
     *     The fury
     */
    @JsonProperty("fury")
    public Fury getFury() {
        return fury;
    }

    /**
     * 
     * @param fury
     *     The fury
     */
    @JsonProperty("fury")
    public void setFury(Fury fury) {
        this.fury = fury;
    }

    /**
     * 
     * @return
     *     The health
     */
    @JsonProperty("health")
    public Health getHealth() {
        return health;
    }

    /**
     * 
     * @param health
     *     The health
     */
    @JsonProperty("health")
    public void setHealth(Health health) {
        this.health = health;
    }

    /**
     * 
     * @return
     *     The holyPower
     */
    @JsonProperty("holy_power")
    public HolyPower getHolyPower() {
        return holyPower;
    }

    /**
     * 
     * @param holyPower
     *     The holy_power
     */
    @JsonProperty("holy_power")
    public void setHolyPower(HolyPower holyPower) {
        this.holyPower = holyPower;
    }

    /**
     * 
     * @return
     *     The insanity
     */
    @JsonProperty("insanity")
    public Insanity getInsanity() {
        return insanity;
    }

    /**
     * 
     * @param insanity
     *     The insanity
     */
    @JsonProperty("insanity")
    public void setInsanity(Insanity insanity) {
        this.insanity = insanity;
    }

    /**
     * 
     * @return
     *     The maelstrom
     */
    @JsonProperty("maelstrom")
    public Maelstrom getMaelstrom() {
        return maelstrom;
    }

    /**
     * 
     * @param maelstrom
     *     The maelstrom
     */
    @JsonProperty("maelstrom")
    public void setMaelstrom(Maelstrom maelstrom) {
        this.maelstrom = maelstrom;
    }

    /**
     * 
     * @return
     *     The mana
     */
    @JsonProperty("mana")
    public Mana getMana() {
        return mana;
    }

    /**
     * 
     * @param mana
     *     The mana
     */
    @JsonProperty("mana")
    public void setMana(Mana mana) {
        this.mana = mana;
    }

    /**
     * 
     * @return
     *     The none
     */
    @JsonProperty("none")
    public None getNone() {
        return none;
    }

    /**
     * 
     * @param none
     *     The none
     */
    @JsonProperty("none")
    public void setNone(None none) {
        this.none = none;
    }

    /**
     * 
     * @return
     *     The pain
     */
    @JsonProperty("pain")
    public Pain getPain() {
        return pain;
    }

    /**
     * 
     * @param pain
     *     The pain
     */
    @JsonProperty("pain")
    public void setPain(Pain pain) {
        this.pain = pain;
    }

    /**
     * 
     * @return
     *     The rage
     */
    @JsonProperty("rage")
    public Rage getRage() {
        return rage;
    }

    /**
     * 
     * @param rage
     *     The rage
     */
    @JsonProperty("rage")
    public void setRage(Rage rage) {
        this.rage = rage;
    }

    /**
     * 
     * @return
     *     The rune
     */
    @JsonProperty("rune")
    public Rune getRune() {
        return rune;
    }

    /**
     * 
     * @param rune
     *     The rune
     */
    @JsonProperty("rune")
    public void setRune(Rune rune) {
        this.rune = rune;
    }

    /**
     * 
     * @return
     *     The runicPower
     */
    @JsonProperty("runic_power")
    public RunicPower getRunicPower() {
        return runicPower;
    }

    /**
     * 
     * @param runicPower
     *     The runic_power
     */
    @JsonProperty("runic_power")
    public void setRunicPower(RunicPower runicPower) {
        this.runicPower = runicPower;
    }

    /**
     * 
     * @return
     *     The soulShard
     */
    @JsonProperty("soul_shard")
    public SoulShard getSoulShard() {
        return soulShard;
    }

    /**
     * 
     * @param soulShard
     *     The soul_shard
     */
    @JsonProperty("soul_shard")
    public void setSoulShard(SoulShard soulShard) {
        this.soulShard = soulShard;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(astralPower).append(chi).append(comboPoints).append(energy).append(focus).append(fury).append(health).append(holyPower).append(insanity).append(maelstrom).append(mana).append(none).append(pain).append(rage).append(rune).append(runicPower).append(soulShard).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceLost) == false) {
            return false;
        }
        ResourceLost rhs = ((ResourceLost) other);
        return new EqualsBuilder().append(astralPower, rhs.astralPower).append(chi, rhs.chi).append(comboPoints, rhs.comboPoints).append(energy, rhs.energy).append(focus, rhs.focus).append(fury, rhs.fury).append(health, rhs.health).append(holyPower, rhs.holyPower).append(insanity, rhs.insanity).append(maelstrom, rhs.maelstrom).append(mana, rhs.mana).append(none, rhs.none).append(pain, rhs.pain).append(rage, rhs.rage).append(rune, rhs.rune).append(runicPower, rhs.runicPower).append(soulShard, rhs.soulShard).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
