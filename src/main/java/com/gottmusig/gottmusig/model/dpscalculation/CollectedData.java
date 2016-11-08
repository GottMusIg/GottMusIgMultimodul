
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
public class CollectedData {

    /**
     * 
     */
    @JsonProperty("absorb_taken")
    private AbsorbTaken absorbTaken;
    /**
     * 
     */
    @JsonProperty("absorb")
    private Absorb absorb;
    /**
     * 
     */
    @JsonProperty("action_sequence_precombat")
    private List<Object> actionSequencePrecombat = new ArrayList<Object>();
    /**
     * 
     */
    @JsonProperty("action_sequence")
    private List<ActionSequence> actionSequence = new ArrayList<ActionSequence>();
    /**
     * 
     */
    @JsonProperty("aps")
    private Aps aps;
    /**
     * 
     */
    @JsonProperty("atps")
    private Atps atps;
    /**
     * 
     */
    @JsonProperty("buffed_stats_snapshot")
    private BuffedStatsSnapshot buffedStatsSnapshot;
    /**
     * 
     */
    @JsonProperty("combat_end_resource")
    private CombatEndResource combatEndResource;
    /**
     * 
     */
    @JsonProperty("compound_absorb")
    private CompoundAbsorb compoundAbsorb;
    /**
     * 
     */
    @JsonProperty("compound_dmg")
    private CompoundDmg compoundDmg;
    /**
     * 
     */
    @JsonProperty("compound_heal")
    private CompoundHeal compoundHeal;
    /**
     * 
     */
    @JsonProperty("deaths")
    private Deaths deaths;
    /**
     * 
     */
    @JsonProperty("dmg_taken")
    private DmgTaken dmgTaken;
    /**
     * 
     */
    @JsonProperty("dmg")
    private Dmg dmg;
    /**
     * 
     */
    @JsonProperty("dps")
    private Dps dps;
    /**
     * 
     */
    @JsonProperty("dpse")
    private Dpse dpse;
    /**
     * 
     */
    @JsonProperty("dtps")
    private Dtps dtps;
    /**
     * 
     */
    @JsonProperty("effective_theck_meloree_index")
    private EffectiveTheckMeloreeIndex effectiveTheckMeloreeIndex;
    /**
     * 
     */
    @JsonProperty("executed_foreground_actions")
    private ExecutedForegroundActions executedForegroundActions;
    /**
     * 
     */
    @JsonProperty("fight_length")
    private FightLength fightLength;
    /**
     * 
     */
    @JsonProperty("heal_taken")
    private HealTaken healTaken;
    /**
     * 
     */
    @JsonProperty("heal")
    private Heal heal;
    /**
     * 
     */
    @JsonProperty("health_changes")
    private HealthChanges healthChanges;
    /**
     * 
     */
    @JsonProperty("hps")
    private Hps hps;
    /**
     * 
     */
    @JsonProperty("hpse")
    private Hpse hpse;
    /**
     * 
     */
    @JsonProperty("htps")
    private Htps htps;
    /**
     * 
     */
    @JsonProperty("max_spike_amount")
    private MaxSpikeAmount maxSpikeAmount;
    /**
     * 
     */
    @JsonProperty("prioritydps")
    private Prioritydps prioritydps;
    /**
     * 
     */
    @JsonProperty("resource_lost")
    private ResourceLost resourceLost;
    /**
     * 
     */
    @JsonProperty("resource_timelines")
    private List<ResourceTimeline> resourceTimelines = new ArrayList<ResourceTimeline>();
    /**
     * 
     */
    @JsonProperty("target_metric")
    private TargetMetric targetMetric;
    /**
     * 
     */
    @JsonProperty("theck_meloree_index")
    private TheckMeloreeIndex theckMeloreeIndex;
    /**
     * 
     */
    @JsonProperty("timeline_dmg_taken")
    private TimelineDmgTaken timelineDmgTaken;
    /**
     * 
     */
    @JsonProperty("timeline_dmg")
    private TimelineDmg timelineDmg;
    /**
     * 
     */
    @JsonProperty("timeline_healing_taken")
    private TimelineHealingTaken timelineHealingTaken;
    /**
     * 
     */
    @JsonProperty("waiting_time")
    private WaitingTime waitingTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The absorbTaken
     */
    @JsonProperty("absorb_taken")
    public AbsorbTaken getAbsorbTaken() {
        return absorbTaken;
    }

