
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

@EqualsAndHashCode
@Getter
@ToString
public class Sim {

    
    @JsonProperty("auto_ready_trigger")
    private Double autoReadyTrigger;
    
    @JsonProperty("average_gauss")
    private Double averageGauss;
    
    @JsonProperty("average_range")
    private Double averageRange;
    
    @JsonProperty("challenge_mode")
    private Boolean challengeMode;
    
    @JsonProperty("channel_lag_stddev")
    private Double channelLagStddev;
    
    @JsonProperty("channel_lag")
    private Double channelLag;
    
    @JsonProperty("confidence_estimator")
    private Double confidenceEstimator;
    
    @JsonProperty("confidence")
    private Double confidence;
    
    @JsonProperty("dbc")
    private Dbc dbc;
    
    @JsonProperty("debug_each")
    private Double debugEach;
    
    @JsonProperty("debug")
    private Boolean debug;
    
    @JsonProperty("default_aura_delay_stddev")
    private Double defaultAuraDelayStddev;
    
    @JsonProperty("default_aura_delay")
    private Double defaultAuraDelay;
    
    @JsonProperty("default_skill")
    private Double defaultSkill;
    
    @JsonProperty("deterministic")
    private Double deterministic;
    
    @JsonProperty("elapsed_cpu")
    private Double elapsedCpu;
    
    @JsonProperty("elapsed_time")
    private Double elapsedTime;
    
    @JsonProperty("enemy_death_pct")
    private Double enemyDeathPct;
    
    @JsonProperty("expected_iteration_time")
    private Double expectedIterationTime;
    
    @JsonProperty("fight_style")
    private String fightStyle;
    
    @JsonProperty("fixed_time")
    private Boolean fixedTime;
    
    @JsonProperty("gcd_lag_stddev")
    private Double gcdLagStddev;
    
    @JsonProperty("gcd_lag")
    private Double gcdLag;
    
    @JsonProperty("healing_players")
    private List<HealingPlayer> healingPlayers = new ArrayList<HealingPlayer>();
    
    @JsonProperty("ignite_sampling_delta")
    private Double igniteSamplingDelta;
    
    @JsonProperty("iterations")
    private Double iterations;
    
    @JsonProperty("log")
    private Double log;
    
    @JsonProperty("max_aoe_enemies")
    private Double maxAoeEnemies;
    
    @JsonProperty("max_time")
    private Double maxTime;
    
    @JsonProperty("optimal_raid")
    private Double optimalRaid;
    
    @JsonProperty("optimize_expressions")
    private Boolean optimizeExpressions;
    
    @JsonProperty("overrides")
    private Overrides overrides;
    
    @JsonProperty("players")
    private List<Player> players = new ArrayList<Player>();
    
    @JsonProperty("plot")
    private Plot plot;
    
    @JsonProperty("pvp_crit")
    private Boolean pvpCrit;
    
    @JsonProperty("queue_gcd_reduction")
    private Double queueGcdReduction;
    
    @JsonProperty("queue_lag_stddev")
    private Double queueLagStddev;
    
    @JsonProperty("queue_lag")
    private Double queueLag;
    
    @JsonProperty("raid_aps")
    private RaidAps raidAps;
    
    @JsonProperty("raid_dps")
    private RaidDps raidDps;
    
    @JsonProperty("raid_hps")
    private RaidHps raidHps;
    
    @JsonProperty("reaction_time")
    private Double reactionTime;
    
    @JsonProperty("reforge_plot")
    private ReforgePlot reforgePlot;
    
    @JsonProperty("regen_periodicity")
    private Double regenPeriodicity;
    
    @JsonProperty("requires_regen_event")
    private Boolean requiresRegenEvent;
    
    @JsonProperty("rng_seed")
    private Double rngSeed;
    
    @JsonProperty("rng")
    private Rng rng;
    
    @JsonProperty("scaling")
    private Scaling scaling;
    
    @JsonProperty("show_etmi")
    private Boolean showEtmi;
    
    @JsonProperty("simulation_length")
    private SimulationLength simulationLength;
    
    @JsonProperty("stat_cache")
    private Double statCache;
    
    @JsonProperty("strict_gcd_queue")
    private Double strictGcdQueue;
    
    @JsonProperty("target_error")
    private Double targetError;
    
    @JsonProperty("target")
    private List<Target> target = new ArrayList<Target>();
    
    @JsonProperty("tmi_bin_size")
    private Double tmiBinSize;
    
    @JsonProperty("tmi_window_global")
    private Double tmiWindowGlobal;
    
    @JsonProperty("total_absorb")
    private TotalAbsorb totalAbsorb;
    
    @JsonProperty("total_dmg")
    private TotalDmg totalDmg;
    
    @JsonProperty("total_heal")
    private TotalHeal totalHeal;
    
    @JsonProperty("travel_variance")
    private Double travelVariance;
    
    @JsonProperty("vary_combat_length")
    private Double varyCombatLength;
    
    @JsonProperty("world_lag_stddev")
    private Double worldLagStddev;
    
    @JsonProperty("world_lag")
    private Double worldLag;

}
