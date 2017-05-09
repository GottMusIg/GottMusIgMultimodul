
package com.gottmusig.gottmusig.model.dpscalculation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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

@EqualsAndHashCode
@Getter
@ToString
public class BuffedStatsSnapshot implements Serializable {

    @JsonProperty("armor")
    private List<Double> armor = new ArrayList<Double>();

    @JsonProperty("attack_haste")
    private List<Double> attackHaste = new ArrayList<Double>();

    @JsonProperty("attack_hit")
    private List<Double> attackHit = new ArrayList<Double>();

    @JsonProperty("attack_power")
    private List<Double> attackPower = new ArrayList<Double>();

    @JsonProperty("attack_speed")
    private List<Double> attackSpeed = new ArrayList<Double>();

    @JsonProperty("attributes")
    private List<Attribute> attributes = new ArrayList<Attribute>();

    @JsonProperty("avoidance")
    private List<Double> avoidance = new ArrayList<Double>();

    @JsonProperty("block")
    private List<Double> block = new ArrayList<Double>();

    @JsonProperty("bonus_armor")
    private List<Double> bonusArmor = new ArrayList<Double>();

    @JsonProperty("crit")
    private List<Double> crit = new ArrayList<Double>();

    @JsonProperty("damage_versatility")
    private List<Double> damageVersatility = new ArrayList<Double>();

    @JsonProperty("dodge")
    private List<Double> dodge = new ArrayList<Double>();

    @JsonProperty("heal_versatility")
    private List<Double> healVersatility = new ArrayList<Double>();

    @JsonProperty("leech")
    private List<Double> leech = new ArrayList<Double>();

    @JsonProperty("manareg_per_second")
    private List<Double> manaregPerSecond = new ArrayList<Double>();

    @JsonProperty("mastery_value")
    private List<Double> masteryValue = new ArrayList<Double>();

    @JsonProperty("mh_attack_expertise")
    private List<Double> mhAttackExpertise = new ArrayList<Double>();

    @JsonProperty("miss")
    private List<Double> miss = new ArrayList<Double>();

    @JsonProperty("mitigation_versatility")
    private List<Double> mitigationVersatility = new ArrayList<Double>();

    @JsonProperty("oh_attack_expertise")
    private List<Double> ohAttackExpertise = new ArrayList<Double>();

    @JsonProperty("parry")
    private List<Double> parry = new ArrayList<Double>();

    @JsonProperty("resource_gained")
    private List<ResourceGained> resourceGained = new ArrayList<ResourceGained>();

    @JsonProperty("run_speed")
    private List<Double> runSpeed = new ArrayList<Double>();

    @JsonProperty("spell_crit")
    private List<Double> spellCrit = new ArrayList<Double>();

    @JsonProperty("spell_haste")
    private List<Double> spellHaste = new ArrayList<Double>();

    @JsonProperty("spell_hit")
    private List<Double> spellHit = new ArrayList<Double>();

    @JsonProperty("spell_power")
    private List<Double> spellPower = new ArrayList<Double>();

    @JsonProperty("spell_speed")
    private List<Double> spellSpeed = new ArrayList<Double>();
  
}
