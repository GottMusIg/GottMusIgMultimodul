
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
    "auto_ready_trigger",
    "average_gauss",
    "average_range",
    "challenge_mode",
    "channel_lag_stddev",
    "channel_lag",
    "confidence_estimator",
    "confidence",
    "dbc",
    "debug_each",
    "debug",
    "default_aura_delay_stddev",
    "default_aura_delay",
    "default_skill",
    "deterministic",
    "elapsed_cpu",
    "elapsed_time",
    "enemy_death_pct",
    "expected_iteration_time",
    "fight_style",
    "fixed_time",
    "gcd_lag_stddev",
    "gcd_lag",
    "healing_players",
    "ignite_sampling_delta",
    "iterations",
    "log",
    "max_aoe_enemies",
    "max_time",
    "optimal_raid",
    "optimize_expressions",
    "overrides",
    "players",
    "plot",
    "pvp_crit",
    "queue_gcd_reduction",
    "queue_lag_stddev",
    "queue_lag",
    "raid_aps",
    "raid_dps",
    "raid_hps",
    "reaction_time",
    "reforge_plot",
    "regen_periodicity",
    "requires_regen_event",
    "rng_seed",
    "rng",
    "scaling",
    "show_etmi",
    "simulation_length",
    "stat_cache",
    "strict_gcd_queue",
    "target_error",
    "target",
    "tmi_bin_size",
    "tmi_window_global",
    "total_absorb",
    "total_dmg",
    "total_heal",
    "travel_variance",
    "vary_combat_length",
    "world_lag_stddev",
    "world_lag"
})
public class Sim {