    /**
     * 
     * @param absorbTaken
     *     The absorb_taken
     */
    @JsonProperty("absorb_taken")
    public void setAbsorbTaken(AbsorbTaken absorbTaken) {
        this.absorbTaken = absorbTaken;
    }

    /**
     * 
     * @return
     *     The absorb
     */
    @JsonProperty("absorb")
    public Absorb getAbsorb() {
        return absorb;
    }

    /**
     * 
     * @param absorb
     *     The absorb
     */
    @JsonProperty("absorb")
    public void setAbsorb(Absorb absorb) {
        this.absorb = absorb;
    }

    /**
     * 
     * @return
     *     The actionSequencePrecombat
     */
    @JsonProperty("action_sequence_precombat")
    public List<Object> getActionSequencePrecombat() {
        return actionSequencePrecombat;
    }

    /**
     * 
     * @param actionSequencePrecombat
     *     The action_sequence_precombat
     */
    @JsonProperty("action_sequence_precombat")
    public void setActionSequencePrecombat(List<Object> actionSequencePrecombat) {
        this.actionSequencePrecombat = actionSequencePrecombat;
    }

    /**
     * 
     * @return
     *     The actionSequence
     */
    @JsonProperty("action_sequence")
    public List<ActionSequence> getActionSequence() {
        return actionSequence;
    }

    /**
     * 
     * @param actionSequence
     *     The action_sequence
     */
    @JsonProperty("action_sequence")
    public void setActionSequence(List<ActionSequence> actionSequence) {
        this.actionSequence = actionSequence;
    }

    /**
     * 
     * @return
     *     The aps
     */
    @JsonProperty("aps")
    public Aps getAps() {
        return aps;
    }

    /**
     * 
     * @param aps
     *     The aps
     */
    @JsonProperty("aps")
    public void setAps(Aps aps) {
        this.aps = aps;
    }

    /**
     * 
     * @return
     *     The atps
     */
    @JsonProperty("atps")
    public Atps getAtps() {
        return atps;
    }

    /**
     * 
     * @param atps
     *     The atps
     */
    @JsonProperty("atps")
    public void setAtps(Atps atps) {
        this.atps = atps;
    }

    /**
     * 
     * @return
     *     The buffedStatsSnapshot
     */
    @JsonProperty("buffed_stats_snapshot")
    public BuffedStatsSnapshot getBuffedStatsSnapshot() {
        return buffedStatsSnapshot;
    }

    /**
     * 
     * @param buffedStatsSnapshot
     *     The buffed_stats_snapshot
     */
    @JsonProperty("buffed_stats_snapshot")
    public void setBuffedStatsSnapshot(BuffedStatsSnapshot buffedStatsSnapshot) {
        this.buffedStatsSnapshot = buffedStatsSnapshot;
    }

    /**
     * 
     * @return
     *     The combatEndResource
     */
    @JsonProperty("combat_end_resource")
    public CombatEndResource getCombatEndResource() {
        return combatEndResource;
    }

    /**
     * 
     * @param combatEndResource
     *     The combat_end_resource
     */
    @JsonProperty("combat_end_resource")
    public void setCombatEndResource(CombatEndResource combatEndResource) {
        this.combatEndResource = combatEndResource;
    }

    /**
     * 
     * @return
     *     The compoundAbsorb
     */
    @JsonProperty("compound_absorb")
    public CompoundAbsorb getCompoundAbsorb() {
        return compoundAbsorb;
    }

    /**
     * 
     * @param compoundAbsorb
     *     The compound_absorb
     */
    @JsonProperty("compound_absorb")
    public void setCompoundAbsorb(CompoundAbsorb compoundAbsorb) {
        this.compoundAbsorb = compoundAbsorb;
    }

    /**
     * 
     * @return
     *     The compoundDmg
     */
    @JsonProperty("compound_dmg")
    public CompoundDmg getCompoundDmg() {
        return compoundDmg;
    }

    /**
     * 
     * @param compoundDmg
     *     The compound_dmg
     */
    @JsonProperty("compound_dmg")
    public void setCompoundDmg(CompoundDmg compoundDmg) {
        this.compoundDmg = compoundDmg;
    }

    /**
     * 
     * @return
     *     The compoundHeal
     */
    @JsonProperty("compound_heal")
    public CompoundHeal getCompoundHeal() {
        return compoundHeal;
    }

