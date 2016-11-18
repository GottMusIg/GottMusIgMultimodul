
package com.gottmusig.gottmusig.model.dpscalculation;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "absorb_taken",
    "absorb",
    "action_sequence_precombat",
    "action_sequence",
    "aps",
    "atps",
    "buffed_stats_snapshot",
    "combat_end_resource",
    "compound_absorb",
    "compound_dmg",
    "compound_heal",
    "deaths",
    "dmg_taken",
    "dmg",
    "dps",
    "dpse",
    "dtps",
    "effective_theck_meloree_index",
    "executed_foreground_actions",
    "fight_length",
    "heal_taken",
    "heal",
    "health_changes",
    "hps",
    "hpse",
    "htps",
    "max_spike_amount",
    "prioritydps",
    "resource_lost",
    "resource_timelines",
    "target_metric",
    "theck_meloree_index",
    "timeline_dmg_taken",
    "timeline_dmg",
    "timeline_healing_taken",
    "waiting_time"
})

@EqualsAndHashCode
@Getter
@ToString
public class CollectedData {

    @JsonProperty("absorb_taken")
    private AbsorbTaken absorbTaken;

    @JsonProperty("absorb")
    private Absorb absorb;

    @JsonProperty("action_sequence_precombat")
    private List<Object> actionSequencePrecombat = new ArrayList<Object>();

    @JsonProperty("action_sequence")
    private List<ActionSequence> actionSequence = new ArrayList<ActionSequence>();

    @JsonProperty("aps")
    private Aps aps;

    @JsonProperty("atps")
    private Atps atps;

    @JsonProperty("buffed_stats_snapshot")
    private BuffedStatsSnapshot buffedStatsSnapshot;

    @JsonProperty("combat_end_resource")
    private CombatEndResource combatEndResource;

    @JsonProperty("compound_absorb")
    private CompoundAbsorb compoundAbsorb;

    @JsonProperty("compound_dmg")
    private CompoundDmg compoundDmg;

    @JsonProperty("compound_heal")
    private CompoundHeal compoundHeal;

    @JsonProperty("deaths")
    private Deaths deaths;

    @JsonProperty("dmg_taken")
    private DmgTaken dmgTaken;

    @JsonProperty("dmg")
    private Dmg dmg;

    @JsonProperty("dps")
    private Dps dps;

    @JsonProperty("dpse")
    private Dpse dpse;

    @JsonProperty("dtps")
    private Dtps dtps;

    @JsonProperty("effective_theck_meloree_index")
    private EffectiveTheckMeloreeIndex effectiveTheckMeloreeIndex;

    @JsonProperty("executed_foreground_actions")
    private ExecutedForegroundActions executedForegroundActions;
    
    @JsonProperty("fight_length")
    private FightLength fightLength;
    
    @JsonProperty("heal_taken")
    private HealTaken healTaken;
    
    @JsonProperty("heal")
    private Heal heal;
    
    @JsonProperty("health_changes")
    private HealthChanges healthChanges;
    
    @JsonProperty("hps")
    private Hps hps;
    
    @JsonProperty("hpse")
    private Hpse hpse;
    
    @JsonProperty("htps")
    private Htps htps;
    
    @JsonProperty("max_spike_amount")
    private MaxSpikeAmount maxSpikeAmount;

    @JsonProperty("prioritydps")
    private Prioritydps prioritydps;

    @JsonProperty("resource_lost")
    private ResourceLost resourceLost;
    
    @JsonProperty("resource_timelines")
    private List<ResourceTimeline> resourceTimelines = new ArrayList<ResourceTimeline>();
    
    @JsonProperty("target_metric")
    private TargetMetric targetMetric;
    
    @JsonProperty("theck_meloree_index")
    private TheckMeloreeIndex theckMeloreeIndex;
    
    @JsonProperty("timeline_dmg_taken")
    private TimelineDmgTaken timelineDmgTaken;
    
    @JsonProperty("timeline_dmg")
    private TimelineDmg timelineDmg;
    
    @JsonProperty("timeline_healing_taken")
    private TimelineHealingTaken timelineHealingTaken;
    
    @JsonProperty("waiting_time")
    private WaitingTime waitingTime;
 
}