    /**
     * 
     */
    @JsonProperty("auto_ready_trigger")
    private Double autoReadyTrigger;
    /**
     * 
     */
    @JsonProperty("average_gauss")
    private Double averageGauss;
    /**
     * 
     */
    @JsonProperty("average_range")
    private Double averageRange;
    /**
     * 
     */
    @JsonProperty("challenge_mode")
    private Boolean challengeMode;
    /**
     * 
     */
    @JsonProperty("channel_lag_stddev")
    private Double channelLagStddev;
    /**
     * 
     */
    @JsonProperty("channel_lag")
    private Double channelLag;
    /**
     * 
     */
    @JsonProperty("confidence_estimator")
    private Double confidenceEstimator;
    /**
     * 
     */
    @JsonProperty("confidence")
    private Double confidence;
    /**
     * 
     */
    @JsonProperty("dbc")
    private Dbc dbc;
    /**
     * 
     */
    @JsonProperty("debug_each")
    private Double debugEach;
    /**
     * 
     */
    @JsonProperty("debug")
    private Boolean debug;
    /**
     * 
     */
    @JsonProperty("default_aura_delay_stddev")
    private Double defaultAuraDelayStddev;
    /**
     * 
     */
    @JsonProperty("default_aura_delay")
    private Double defaultAuraDelay;
    /**
     * 
     */
    @JsonProperty("default_skill")
    private Double defaultSkill;
    /**
     * 
     */
    @JsonProperty("deterministic")
    private Double deterministic;
    /**
     * 
     */
    @JsonProperty("elapsed_cpu")
    private Double elapsedCpu;
    /**
     * 
     */
    @JsonProperty("elapsed_time")
    private Double elapsedTime;
    /**
     * 
     */
    @JsonProperty("enemy_death_pct")
    private Double enemyDeathPct;
    /**
     * 
     */
    @JsonProperty("expected_iteration_time")
    private Double expectedIterationTime;
    /**
     * 
     */
    @JsonProperty("fight_style")
    private String fightStyle;
    /**
     * 
     */
    @JsonProperty("fixed_time")
    private Boolean fixedTime;
    /**
     * 
     */
    @JsonProperty("gcd_lag_stddev")
    private Double gcdLagStddev;
    /**
     * 
     */
    @JsonProperty("gcd_lag")
    private Double gcdLag;
    /**
     * 
     */
    @JsonProperty("healing_players")
    private List<HealingPlayer> healingPlayers = new ArrayList<HealingPlayer>();
    /**
     * 
     */
    @JsonProperty("ignite_sampling_delta")
    private Double igniteSamplingDelta;
    /**
     * 
     */
    @JsonProperty("iterations")
    private Double iterations;
    /**
     * 
     */
    @JsonProperty("log")
    private Double log;
    /**
     * 
     */
    @JsonProperty("max_aoe_enemies")
    private Double maxAoeEnemies;
    /**
     * 
     */
    @JsonProperty("max_time")
    private Double maxTime;
    /**
     * 
     */
    @JsonProperty("optimal_raid")
    private Double optimalRaid;
    /**
     * 
     */
    @JsonProperty("optimize_expressions")
    private Boolean optimizeExpressions;
    /**
     * 
     */
    @JsonProperty("overrides")
    private Overrides overrides;
    /**
     * 
     */
    @JsonProperty("players")
    private List<Player> players = new ArrayList<Player>();
    /**
     * 
     */
    @JsonProperty("plot")
    private Plot plot;
    /**
     * 
     */
    @JsonProperty("pvp_crit")
    private Boolean pvpCrit;
    /**
     * 
     */
    @JsonProperty("queue_gcd_reduction")
    private Double queueGcdReduction;
    /**
     * 
     */
    @JsonProperty("queue_lag_stddev")
    private Double queueLagStddev;
    /**
     * 
     */
    @JsonProperty("queue_lag")
    private Double queueLag;
    /**
     * 
     */
    @JsonProperty("raid_aps")
    private RaidAps raidAps;
    /**
     * 
     */
    @JsonProperty("raid_dps")
    private RaidDps raidDps;
    /**
     * 
     */
    @JsonProperty("raid_hps")
    private RaidHps raidHps;
    /**
     * 
     */
    @JsonProperty("reaction_time")
    private Double reactionTime;
    /**
     * 
     */
    @JsonProperty("reforge_plot")
    private ReforgePlot reforgePlot;
    /**
     * 
     */
    @JsonProperty("regen_periodicity")
    private Double regenPeriodicity;
    /**
     * 
     */
    @JsonProperty("requires_regen_event")
    private Boolean requiresRegenEvent;
    /**
     * 
     */
    @JsonProperty("rng_seed")
    private Double rngSeed;
    /**
     * 
     */
    @JsonProperty("rng")
    private Rng rng;
    /**
     * 
     */
    @JsonProperty("scaling")
    private Scaling scaling;
    /**
     * 
     */
    @JsonProperty("show_etmi")
    private Boolean showEtmi;
    /**
     * 
     */
    @JsonProperty("simulation_length")
    private SimulationLength simulationLength;
    /**
     * 
     */
    @JsonProperty("stat_cache")
    private Double statCache;
    /**
     * 
     */
    @JsonProperty("strict_gcd_queue")
    private Double strictGcdQueue;
    /**
     * 
     */
    @JsonProperty("target_error")
    private Double targetError;
    /**
     * 
     */
    @JsonProperty("target")
    private List<Target> target = new ArrayList<Target>();
    /**
     * 
     */
    @JsonProperty("tmi_bin_size")
    private Double tmiBinSize;
    /**
     * 
     */
    @JsonProperty("tmi_window_global")
    private Double tmiWindowGlobal;
    /**
     * 
     */
    @JsonProperty("total_absorb")
    private TotalAbsorb totalAbsorb;
    /**
     * 
     */
    @JsonProperty("total_dmg")
    private TotalDmg totalDmg;
    /**
     * 
     */
    @JsonProperty("total_heal")
    private TotalHeal totalHeal;
    /**
     * 
     */
    @JsonProperty("travel_variance")
    private Double travelVariance;
    /**
     * 
     */
    @JsonProperty("vary_combat_length")
    private Double varyCombatLength;
    /**
     * 
     */
    @JsonProperty("world_lag_stddev")
    private Double worldLagStddev;
    /**
     * 
     */
    @JsonProperty("world_lag")
    private Double worldLag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The autoReadyTrigger
     */
    @JsonProperty("auto_ready_trigger")
    public Double getAutoReadyTrigger() {
        return autoReadyTrigger;
    }

    /**
     * 
     * @param autoReadyTrigger
     *     The auto_ready_trigger
     */
    @JsonProperty("auto_ready_trigger")
    public void setAutoReadyTrigger(Double autoReadyTrigger) {
        this.autoReadyTrigger = autoReadyTrigger;
    }

    /**
     * 
     * @return
     *     The averageGauss
     */
    @JsonProperty("average_gauss")
    public Double getAverageGauss() {
        return averageGauss;
    }

    /**
     * 
     * @param averageGauss
     *     The average_gauss
     */
    @JsonProperty("average_gauss")
    public void setAverageGauss(Double averageGauss) {
        this.averageGauss = averageGauss;
    }

    /**
     * 
     * @return
     *     The averageRange
     */
    @JsonProperty("average_range")
    public Double getAverageRange() {
        return averageRange;
    }

    /**
     * 
     * @param averageRange
     *     The average_range
     */
    @JsonProperty("average_range")
    public void setAverageRange(Double averageRange) {
        this.averageRange = averageRange;
    }

    /**
     * 
     * @return
     *     The challengeMode
     */
    @JsonProperty("challenge_mode")
    public Boolean getChallengeMode() {
        return challengeMode;
    }