    /**
     * 
     * @param compoundHeal
     *     The compound_heal
     */
    @JsonProperty("compound_heal")
    public void setCompoundHeal(CompoundHeal compoundHeal) {
        this.compoundHeal = compoundHeal;
    }

    /**
     * 
     * @return
     *     The deaths
     */
    @JsonProperty("deaths")
    public Deaths getDeaths() {
        return deaths;
    }

    /**
     * 
     * @param deaths
     *     The deaths
     */
    @JsonProperty("deaths")
    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    /**
     * 
     * @return
     *     The dmgTaken
     */
    @JsonProperty("dmg_taken")
    public DmgTaken getDmgTaken() {
        return dmgTaken;
    }

    /**
     * 
     * @param dmgTaken
     *     The dmg_taken
     */
    @JsonProperty("dmg_taken")
    public void setDmgTaken(DmgTaken dmgTaken) {
        this.dmgTaken = dmgTaken;
    }

    /**
     * 
     * @return
     *     The dmg
     */
    @JsonProperty("dmg")
    public Dmg getDmg() {
        return dmg;
    }

    /**
     * 
     * @param dmg
     *     The dmg
     */
    @JsonProperty("dmg")
    public void setDmg(Dmg dmg) {
        this.dmg = dmg;
    }

    /**
     * 
     * @return
     *     The dps
     */
    @JsonProperty("dps")
    public Dps getDps() {
        return dps;
    }

    /**
     * 
     * @param dps
     *     The dps
     */
    @JsonProperty("dps")
    public void setDps(Dps dps) {
        this.dps = dps;
    }

    /**
     * 
     * @return
     *     The dpse
     */
    @JsonProperty("dpse")
    public Dpse getDpse() {
        return dpse;
    }

    /**
     * 
     * @param dpse
     *     The dpse
     */
    @JsonProperty("dpse")
    public void setDpse(Dpse dpse) {
        this.dpse = dpse;
    }

    /**
     * 
     * @return
     *     The dtps
     */
    @JsonProperty("dtps")
    public Dtps getDtps() {
        return dtps;
    }

    /**
     * 
     * @param dtps
     *     The dtps
     */
    @JsonProperty("dtps")
    public void setDtps(Dtps dtps) {
        this.dtps = dtps;
    }

    /**
     * 
     * @return
     *     The effectiveTheckMeloreeIndex
     */
    @JsonProperty("effective_theck_meloree_index")
    public EffectiveTheckMeloreeIndex getEffectiveTheckMeloreeIndex() {
        return effectiveTheckMeloreeIndex;
    }

    /**
     * 
     * @param effectiveTheckMeloreeIndex
     *     The effective_theck_meloree_index
     */
    @JsonProperty("effective_theck_meloree_index")
    public void setEffectiveTheckMeloreeIndex(EffectiveTheckMeloreeIndex effectiveTheckMeloreeIndex) {
        this.effectiveTheckMeloreeIndex = effectiveTheckMeloreeIndex;
    }

    /**
     * 
     * @return
     *     The executedForegroundActions
     */
    @JsonProperty("executed_foreground_actions")
    public ExecutedForegroundActions getExecutedForegroundActions() {
        return executedForegroundActions;
    }

    /**
     * 
     * @param executedForegroundActions
     *     The executed_foreground_actions
     */
    @JsonProperty("executed_foreground_actions")
    public void setExecutedForegroundActions(ExecutedForegroundActions executedForegroundActions) {
        this.executedForegroundActions = executedForegroundActions;
    }

    /**
     * 
     * @return
     *     The fightLength
     */
    @JsonProperty("fight_length")
    public FightLength getFightLength() {
        return fightLength;
    }

    /**
     * 
     * @param fightLength
     *     The fight_length
     */
    @JsonProperty("fight_length")
    public void setFightLength(FightLength fightLength) {
        this.fightLength = fightLength;
    }

    /**
     * 
     * @return
     *     The healTaken
     */
    @JsonProperty("heal_taken")
    public HealTaken getHealTaken() {
        return healTaken;
    }

    /**
     * 
     * @param healTaken
     *     The heal_taken
     */
    @JsonProperty("heal_taken")
    public void setHealTaken(HealTaken healTaken) {
        this.healTaken = healTaken;
    }

    /**
     * 
     * @return
     *     The heal
     */
    @JsonProperty("heal")
    public Heal getHeal() {
        return heal;
    }

    /**
     * 
     * @param heal
     *     The heal
     */
    @JsonProperty("heal")
    public void setHeal(Heal heal) {
        this.heal = heal;
    }

