
package com.gottmusig.gottmusig.model.dpscalculation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "armor",
    "attack_haste",
    "attack_hit",
    "attack_power",
    "attack_speed",
    "attributes",
    "avoidance",
    "block",
    "bonus_armor",
    "crit",
    "damage_versatility",
    "dodge",
    "heal_versatility",
    "leech",
    "manareg_per_second",
    "mastery_value",
    "mh_attack_expertise",
    "miss",
    "mitigation_versatility",
    "oh_attack_expertise",
    "parry",
    "resource_gained",
    "run_speed",
    "spell_crit",
    "spell_haste",
    "spell_hit",
    "spell_power",
    "spell_speed"
})
public class BuffedStatsSnapshot {

    /**
     * 
     */
    @JsonProperty("armor")
    private List<Double> armor = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("attack_haste")
    private List<Double> attackHaste = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("attack_hit")
    private List<Double> attackHit = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("attack_power")
    private List<Double> attackPower = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("attack_speed")
    private List<Double> attackSpeed = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("attributes")
    private List<Attribute> attributes = new ArrayList<Attribute>();
    /**
     * 
     */
    @JsonProperty("avoidance")
    private List<Double> avoidance = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("block")
    private List<Double> block = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("bonus_armor")
    private List<Double> bonusArmor = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("crit")
    private List<Double> crit = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("damage_versatility")
    private List<Double> damageVersatility = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("dodge")
    private List<Double> dodge = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("heal_versatility")
    private List<Double> healVersatility = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("leech")
    private List<Double> leech = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("manareg_per_second")
    private List<Double> manaregPerSecond = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("mastery_value")
    private List<Double> masteryValue = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("mh_attack_expertise")
    private List<Double> mhAttackExpertise = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("miss")
    private List<Double> miss = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("mitigation_versatility")
    private List<Double> mitigationVersatility = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("oh_attack_expertise")
    private List<Double> ohAttackExpertise = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("parry")
    private List<Double> parry = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("resource_gained")
    private List<ResourceGained> resourceGained = new ArrayList<ResourceGained>();
    /**
     * 
     */
    @JsonProperty("run_speed")
    private List<Double> runSpeed = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("spell_crit")
    private List<Double> spellCrit = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("spell_haste")
    private List<Double> spellHaste = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("spell_hit")
    private List<Double> spellHit = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("spell_power")
    private List<Double> spellPower = new ArrayList<Double>();
    /**
     * 
     */
    @JsonProperty("spell_speed")
    private List<Double> spellSpeed = new ArrayList<Double>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The armor
     */
    @JsonProperty("armor")
    public List<Double> getArmor() {
        return armor;
    }

    /**
     * 
     * @param armor
     *     The armor
     */
    @JsonProperty("armor")
    public void setArmor(List<Double> armor) {
        this.armor = armor;
    }

    /**
     * 
     * @return
     *     The attackHaste
     */
    @JsonProperty("attack_haste")
    public List<Double> getAttackHaste() {
        return attackHaste;
    }

    /**
     * 
     * @param attackHaste
     *     The attack_haste
     */
    @JsonProperty("attack_haste")
    public void setAttackHaste(List<Double> attackHaste) {
        this.attackHaste = attackHaste;
    }

    /**
     * 
     * @return
     *     The attackHit
     */
    @JsonProperty("attack_hit")
    public List<Double> getAttackHit() {
        return attackHit;
    }

    /**
     * 
     * @param attackHit
     *     The attack_hit
     */
    @JsonProperty("attack_hit")
    public void setAttackHit(List<Double> attackHit) {
        this.attackHit = attackHit;
    }

    /**
     * 
     * @return
     *     The attackPower
     */
    @JsonProperty("attack_power")
    public List<Double> getAttackPower() {
        return attackPower;
    }

    /**
     * 
     * @param attackPower
     *     The attack_power
     */
    @JsonProperty("attack_power")
    public void setAttackPower(List<Double> attackPower) {
        this.attackPower = attackPower;
    }

    /**
     * 
     * @return
     *     The attackSpeed
     */
    @JsonProperty("attack_speed")
    public List<Double> getAttackSpeed() {
        return attackSpeed;
    }