    /**
     * 
     * @param challengeMode
     *     The challenge_mode
     */
    @JsonProperty("challenge_mode")
    public void setChallengeMode(Boolean challengeMode) {
        this.challengeMode = challengeMode;
    }

    /**
     * 
     * @return
     *     The channelLagStddev
     */
    @JsonProperty("channel_lag_stddev")
    public Double getChannelLagStddev() {
        return channelLagStddev;
    }

    /**
     * 
     * @param channelLagStddev
     *     The channel_lag_stddev
     */
    @JsonProperty("channel_lag_stddev")
    public void setChannelLagStddev(Double channelLagStddev) {
        this.channelLagStddev = channelLagStddev;
    }

    /**
     * 
     * @return
     *     The channelLag
     */
    @JsonProperty("channel_lag")
    public Double getChannelLag() {
        return channelLag;
    }

    /**
     * 
     * @param channelLag
     *     The channel_lag
     */
    @JsonProperty("channel_lag")
    public void setChannelLag(Double channelLag) {
        this.channelLag = channelLag;
    }

    /**
     * 
     * @return
     *     The confidenceEstimator
     */
    @JsonProperty("confidence_estimator")
    public Double getConfidenceEstimator() {
        return confidenceEstimator;
    }

    /**
     * 
     * @param confidenceEstimator
     *     The confidence_estimator
     */
    @JsonProperty("confidence_estimator")
    public void setConfidenceEstimator(Double confidenceEstimator) {
        this.confidenceEstimator = confidenceEstimator;
    }

    /**
     * 
     * @return
     *     The confidence
     */
    @JsonProperty("confidence")
    public Double getConfidence() {
        return confidence;
    }

    /**
     * 
     * @param confidence
     *     The confidence
     */
    @JsonProperty("confidence")
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    /**
     * 
     * @return
     *     The dbc
     */
    @JsonProperty("dbc")
    public Dbc getDbc() {
        return dbc;
    }

    /**
     * 
     * @param dbc
     *     The dbc
     */
    @JsonProperty("dbc")
    public void setDbc(Dbc dbc) {
        this.dbc = dbc;
    }

    /**
     * 
     * @return
     *     The debugEach
     */
    @JsonProperty("debug_each")
    public Double getDebugEach() {
        return debugEach;
    }

    /**
     * 
     * @param debugEach
     *     The debug_each
     */
    @JsonProperty("debug_each")
    public void setDebugEach(Double debugEach) {
        this.debugEach = debugEach;
    }

    /**
     * 
     * @return
     *     The debug
     */
    @JsonProperty("debug")
    public Boolean getDebug() {
        return debug;
    }

    /**
     * 
     * @param debug
     *     The debug
     */
    @JsonProperty("debug")
    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    /**
     * 
     * @return
     *     The defaultAuraDelayStddev
     */
    @JsonProperty("default_aura_delay_stddev")
    public Double getDefaultAuraDelayStddev() {
        return defaultAuraDelayStddev;
    }

    /**
     * 
     * @param defaultAuraDelayStddev
     *     The default_aura_delay_stddev
     */
    @JsonProperty("default_aura_delay_stddev")
    public void setDefaultAuraDelayStddev(Double defaultAuraDelayStddev) {
        this.defaultAuraDelayStddev = defaultAuraDelayStddev;
    }

    /**
     * 
     * @return
     *     The defaultAuraDelay
     */
    @JsonProperty("default_aura_delay")
    public Double getDefaultAuraDelay() {
        return defaultAuraDelay;
    }

    /**
     * 
     * @param defaultAuraDelay
     *     The default_aura_delay
     */
    @JsonProperty("default_aura_delay")
    public void setDefaultAuraDelay(Double defaultAuraDelay) {
        this.defaultAuraDelay = defaultAuraDelay;
    }

    /**
     * 
     * @return
     *     The defaultSkill
     */
    @JsonProperty("default_skill")
    public Double getDefaultSkill() {
        return defaultSkill;
    }

    /**
     * 
     * @param defaultSkill
     *     The default_skill
     */
    @JsonProperty("default_skill")
    public void setDefaultSkill(Double defaultSkill) {
        this.defaultSkill = defaultSkill;
    }

    /**
     * 
     * @return
     *     The deterministic
     */
    @JsonProperty("deterministic")
    public Double getDeterministic() {
        return deterministic;
    }

    /**
     * 
     * @param deterministic
     *     The deterministic
     */
    @JsonProperty("deterministic")
    public void setDeterministic(Double deterministic) {
        this.deterministic = deterministic;
    }

    /**
     * 
     * @return
     *     The elapsedCpu
     */
    @JsonProperty("elapsed_cpu")
    public Double getElapsedCpu() {
        return elapsedCpu;
    }