    /**
     * 
     * @return
     *     The healthChanges
     */
    @JsonProperty("health_changes")
    public HealthChanges getHealthChanges() {
        return healthChanges;
    }

    /**
     * 
     * @param healthChanges
     *     The health_changes
     */
    @JsonProperty("health_changes")
    public void setHealthChanges(HealthChanges healthChanges) {
        this.healthChanges = healthChanges;
    }

    /**
     * 
     * @return
     *     The hps
     */
    @JsonProperty("hps")
    public Hps getHps() {
        return hps;
    }

    /**
     * 
     * @param hps
     *     The hps
     */
    @JsonProperty("hps")
    public void setHps(Hps hps) {
        this.hps = hps;
    }

    /**
     * 
     * @return
     *     The hpse
     */
    @JsonProperty("hpse")
    public Hpse getHpse() {
        return hpse;
    }

    /**
     * 
     * @param hpse
     *     The hpse
     */
    @JsonProperty("hpse")
    public void setHpse(Hpse hpse) {
        this.hpse = hpse;
    }

    /**
     * 
     * @return
     *     The htps
     */
    @JsonProperty("htps")
    public Htps getHtps() {
        return htps;
    }

    /**
     * 
     * @param htps
     *     The htps
     */
    @JsonProperty("htps")
    public void setHtps(Htps htps) {
        this.htps = htps;
    }

    /**
     * 
     * @return
     *     The maxSpikeAmount
     */
    @JsonProperty("max_spike_amount")
    public MaxSpikeAmount getMaxSpikeAmount() {
        return maxSpikeAmount;
    }

    /**
     * 
     * @param maxSpikeAmount
     *     The max_spike_amount
     */
    @JsonProperty("max_spike_amount")
    public void setMaxSpikeAmount(MaxSpikeAmount maxSpikeAmount) {
        this.maxSpikeAmount = maxSpikeAmount;
    }

    /**
     * 
     * @return
     *     The prioritydps
     */
    @JsonProperty("prioritydps")
    public Prioritydps getPrioritydps() {
        return prioritydps;
    }

    /**
     * 
     * @param prioritydps
     *     The prioritydps
     */
    @JsonProperty("prioritydps")
    public void setPrioritydps(Prioritydps prioritydps) {
        this.prioritydps = prioritydps;
    }

    /**
     * 
     * @return
     *     The resourceLost
     */
    @JsonProperty("resource_lost")
    public ResourceLost getResourceLost() {
        return resourceLost;
    }

    /**
     * 
     * @param resourceLost
     *     The resource_lost
     */
    @JsonProperty("resource_lost")
    public void setResourceLost(ResourceLost resourceLost) {
        this.resourceLost = resourceLost;
    }

    /**
     * 
     * @return
     *     The resourceTimelines
     */
    @JsonProperty("resource_timelines")
    public List<ResourceTimeline> getResourceTimelines() {
        return resourceTimelines;
    }

    /**
     * 
     * @param resourceTimelines
     *     The resource_timelines
     */
    @JsonProperty("resource_timelines")
    public void setResourceTimelines(List<ResourceTimeline> resourceTimelines) {
        this.resourceTimelines = resourceTimelines;
    }

    /**
     * 
     * @return
     *     The targetMetric
     */
    @JsonProperty("target_metric")
    public TargetMetric getTargetMetric() {
        return targetMetric;
    }

    /**
     * 
     * @param targetMetric
     *     The target_metric
     */
    @JsonProperty("target_metric")
    public void setTargetMetric(TargetMetric targetMetric) {
        this.targetMetric = targetMetric;
    }

    /**
     * 
     * @return
     *     The theckMeloreeIndex
     */
    @JsonProperty("theck_meloree_index")
    public TheckMeloreeIndex getTheckMeloreeIndex() {
        return theckMeloreeIndex;
    }

    /**
     * 
     * @param theckMeloreeIndex
     *     The theck_meloree_index
     */
    @JsonProperty("theck_meloree_index")
    public void setTheckMeloreeIndex(TheckMeloreeIndex theckMeloreeIndex) {
        this.theckMeloreeIndex = theckMeloreeIndex;
    }

    /**
     * 
     * @return
     *     The timelineDmgTaken
     */
    @JsonProperty("timeline_dmg_taken")
    public TimelineDmgTaken getTimelineDmgTaken() {
        return timelineDmgTaken;
    }