    /**
     * 
     * @param attackSpeed
     *     The attack_speed
     */
    @JsonProperty("attack_speed")
    public void setAttackSpeed(List<Double> attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    @JsonProperty("attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The avoidance
     */
    @JsonProperty("avoidance")
    public List<Double> getAvoidance() {
        return avoidance;
    }

    /**
     * 
     * @param avoidance
     *     The avoidance
     */
    @JsonProperty("avoidance")
    public void setAvoidance(List<Double> avoidance) {
        this.avoidance = avoidance;
    }

    /**
     * 
     * @return
     *     The block
     */
    @JsonProperty("block")
    public List<Double> getBlock() {
        return block;
    }

    /**
     * 
     * @param block
     *     The block
     */
    @JsonProperty("block")
    public void setBlock(List<Double> block) {
        this.block = block;
    }

    /**
     * 
     * @return
     *     The bonusArmor
     */
    @JsonProperty("bonus_armor")
    public List<Double> getBonusArmor() {
        return bonusArmor;
    }

    /**
     * 
     * @param bonusArmor
     *     The bonus_armor
     */
    @JsonProperty("bonus_armor")
    public void setBonusArmor(List<Double> bonusArmor) {
        this.bonusArmor = bonusArmor;
    }

    /**
     * 
     * @return
     *     The crit
     */
    @JsonProperty("crit")
    public List<Double> getCrit() {
        return crit;
    }

    /**
     * 
     * @param crit
     *     The crit
     */
    @JsonProperty("crit")
    public void setCrit(List<Double> crit) {
        this.crit = crit;
    }

    /**
     * 
     * @return
     *     The damageVersatility
     */
    @JsonProperty("damage_versatility")
    public List<Double> getDamageVersatility() {
        return damageVersatility;
    }

    /**
     * 
     * @param damageVersatility
     *     The damage_versatility
     */
    @JsonProperty("damage_versatility")
    public void setDamageVersatility(List<Double> damageVersatility) {
        this.damageVersatility = damageVersatility;
    }

    /**
     * 
     * @return
     *     The dodge
     */
    @JsonProperty("dodge")
    public List<Double> getDodge() {
        return dodge;
    }

    /**
     * 
     * @param dodge
     *     The dodge
     */
    @JsonProperty("dodge")
    public void setDodge(List<Double> dodge) {
        this.dodge = dodge;
    }

    /**
     * 
     * @return
     *     The healVersatility
     */
    @JsonProperty("heal_versatility")
    public List<Double> getHealVersatility() {
        return healVersatility;
    }

    /**
     * 
     * @param healVersatility
     *     The heal_versatility
     */
    @JsonProperty("heal_versatility")
    public void setHealVersatility(List<Double> healVersatility) {
        this.healVersatility = healVersatility;
    }

    /**
     * 
     * @return
     *     The leech
     */
    @JsonProperty("leech")
    public List<Double> getLeech() {
        return leech;
    }

    /**
     * 
     * @param leech
     *     The leech
     */
    @JsonProperty("leech")
    public void setLeech(List<Double> leech) {
        this.leech = leech;
    }

    /**
     * 
     * @return
     *     The manaregPerSecond
     */
    @JsonProperty("manareg_per_second")
    public List<Double> getManaregPerSecond() {
        return manaregPerSecond;
    }

    /**
     * 
     * @param manaregPerSecond
     *     The manareg_per_second
     */
    @JsonProperty("manareg_per_second")
    public void setManaregPerSecond(List<Double> manaregPerSecond) {
        this.manaregPerSecond = manaregPerSecond;
    }

    /**
     * 
     * @return
     *     The masteryValue
     */
    @JsonProperty("mastery_value")
    public List<Double> getMasteryValue() {
        return masteryValue;
    }

    /**
     * 
     * @param masteryValue
     *     The mastery_value
     */
    @JsonProperty("mastery_value")
    public void setMasteryValue(List<Double> masteryValue) {
        this.masteryValue = masteryValue;
    }

    /**
     * 
     * @return
     *     The mhAttackExpertise
     */
    @JsonProperty("mh_attack_expertise")
    public List<Double> getMhAttackExpertise() {
        return mhAttackExpertise;
    }

    /**
     * 
     * @param mhAttackExpertise
     *     The mh_attack_expertise
     */
    @JsonProperty("mh_attack_expertise")
    public void setMhAttackExpertise(List<Double> mhAttackExpertise) {
        this.mhAttackExpertise = mhAttackExpertise;
    }

    /**
     * 
     * @return
     *     The miss
     */
    @JsonProperty("miss")
    public List<Double> getMiss() {
        return miss;
    }

    /**
     * 
     * @param miss
     *     The miss
     */
    @JsonProperty("miss")
    public void setMiss(List<Double> miss) {
        this.miss = miss;
    }

    /**
     * 
     * @return
     *     The mitigationVersatility
     */
    @JsonProperty("mitigation_versatility")
    public List<Double> getMitigationVersatility() {
        return mitigationVersatility;
    }

    /**
     * 
     * @param mitigationVersatility
     *     The mitigation_versatility
     */
    @JsonProperty("mitigation_versatility")
    public void setMitigationVersatility(List<Double> mitigationVersatility) {
        this.mitigationVersatility = mitigationVersatility;
    }

    /**
     * 
     * @return
     *     The ohAttackExpertise
     */
    @JsonProperty("oh_attack_expertise")
    public List<Double> getOhAttackExpertise() {
        return ohAttackExpertise;
    }

    /**
     * 
     * @param ohAttackExpertise
     *     The oh_attack_expertise
     */
    @JsonProperty("oh_attack_expertise")
    public void setOhAttackExpertise(List<Double> ohAttackExpertise) {
        this.ohAttackExpertise = ohAttackExpertise;
    }

    /**
     * 
     * @return
     *     The parry
     */
    @JsonProperty("parry")
    public List<Double> getParry() {
        return parry;
    }

    /**
     * 
     * @param parry
     *     The parry
     */
    @JsonProperty("parry")
    public void setParry(List<Double> parry) {
        this.parry = parry;
    }

    /**
     * 
     * @return
     *     The resourceGained
     */
    @JsonProperty("resource_gained")
    public List<ResourceGained> getResourceGained() {
        return resourceGained;
    }

    /**
     * 
     * @param resourceGained
     *     The resource_gained
     */
    @JsonProperty("resource_gained")
    public void setResourceGained(List<ResourceGained> resourceGained) {
        this.resourceGained = resourceGained;
    }

    /**
     * 
     * @return
     *     The runSpeed
     */
    @JsonProperty("run_speed")
    public List<Double> getRunSpeed() {
        return runSpeed;
    }

    /**
     * 
     * @param runSpeed
     *     The run_speed
     */
    @JsonProperty("run_speed")
    public void setRunSpeed(List<Double> runSpeed) {
        this.runSpeed = runSpeed;
    }

    /**
     * 
     * @return
     *     The spellCrit
     */
    @JsonProperty("spell_crit")
    public List<Double> getSpellCrit() {
        return spellCrit;
    }

    /**
     * 
     * @param spellCrit
     *     The spell_crit
     */
    @JsonProperty("spell_crit")
    public void setSpellCrit(List<Double> spellCrit) {
        this.spellCrit = spellCrit;
    }

    /**
     * 
     * @return
     *     The spellHaste
     */
    @JsonProperty("spell_haste")
    public List<Double> getSpellHaste() {
        return spellHaste;
    }

    /**
     * 
     * @param spellHaste
     *     The spell_haste
     */
    @JsonProperty("spell_haste")
    public void setSpellHaste(List<Double> spellHaste) {
        this.spellHaste = spellHaste;
    }

    /**
     * 
     * @return
     *     The spellHit
     */
    @JsonProperty("spell_hit")
    public List<Double> getSpellHit() {
        return spellHit;
    }

    /**
     * 
     * @param spellHit
     *     The spell_hit
     */
    @JsonProperty("spell_hit")
    public void setSpellHit(List<Double> spellHit) {
        this.spellHit = spellHit;
    }

    /**
     * 
     * @return
     *     The spellPower
     */
    @JsonProperty("spell_power")
    public List<Double> getSpellPower() {
        return spellPower;
    }

    /**
     * 
     * @param spellPower
     *     The spell_power
     */
    @JsonProperty("spell_power")
    public void setSpellPower(List<Double> spellPower) {
        this.spellPower = spellPower;
    }

    /**
     * 
     * @return
     *     The spellSpeed
     */
    @JsonProperty("spell_speed")
    public List<Double> getSpellSpeed() {
        return spellSpeed;
    }

    /**
     * 
     * @param spellSpeed
     *     The spell_speed
     */
    @JsonProperty("spell_speed")
    public void setSpellSpeed(List<Double> spellSpeed) {
        this.spellSpeed = spellSpeed;
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
        return new HashCodeBuilder().append(armor).append(attackHaste).append(attackHit).append(attackPower).append(attackSpeed).append(attributes).append(avoidance).append(block).append(bonusArmor).append(crit).append(damageVersatility).append(dodge).append(healVersatility).append(leech).append(manaregPerSecond).append(masteryValue).append(mhAttackExpertise).append(miss).append(mitigationVersatility).append(ohAttackExpertise).append(parry).append(resourceGained).append(runSpeed).append(spellCrit).append(spellHaste).append(spellHit).append(spellPower).append(spellSpeed).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuffedStatsSnapshot) == false) {
            return false;
        }
        BuffedStatsSnapshot rhs = ((BuffedStatsSnapshot) other);
        return new EqualsBuilder().append(armor, rhs.armor).append(attackHaste, rhs.attackHaste).append(attackHit, rhs.attackHit).append(attackPower, rhs.attackPower).append(attackSpeed, rhs.attackSpeed).append(attributes, rhs.attributes).append(avoidance, rhs.avoidance).append(block, rhs.block).append(bonusArmor, rhs.bonusArmor).append(crit, rhs.crit).append(damageVersatility, rhs.damageVersatility).append(dodge, rhs.dodge).append(healVersatility, rhs.healVersatility).append(leech, rhs.leech).append(manaregPerSecond, rhs.manaregPerSecond).append(masteryValue, rhs.masteryValue).append(mhAttackExpertise, rhs.mhAttackExpertise).append(miss, rhs.miss).append(mitigationVersatility, rhs.mitigationVersatility).append(ohAttackExpertise, rhs.ohAttackExpertise).append(parry, rhs.parry).append(resourceGained, rhs.resourceGained).append(runSpeed, rhs.runSpeed).append(spellCrit, rhs.spellCrit).append(spellHaste, rhs.spellHaste).append(spellHit, rhs.spellHit).append(spellPower, rhs.spellPower).append(spellSpeed, rhs.spellSpeed).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