    /**
     * 
     * @param elapsedCpu
     *     The elapsed_cpu
     */
    @JsonProperty("elapsed_cpu")
    public void setElapsedCpu(Double elapsedCpu) {
        this.elapsedCpu = elapsedCpu;
    }

    /**
     * 
     * @return
     *     The elapsedTime
     */
    @JsonProperty("elapsed_time")
    public Double getElapsedTime() {
        return elapsedTime;
    }

    /**
     * 
     * @param elapsedTime
     *     The elapsed_time
     */
    @JsonProperty("elapsed_time")
    public void setElapsedTime(Double elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    /**
     * 
     * @return
     *     The enemyDeathPct
     */
    @JsonProperty("enemy_death_pct")
    public Double getEnemyDeathPct() {
        return enemyDeathPct;
    }

    /**
     * 
     * @param enemyDeathPct
     *     The enemy_death_pct
     */
    @JsonProperty("enemy_death_pct")
    public void setEnemyDeathPct(Double enemyDeathPct) {
        this.enemyDeathPct = enemyDeathPct;
    }

    /**
     * 
     * @return
     *     The expectedIterationTime
     */
    @JsonProperty("expected_iteration_time")
    public Double getExpectedIterationTime() {
        return expectedIterationTime;
    }

    /**
     * 
     * @param expectedIterationTime
     *     The expected_iteration_time
     */
    @JsonProperty("expected_iteration_time")
    public void setExpectedIterationTime(Double expectedIterationTime) {
        this.expectedIterationTime = expectedIterationTime;
    }

    /**
     * 
     * @return
     *     The fightStyle
     */
    @JsonProperty("fight_style")
    public String getFightStyle() {
        return fightStyle;
    }

    /**
     * 
     * @param fightStyle
     *     The fight_style
     */
    @JsonProperty("fight_style")
    public void setFightStyle(String fightStyle) {
        this.fightStyle = fightStyle;
    }

    /**
     * 
     * @return
     *     The fixedTime
     */
    @JsonProperty("fixed_time")
    public Boolean getFixedTime() {
        return fixedTime;
    }

    /**
     * 
     * @param fixedTime
     *     The fixed_time
     */
    @JsonProperty("fixed_time")
    public void setFixedTime(Boolean fixedTime) {
        this.fixedTime = fixedTime;
    }

    /**
     * 
     * @return
     *     The gcdLagStddev
     */
    @JsonProperty("gcd_lag_stddev")
    public Double getGcdLagStddev() {
        return gcdLagStddev;
    }

    /**
     * 
     * @param gcdLagStddev
     *     The gcd_lag_stddev
     */
    @JsonProperty("gcd_lag_stddev")
    public void setGcdLagStddev(Double gcdLagStddev) {
        this.gcdLagStddev = gcdLagStddev;
    }

    /**
     * 
     * @return
     *     The gcdLag
     */
    @JsonProperty("gcd_lag")
    public Double getGcdLag() {
        return gcdLag;
    }

    /**
     * 
     * @param gcdLag
     *     The gcd_lag
     */
    @JsonProperty("gcd_lag")
    public void setGcdLag(Double gcdLag) {
        this.gcdLag = gcdLag;
    }

    /**
     * 
     * @return
     *     The healingPlayers
     */
    @JsonProperty("healing_players")
    public List<HealingPlayer> getHealingPlayers() {
        return healingPlayers;
    }

    /**
     * 
     * @param healingPlayers
     *     The healing_players
     */
    @JsonProperty("healing_players")
    public void setHealingPlayers(List<HealingPlayer> healingPlayers) {
        this.healingPlayers = healingPlayers;
    }

    /**
     * 
     * @return
     *     The igniteSamplingDelta
     */
    @JsonProperty("ignite_sampling_delta")
    public Double getIgniteSamplingDelta() {
        return igniteSamplingDelta;
    }

    /**
     * 
     * @param igniteSamplingDelta
     *     The ignite_sampling_delta
     */
    @JsonProperty("ignite_sampling_delta")
    public void setIgniteSamplingDelta(Double igniteSamplingDelta) {
        this.igniteSamplingDelta = igniteSamplingDelta;
    }

    /**
     * 
     * @return
     *     The iterations
     */
    @JsonProperty("iterations")
    public Double getIterations() {
        return iterations;
    }

    /**
     * 
     * @param iterations
     *     The iterations
     */
    @JsonProperty("iterations")
    public void setIterations(Double iterations) {
        this.iterations = iterations;
    }

    /**
     * 
     * @return
     *     The log
     */
    @JsonProperty("log")
    public Double getLog() {
        return log;
    }

    /**
     * 
     * @param log
     *     The log
     */
    @JsonProperty("log")
    public void setLog(Double log) {
        this.log = log;
    }

    /**
     * 
     * @return
     *     The maxAoeEnemies
     */
    @JsonProperty("max_aoe_enemies")
    public Double getMaxAoeEnemies() {
        return maxAoeEnemies;
    }

    /**
     * 
     * @param maxAoeEnemies
     *     The max_aoe_enemies
     */
    @JsonProperty("max_aoe_enemies")
    public void setMaxAoeEnemies(Double maxAoeEnemies) {
        this.maxAoeEnemies = maxAoeEnemies;
    }

    /**
     * 
     * @return
     *     The maxTime
     */
    @JsonProperty("max_time")
    public Double getMaxTime() {
        return maxTime;
    }

    /**
     * 
     * @param maxTime
     *     The max_time
     */
    @JsonProperty("max_time")
    public void setMaxTime(Double maxTime) {
        this.maxTime = maxTime;
    }

    /**
     * 
     * @return
     *     The optimalRaid
     */
    @JsonProperty("optimal_raid")
    public Double getOptimalRaid() {
        return optimalRaid;
    }

    /**
     * 
     * @param optimalRaid
     *     The optimal_raid
     */
    @JsonProperty("optimal_raid")
    public void setOptimalRaid(Double optimalRaid) {
        this.optimalRaid = optimalRaid;
    }

    /**
     * 
     * @return
     *     The optimizeExpressions
     */
    @JsonProperty("optimize_expressions")
    public Boolean getOptimizeExpressions() {
        return optimizeExpressions;
    }

    /**
     * 
     * @param optimizeExpressions
     *     The optimize_expressions
     */
    @JsonProperty("optimize_expressions")
    public void setOptimizeExpressions(Boolean optimizeExpressions) {
        this.optimizeExpressions = optimizeExpressions;
    }

    /**
     * 
     * @return
     *     The overrides
     */
    @JsonProperty("overrides")
    public Overrides getOverrides() {
        return overrides;
    }

    /**
     * 
     * @param overrides
     *     The overrides
     */
    @JsonProperty("overrides")
    public void setOverrides(Overrides overrides) {
        this.overrides = overrides;
    }

    /**
     * 
     * @return
     *     The players
     */
    @JsonProperty("players")
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * 
     * @param players
     *     The players
     */
    @JsonProperty("players")
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    /**
     * 
     * @return
     *     The plot
     */
    @JsonProperty("plot")
    public Plot getPlot() {
        return plot;
    }

    /**
     * 
     * @param plot
     *     The plot
     */
    @JsonProperty("plot")
    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    /**
     * 
     * @return
     *     The pvpCrit
     */
    @JsonProperty("pvp_crit")
    public Boolean getPvpCrit() {
        return pvpCrit;
    }

    /**
     * 
     * @param pvpCrit
     *     The pvp_crit
     */
    @JsonProperty("pvp_crit")
    public void setPvpCrit(Boolean pvpCrit) {
        this.pvpCrit = pvpCrit;
    }

    /**
     * 
     * @return
     *     The queueGcdReduction
     */
    @JsonProperty("queue_gcd_reduction")
    public Double getQueueGcdReduction() {
        return queueGcdReduction;
    }

    /**
     * 
     * @param queueGcdReduction
     *     The queue_gcd_reduction
     */
    @JsonProperty("queue_gcd_reduction")
    public void setQueueGcdReduction(Double queueGcdReduction) {
        this.queueGcdReduction = queueGcdReduction;
    }

    /**
     * 
     * @return
     *     The queueLagStddev
     */
    @JsonProperty("queue_lag_stddev")
    public Double getQueueLagStddev() {
        return queueLagStddev;
    }

    /**
     * 
     * @param queueLagStddev
     *     The queue_lag_stddev
     */
    @JsonProperty("queue_lag_stddev")
    public void setQueueLagStddev(Double queueLagStddev) {
        this.queueLagStddev = queueLagStddev;
    }

    /**
     * 
     * @return
     *     The queueLag
     */
    @JsonProperty("queue_lag")
    public Double getQueueLag() {
        return queueLag;
    }

    /**
     * 
     * @param queueLag
     *     The queue_lag
     */
    @JsonProperty("queue_lag")
    public void setQueueLag(Double queueLag) {
        this.queueLag = queueLag;
    }

    /**
     * 
     * @return
     *     The raidAps
     */
    @JsonProperty("raid_aps")
    public RaidAps getRaidAps() {
        return raidAps;
    }

    /**
     * 
     * @param raidAps
     *     The raid_aps
     */
    @JsonProperty("raid_aps")
    public void setRaidAps(RaidAps raidAps) {
        this.raidAps = raidAps;
    }

    /**
     * 
     * @return
     *     The raidDps
     */
    @JsonProperty("raid_dps")
    public RaidDps getRaidDps() {
        return raidDps;
    }

    /**
     * 
     * @param raidDps
     *     The raid_dps
     */
    @JsonProperty("raid_dps")
    public void setRaidDps(RaidDps raidDps) {
        this.raidDps = raidDps;
    }

    /**
     * 
     * @return
     *     The raidHps
     */
    @JsonProperty("raid_hps")
    public RaidHps getRaidHps() {
        return raidHps;
    }

    /**
     * 
     * @param raidHps
     *     The raid_hps
     */
    @JsonProperty("raid_hps")
    public void setRaidHps(RaidHps raidHps) {
        this.raidHps = raidHps;
    }

    /**
     * 
     * @return
     *     The reactionTime
     */
    @JsonProperty("reaction_time")
    public Double getReactionTime() {
        return reactionTime;
    }

    /**
     * 
     * @param reactionTime
     *     The reaction_time
     */
    @JsonProperty("reaction_time")
    public void setReactionTime(Double reactionTime) {
        this.reactionTime = reactionTime;
    }

    /**
     * 
     * @return
     *     The reforgePlot
     */
    @JsonProperty("reforge_plot")
    public ReforgePlot getReforgePlot() {
        return reforgePlot;
    }

    /**
     * 
     * @param reforgePlot
     *     The reforge_plot
     */
    @JsonProperty("reforge_plot")
    public void setReforgePlot(ReforgePlot reforgePlot) {
        this.reforgePlot = reforgePlot;
    }

    /**
     * 
     * @return
     *     The regenPeriodicity
     */
    @JsonProperty("regen_periodicity")
    public Double getRegenPeriodicity() {
        return regenPeriodicity;
    }

    /**
     * 
     * @param regenPeriodicity
     *     The regen_periodicity
     */
    @JsonProperty("regen_periodicity")
    public void setRegenPeriodicity(Double regenPeriodicity) {
        this.regenPeriodicity = regenPeriodicity;
    }

    /**
     * 
     * @return
     *     The requiresRegenEvent
     */
    @JsonProperty("requires_regen_event")
    public Boolean getRequiresRegenEvent() {
        return requiresRegenEvent;
    }

    /**
     * 
     * @param requiresRegenEvent
     *     The requires_regen_event
     */
    @JsonProperty("requires_regen_event")
    public void setRequiresRegenEvent(Boolean requiresRegenEvent) {
        this.requiresRegenEvent = requiresRegenEvent;
    }

    /**
     * 
     * @return
     *     The rngSeed
     */
    @JsonProperty("rng_seed")
    public Double getRngSeed() {
        return rngSeed;
    }

    /**
     * 
     * @param rngSeed
     *     The rng_seed
     */
    @JsonProperty("rng_seed")
    public void setRngSeed(Double rngSeed) {
        this.rngSeed = rngSeed;
    }

    /**
     * 
     * @return
     *     The rng
     */
    @JsonProperty("rng")
    public Rng getRng() {
        return rng;
    }

    /**
     * 
     * @param rng
     *     The rng
     */
    @JsonProperty("rng")
    public void setRng(Rng rng) {
        this.rng = rng;
    }

    /**
     * 
     * @return
     *     The scaling
     */
    @JsonProperty("scaling")
    public Scaling getScaling() {
        return scaling;
    }

    /**
     * 
     * @param scaling
     *     The scaling
     */
    @JsonProperty("scaling")
    public void setScaling(Scaling scaling) {
        this.scaling = scaling;
    }

    /**
     * 
     * @return
     *     The showEtmi
     */
    @JsonProperty("show_etmi")
    public Boolean getShowEtmi() {
        return showEtmi;
    }

    /**
     * 
     * @param showEtmi
     *     The show_etmi
     */
    @JsonProperty("show_etmi")
    public void setShowEtmi(Boolean showEtmi) {
        this.showEtmi = showEtmi;
    }

    /**
     * 
     * @return
     *     The simulationLength
     */
    @JsonProperty("simulation_length")
    public SimulationLength getSimulationLength() {
        return simulationLength;
    }

    /**
     * 
     * @param simulationLength
     *     The simulation_length
     */
    @JsonProperty("simulation_length")
    public void setSimulationLength(SimulationLength simulationLength) {
        this.simulationLength = simulationLength;
    }

    /**
     * 
     * @return
     *     The statCache
     */
    @JsonProperty("stat_cache")
    public Double getStatCache() {
        return statCache;
    }

    /**
     * 
     * @param statCache
     *     The stat_cache
     */
    @JsonProperty("stat_cache")
    public void setStatCache(Double statCache) {
        this.statCache = statCache;
    }

    /**
     * 
     * @return
     *     The strictGcdQueue
     */
    @JsonProperty("strict_gcd_queue")
    public Double getStrictGcdQueue() {
        return strictGcdQueue;
    }

    /**
     * 
     * @param strictGcdQueue
     *     The strict_gcd_queue
     */
    @JsonProperty("strict_gcd_queue")
    public void setStrictGcdQueue(Double strictGcdQueue) {
        this.strictGcdQueue = strictGcdQueue;
    }

    /**
     * 
     * @return
     *     The targetError
     */
    @JsonProperty("target_error")
    public Double getTargetError() {
        return targetError;
    }

    /**
     * 
     * @param targetError
     *     The target_error
     */
    @JsonProperty("target_error")
    public void setTargetError(Double targetError) {
        this.targetError = targetError;
    }

    /**
     * 
     * @return
     *     The target
     */
    @JsonProperty("target")
    public List<Target> getTarget() {
        return target;
    }

    /**
     * 
     * @param target
     *     The target
     */
    @JsonProperty("target")
    public void setTarget(List<Target> target) {
        this.target = target;
    }

    /**
     * 
     * @return
     *     The tmiBinSize
     */
    @JsonProperty("tmi_bin_size")
    public Double getTmiBinSize() {
        return tmiBinSize;
    }

    /**
     * 
     * @param tmiBinSize
     *     The tmi_bin_size
     */
    @JsonProperty("tmi_bin_size")
    public void setTmiBinSize(Double tmiBinSize) {
        this.tmiBinSize = tmiBinSize;
    }

    /**
     * 
     * @return
     *     The tmiWindowGlobal
     */
    @JsonProperty("tmi_window_global")
    public Double getTmiWindowGlobal() {
        return tmiWindowGlobal;
    }

    /**
     * 
     * @param tmiWindowGlobal
     *     The tmi_window_global
     */
    @JsonProperty("tmi_window_global")
    public void setTmiWindowGlobal(Double tmiWindowGlobal) {
        this.tmiWindowGlobal = tmiWindowGlobal;
    }

    /**
     * 
     * @return
     *     The totalAbsorb
     */
    @JsonProperty("total_absorb")
    public TotalAbsorb getTotalAbsorb() {
        return totalAbsorb;
    }

    /**
     * 
     * @param totalAbsorb
     *     The total_absorb
     */
    @JsonProperty("total_absorb")
    public void setTotalAbsorb(TotalAbsorb totalAbsorb) {
        this.totalAbsorb = totalAbsorb;
    }

    /**
     * 
     * @return
     *     The totalDmg
     */
    @JsonProperty("total_dmg")
    public TotalDmg getTotalDmg() {
        return totalDmg;
    }

    /**
     * 
     * @param totalDmg
     *     The total_dmg
     */
    @JsonProperty("total_dmg")
    public void setTotalDmg(TotalDmg totalDmg) {
        this.totalDmg = totalDmg;
    }

    /**
     * 
     * @return
     *     The totalHeal
     */
    @JsonProperty("total_heal")
    public TotalHeal getTotalHeal() {
        return totalHeal;
    }

    /**
     * 
     * @param totalHeal
     *     The total_heal
     */
    @JsonProperty("total_heal")
    public void setTotalHeal(TotalHeal totalHeal) {
        this.totalHeal = totalHeal;
    }

    /**
     * 
     * @return
     *     The travelVariance
     */
    @JsonProperty("travel_variance")
    public Double getTravelVariance() {
        return travelVariance;
    }

    /**
     * 
     * @param travelVariance
     *     The travel_variance
     */
    @JsonProperty("travel_variance")
    public void setTravelVariance(Double travelVariance) {
        this.travelVariance = travelVariance;
    }

    /**
     * 
     * @return
     *     The varyCombatLength
     */
    @JsonProperty("vary_combat_length")
    public Double getVaryCombatLength() {
        return varyCombatLength;
    }

    /**
     * 
     * @param varyCombatLength
     *     The vary_combat_length
     */
    @JsonProperty("vary_combat_length")
    public void setVaryCombatLength(Double varyCombatLength) {
        this.varyCombatLength = varyCombatLength;
    }

    /**
     * 
     * @return
     *     The worldLagStddev
     */
    @JsonProperty("world_lag_stddev")
    public Double getWorldLagStddev() {
        return worldLagStddev;
    }

    /**
     * 
     * @param worldLagStddev
     *     The world_lag_stddev
     */
    @JsonProperty("world_lag_stddev")
    public void setWorldLagStddev(Double worldLagStddev) {
        this.worldLagStddev = worldLagStddev;
    }

    /**
     * 
     * @return
     *     The worldLag
     */
    @JsonProperty("world_lag")
    public Double getWorldLag() {
        return worldLag;
    }

    /**
     * 
     * @param worldLag
     *     The world_lag
     */
    @JsonProperty("world_lag")
    public void setWorldLag(Double worldLag) {
        this.worldLag = worldLag;
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
        return new HashCodeBuilder().append(autoReadyTrigger).append(averageGauss).append(averageRange).append(challengeMode).append(channelLagStddev).append(channelLag).append(confidenceEstimator).append(confidence).append(dbc).append(debugEach).append(debug).append(defaultAuraDelayStddev).append(defaultAuraDelay).append(defaultSkill).append(deterministic).append(elapsedCpu).append(elapsedTime).append(enemyDeathPct).append(expectedIterationTime).append(fightStyle).append(fixedTime).append(gcdLagStddev).append(gcdLag).append(healingPlayers).append(igniteSamplingDelta).append(iterations).append(log).append(maxAoeEnemies).append(maxTime).append(optimalRaid).append(optimizeExpressions).append(overrides).append(players).append(plot).append(pvpCrit).append(queueGcdReduction).append(queueLagStddev).append(queueLag).append(raidAps).append(raidDps).append(raidHps).append(reactionTime).append(reforgePlot).append(regenPeriodicity).append(requiresRegenEvent).append(rngSeed).append(rng).append(scaling).append(showEtmi).append(simulationLength).append(statCache).append(strictGcdQueue).append(targetError).append(target).append(tmiBinSize).append(tmiWindowGlobal).append(totalAbsorb).append(totalDmg).append(totalHeal).append(travelVariance).append(varyCombatLength).append(worldLagStddev).append(worldLag).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sim) == false) {
            return false;
        }
        Sim rhs = ((Sim) other);
        return new EqualsBuilder().append(autoReadyTrigger, rhs.autoReadyTrigger).append(averageGauss, rhs.averageGauss).append(averageRange, rhs.averageRange).append(challengeMode, rhs.challengeMode).append(channelLagStddev, rhs.channelLagStddev).append(channelLag, rhs.channelLag).append(confidenceEstimator, rhs.confidenceEstimator).append(confidence, rhs.confidence).append(dbc, rhs.dbc).append(debugEach, rhs.debugEach).append(debug, rhs.debug).append(defaultAuraDelayStddev, rhs.defaultAuraDelayStddev).append(defaultAuraDelay, rhs.defaultAuraDelay).append(defaultSkill, rhs.defaultSkill).append(deterministic, rhs.deterministic).append(elapsedCpu, rhs.elapsedCpu).append(elapsedTime, rhs.elapsedTime).append(enemyDeathPct, rhs.enemyDeathPct).append(expectedIterationTime, rhs.expectedIterationTime).append(fightStyle, rhs.fightStyle).append(fixedTime, rhs.fixedTime).append(gcdLagStddev, rhs.gcdLagStddev).append(gcdLag, rhs.gcdLag).append(healingPlayers, rhs.healingPlayers).append(igniteSamplingDelta, rhs.igniteSamplingDelta).append(iterations, rhs.iterations).append(log, rhs.log).append(maxAoeEnemies, rhs.maxAoeEnemies).append(maxTime, rhs.maxTime).append(optimalRaid, rhs.optimalRaid).append(optimizeExpressions, rhs.optimizeExpressions).append(overrides, rhs.overrides).append(players, rhs.players).append(plot, rhs.plot).append(pvpCrit, rhs.pvpCrit).append(queueGcdReduction, rhs.queueGcdReduction).append(queueLagStddev, rhs.queueLagStddev).append(queueLag, rhs.queueLag).append(raidAps, rhs.raidAps).append(raidDps, rhs.raidDps).append(raidHps, rhs.raidHps).append(reactionTime, rhs.reactionTime).append(reforgePlot, rhs.reforgePlot).append(regenPeriodicity, rhs.regenPeriodicity).append(requiresRegenEvent, rhs.requiresRegenEvent).append(rngSeed, rhs.rngSeed).append(rng, rhs.rng).append(scaling, rhs.scaling).append(showEtmi, rhs.showEtmi).append(simulationLength, rhs.simulationLength).append(statCache, rhs.statCache).append(strictGcdQueue, rhs.strictGcdQueue).append(targetError, rhs.targetError).append(target, rhs.target).append(tmiBinSize, rhs.tmiBinSize).append(tmiWindowGlobal, rhs.tmiWindowGlobal).append(totalAbsorb, rhs.totalAbsorb).append(totalDmg, rhs.totalDmg).append(totalHeal, rhs.totalHeal).append(travelVariance, rhs.travelVariance).append(varyCombatLength, rhs.varyCombatLength).append(worldLagStddev, rhs.worldLagStddev).append(worldLag, rhs.worldLag).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