    /**
     * 
     * @param timelineDmgTaken
     *     The timeline_dmg_taken
     */
    @JsonProperty("timeline_dmg_taken")
    public void setTimelineDmgTaken(TimelineDmgTaken timelineDmgTaken) {
        this.timelineDmgTaken = timelineDmgTaken;
    }

    /**
     * 
     * @return
     *     The timelineDmg
     */
    @JsonProperty("timeline_dmg")
    public TimelineDmg getTimelineDmg() {
        return timelineDmg;
    }

    /**
     * 
     * @param timelineDmg
     *     The timeline_dmg
     */
    @JsonProperty("timeline_dmg")
    public void setTimelineDmg(TimelineDmg timelineDmg) {
        this.timelineDmg = timelineDmg;
    }

    /**
     * 
     * @return
     *     The timelineHealingTaken
     */
    @JsonProperty("timeline_healing_taken")
    public TimelineHealingTaken getTimelineHealingTaken() {
        return timelineHealingTaken;
    }

    /**
     * 
     * @param timelineHealingTaken
     *     The timeline_healing_taken
     */
    @JsonProperty("timeline_healing_taken")
    public void setTimelineHealingTaken(TimelineHealingTaken timelineHealingTaken) {
        this.timelineHealingTaken = timelineHealingTaken;
    }

    /**
     * 
     * @return
     *     The waitingTime
     */
    @JsonProperty("waiting_time")
    public WaitingTime getWaitingTime() {
        return waitingTime;
    }

    /**
     * 
     * @param waitingTime
     *     The waiting_time
     */
    @JsonProperty("waiting_time")
    public void setWaitingTime(WaitingTime waitingTime) {
        this.waitingTime = waitingTime;
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
        return new HashCodeBuilder().append(absorbTaken).append(absorb).append(actionSequencePrecombat).append(actionSequence).append(aps).append(atps).append(buffedStatsSnapshot).append(combatEndResource).append(compoundAbsorb).append(compoundDmg).append(compoundHeal).append(deaths).append(dmgTaken).append(dmg).append(dps).append(dpse).append(dtps).append(effectiveTheckMeloreeIndex).append(executedForegroundActions).append(fightLength).append(healTaken).append(heal).append(healthChanges).append(hps).append(hpse).append(htps).append(maxSpikeAmount).append(prioritydps).append(resourceLost).append(resourceTimelines).append(targetMetric).append(theckMeloreeIndex).append(timelineDmgTaken).append(timelineDmg).append(timelineHealingTaken).append(waitingTime).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CollectedData) == false) {
            return false;
        }
        CollectedData rhs = ((CollectedData) other);
        return new EqualsBuilder().append(absorbTaken, rhs.absorbTaken).append(absorb, rhs.absorb).append(actionSequencePrecombat, rhs.actionSequencePrecombat).append(actionSequence, rhs.actionSequence).append(aps, rhs.aps).append(atps, rhs.atps).append(buffedStatsSnapshot, rhs.buffedStatsSnapshot).append(combatEndResource, rhs.combatEndResource).append(compoundAbsorb, rhs.compoundAbsorb).append(compoundDmg, rhs.compoundDmg).append(compoundHeal, rhs.compoundHeal).append(deaths, rhs.deaths).append(dmgTaken, rhs.dmgTaken).append(dmg, rhs.dmg).append(dps, rhs.dps).append(dpse, rhs.dpse).append(dtps, rhs.dtps).append(effectiveTheckMeloreeIndex, rhs.effectiveTheckMeloreeIndex).append(executedForegroundActions, rhs.executedForegroundActions).append(fightLength, rhs.fightLength).append(healTaken, rhs.healTaken).append(heal, rhs.heal).append(healthChanges, rhs.healthChanges).append(hps, rhs.hps).append(hpse, rhs.hpse).append(htps, rhs.htps).append(maxSpikeAmount, rhs.maxSpikeAmount).append(prioritydps, rhs.prioritydps).append(resourceLost, rhs.resourceLost).append(resourceTimelines, rhs.resourceTimelines).append(targetMetric, rhs.targetMetric).append(theckMeloreeIndex, rhs.theckMeloreeIndex).append(timelineDmgTaken, rhs.timelineDmgTaken).append(timelineDmg, rhs.timelineDmg).append(timelineHealingTaken, rhs.timelineHealingTaken).append(waitingTime, rhs.waitingTime).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
