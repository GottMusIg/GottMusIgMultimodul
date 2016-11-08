
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
    "base_chi_regen_per_second",
    "base_energy_regen_per_second",
    "base_focus_regen_per_second",
    "base_gcd",
    "base_stats",
    "brain_lag_stddev",
    "brain_lag",
    "buffs",
    "bugs",
    "collected_data",
    "combat_reach",
    "consumables",
    "current_stats",
    "dbc",
    "death_pct",
    "diminishing_returns_constants",
    "gains",
    "gcd_ready",
    "height",
    "initial_stats",
    "invert_scaling",
    "level",
    "main_hand_weapon",
    "name",
    "off_hand_weapon",
    "party",
    "potion_used",
    "procs",
    "professions",
    "race",
    "reaction_mean",
    "reaction_nu",
    "reaction_offset",
    "reaction_stddev",
    "ready_type",
    "resources",
    "role",
    "scale_factors",
    "scale_player",
    "specialization",
    "started_waiting",
    "stats",
    "timeofday",
    "world_lag_override",
    "world_lag_stddev_override",
    "world_lag_stddev",
    "world_lag"
})
public class HealingPlayer {

    /**
     * 
     */
    @JsonProperty("base_chi_regen_per_second")
    private Double baseChiRegenPerSecond;
    /**
     * 
     */
    @JsonProperty("base_energy_regen_per_second")
    private Double baseEnergyRegenPerSecond;
    /**
     * 
     */
    @JsonProperty("base_focus_regen_per_second")
    private Double baseFocusRegenPerSecond;
    /**
     * 
     */
    @JsonProperty("base_gcd")
    private Double baseGcd;
    /**
     * 
     */
    @JsonProperty("base_stats")
    private BaseStats baseStats;
    /**
     * 
     */
    @JsonProperty("brain_lag_stddev")
    private Double brainLagStddev;
    /**
     * 
     */
    @JsonProperty("brain_lag")
    private Double brainLag;
    /**
     * 
     */
    @JsonProperty("buffs")
    private List<Buff> buffs = new ArrayList<Buff>();
    /**
     * 
     */
    @JsonProperty("bugs")
    private Boolean bugs;
    /**
     * 
     */
    @JsonProperty("collected_data")
    private CollectedData collectedData;
    /**
     * 
     */
    @JsonProperty("combat_reach")
    private Double combatReach;
    /**
     * 
     */
    @JsonProperty("consumables")
    private Consumables consumables;
    /**
     * 
     */
    @JsonProperty("current_stats")
    private CurrentStats currentStats;
    /**
     * 
     */
    @JsonProperty("dbc")
    private Dbc dbc;
    /**
     * 
     */
    @JsonProperty("death_pct")
    private Double deathPct;
    /**
     * 
     */
    @JsonProperty("diminishing_returns_constants")
    private DiminishingReturnsConstants diminishingReturnsConstants;
    /**
     * 
     */
    @JsonProperty("gains")
    private List<Gain> gains = new ArrayList<Gain>();
    /**
     * 
     */
    @JsonProperty("gcd_ready")
    private Double gcdReady;
    /**
     * 
     */
    @JsonProperty("height")
    private Double height;
    /**
     * 
     */
    @JsonProperty("initial_stats")
    private InitialStats initialStats;
    /**
     * 
     */
    @JsonProperty("invert_scaling")
    private Double invertScaling;
    /**
     * 
     */
    @JsonProperty("level")
    private Double level;
    /**
     * 
     */
    @JsonProperty("main_hand_weapon")
    private MainHandWeapon mainHandWeapon;
    /**
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     */
    @JsonProperty("off_hand_weapon")
    private OffHandWeapon offHandWeapon;
    /**
     * 
     */
    @JsonProperty("party")
    private Double party;
    /**
     * 
     */
    @JsonProperty("potion_used")
    private Boolean potionUsed;
    /**
     * 
     */
    @JsonProperty("procs")
    private List<Proc> procs = new ArrayList<Proc>();
    /**
     * 
     */
    @JsonProperty("professions")
    private List<Object> professions = new ArrayList<Object>();
    /**
     * 
     */
    @JsonProperty("race")
    private String race;
    /**
     * 
     */
    @JsonProperty("reaction_mean")
    private Double reactionMean;
    /**
     * 
     */
    @JsonProperty("reaction_nu")
    private Double reactionNu;
    /**
     * 
     */
    @JsonProperty("reaction_offset")
    private Double reactionOffset;
    /**
     * 
     */
    @JsonProperty("reaction_stddev")
    private Double reactionStddev;
    /**
     * 
     */
    @JsonProperty("ready_type")
    private Double readyType;
    /**
     * 
     */
    @JsonProperty("resources")
    private Resources resources;
    /**
     * 
     */
    @JsonProperty("role")
    private String role;
    /**
     * 
     */
    @JsonProperty("scale_factors")
    private ScaleFactors scaleFactors;
    /**
     * 
     */
    @JsonProperty("scale_player")
    private Boolean scalePlayer;
    /**
     * 
     */
    @JsonProperty("specialization")
    private String specialization;
    /**
     * 
     */
    @JsonProperty("started_waiting")
    private Double startedWaiting;
    /**
     * 
     */
    @JsonProperty("stats")
    private List<Stat> stats = new ArrayList<Stat>();
    /**
     * 
     */
    @JsonProperty("timeofday")
    private String timeofday;
    /**
     * 
     */
    @JsonProperty("world_lag_override")
    private Boolean worldLagOverride;
    /**
     * 
     */
    @JsonProperty("world_lag_stddev_override")
    private Boolean worldLagStddevOverride;
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
     *     The baseChiRegenPerSecond
     */
    @JsonProperty("base_chi_regen_per_second")
    public Double getBaseChiRegenPerSecond() {
        return baseChiRegenPerSecond;
    }

    /**
     * 
     * @param baseChiRegenPerSecond
     *     The base_chi_regen_per_second
     */
    @JsonProperty("base_chi_regen_per_second")
    public void setBaseChiRegenPerSecond(Double baseChiRegenPerSecond) {
        this.baseChiRegenPerSecond = baseChiRegenPerSecond;
    }

    /**
     * 
     * @return
     *     The baseEnergyRegenPerSecond
     */
    @JsonProperty("base_energy_regen_per_second")
    public Double getBaseEnergyRegenPerSecond() {
        return baseEnergyRegenPerSecond;
    }

    /**
     * 
     * @param baseEnergyRegenPerSecond
     *     The base_energy_regen_per_second
     */
    @JsonProperty("base_energy_regen_per_second")
    public void setBaseEnergyRegenPerSecond(Double baseEnergyRegenPerSecond) {
        this.baseEnergyRegenPerSecond = baseEnergyRegenPerSecond;
    }

    /**
     * 
     * @return
     *     The baseFocusRegenPerSecond
     */
    @JsonProperty("base_focus_regen_per_second")
    public Double getBaseFocusRegenPerSecond() {
        return baseFocusRegenPerSecond;
    }

    /**
     * 
     * @param baseFocusRegenPerSecond
     *     The base_focus_regen_per_second
     */
    @JsonProperty("base_focus_regen_per_second")
    public void setBaseFocusRegenPerSecond(Double baseFocusRegenPerSecond) {
        this.baseFocusRegenPerSecond = baseFocusRegenPerSecond;
    }

    /**
     * 
     * @return
     *     The baseGcd
     */
    @JsonProperty("base_gcd")
    public Double getBaseGcd() {
        return baseGcd;
    }

    /**
     * 
     * @param baseGcd
     *     The base_gcd
     */
    @JsonProperty("base_gcd")
    public void setBaseGcd(Double baseGcd) {
        this.baseGcd = baseGcd;
    }

    /**
     * 
     * @return
     *     The baseStats
     */
    @JsonProperty("base_stats")
    public BaseStats getBaseStats() {
        return baseStats;
    }

    /**
     * 
     * @param baseStats
     *     The base_stats
     */
    @JsonProperty("base_stats")
    public void setBaseStats(BaseStats baseStats) {
        this.baseStats = baseStats;
    }

    /**
     * 
     * @return
     *     The brainLagStddev
     */
    @JsonProperty("brain_lag_stddev")
    public Double getBrainLagStddev() {
        return brainLagStddev;
    }

    /**
     * 
     * @param brainLagStddev
     *     The brain_lag_stddev
     */
    @JsonProperty("brain_lag_stddev")
    public void setBrainLagStddev(Double brainLagStddev) {
        this.brainLagStddev = brainLagStddev;
    }

    /**
     * 
     * @return
     *     The brainLag
     */
    @JsonProperty("brain_lag")
    public Double getBrainLag() {
        return brainLag;
    }

    /**
     * 
     * @param brainLag
     *     The brain_lag
     */
    @JsonProperty("brain_lag")
    public void setBrainLag(Double brainLag) {
        this.brainLag = brainLag;
    }

    /**
     * 
     * @return
     *     The buffs
     */
    @JsonProperty("buffs")
    public List<Buff> getBuffs() {
        return buffs;
    }

    /**
     * 
     * @param buffs
     *     The buffs
     */
    @JsonProperty("buffs")
    public void setBuffs(List<Buff> buffs) {
        this.buffs = buffs;
    }

    /**
     * 
     * @return
     *     The bugs
     */
    @JsonProperty("bugs")
    public Boolean getBugs() {
        return bugs;
    }

    /**
     * 
     * @param bugs
     *     The bugs
     */
    @JsonProperty("bugs")
    public void setBugs(Boolean bugs) {
        this.bugs = bugs;
    }

    /**
     * 
     * @return
     *     The collectedData
     */
    @JsonProperty("collected_data")
    public CollectedData getCollectedData() {
        return collectedData;
    }

    /**
     * 
     * @param collectedData
     *     The collected_data
     */
    @JsonProperty("collected_data")
    public void setCollectedData(CollectedData collectedData) {
        this.collectedData = collectedData;
    }

    /**
     * 
     * @return
     *     The combatReach
     */
    @JsonProperty("combat_reach")
    public Double getCombatReach() {
        return combatReach;
    }

    /**
     * 
     * @param combatReach
     *     The combat_reach
     */
    @JsonProperty("combat_reach")
    public void setCombatReach(Double combatReach) {
        this.combatReach = combatReach;
    }

    /**
     * 
     * @return
     *     The consumables
     */
    @JsonProperty("consumables")
    public Consumables getConsumables() {
        return consumables;
    }

    /**
     * 
     * @param consumables
     *     The consumables
     */
    @JsonProperty("consumables")
    public void setConsumables(Consumables consumables) {
        this.consumables = consumables;
    }

    /**
     * 
     * @return
     *     The currentStats
     */
    @JsonProperty("current_stats")
    public CurrentStats getCurrentStats() {
        return currentStats;
    }

    /**
     * 
     * @param currentStats
     *     The current_stats
     */
    @JsonProperty("current_stats")
    public void setCurrentStats(CurrentStats currentStats) {
        this.currentStats = currentStats;
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
     *     The deathPct
     */
    @JsonProperty("death_pct")
    public Double getDeathPct() {
        return deathPct;
    }

    /**
     * 
     * @param deathPct
     *     The death_pct
     */
    @JsonProperty("death_pct")
    public void setDeathPct(Double deathPct) {
        this.deathPct = deathPct;
    }

    /**
     * 
     * @return
     *     The diminishingReturnsConstants
     */
    @JsonProperty("diminishing_returns_constants")
    public DiminishingReturnsConstants getDiminishingReturnsConstants() {
        return diminishingReturnsConstants;
    }

    /**
     * 
     * @param diminishingReturnsConstants
     *     The diminishing_returns_constants
     */
    @JsonProperty("diminishing_returns_constants")
    public void setDiminishingReturnsConstants(DiminishingReturnsConstants diminishingReturnsConstants) {
        this.diminishingReturnsConstants = diminishingReturnsConstants;
    }

    /**
     * 
     * @return
     *     The gains
     */
    @JsonProperty("gains")
    public List<Gain> getGains() {
        return gains;
    }

    /**
     * 
     * @param gains
     *     The gains
     */
    @JsonProperty("gains")
    public void setGains(List<Gain> gains) {
        this.gains = gains;
    }

    /**
     * 
     * @return
     *     The gcdReady
     */
    @JsonProperty("gcd_ready")
    public Double getGcdReady() {
        return gcdReady;
    }

    /**
     * 
     * @param gcdReady
     *     The gcd_ready
     */
    @JsonProperty("gcd_ready")
    public void setGcdReady(Double gcdReady) {
        this.gcdReady = gcdReady;
    }

    /**
     * 
     * @return
     *     The height
     */
    @JsonProperty("height")
    public Double getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    @JsonProperty("height")
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The initialStats
     */
    @JsonProperty("initial_stats")
    public InitialStats getInitialStats() {
        return initialStats;
    }

    /**
     * 
     * @param initialStats
     *     The initial_stats
     */
    @JsonProperty("initial_stats")
    public void setInitialStats(InitialStats initialStats) {
        this.initialStats = initialStats;
    }

    /**
     * 
     * @return
     *     The invertScaling
     */
    @JsonProperty("invert_scaling")
    public Double getInvertScaling() {
        return invertScaling;
    }

    /**
     * 
     * @param invertScaling
     *     The invert_scaling
     */
    @JsonProperty("invert_scaling")
    public void setInvertScaling(Double invertScaling) {
        this.invertScaling = invertScaling;
    }

    /**
     * 
     * @return
     *     The level
     */
    @JsonProperty("level")
    public Double getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    @JsonProperty("level")
    public void setLevel(Double level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The mainHandWeapon
     */
    @JsonProperty("main_hand_weapon")
    public MainHandWeapon getMainHandWeapon() {
        return mainHandWeapon;
    }

    /**
     * 
     * @param mainHandWeapon
     *     The main_hand_weapon
     */
    @JsonProperty("main_hand_weapon")
    public void setMainHandWeapon(MainHandWeapon mainHandWeapon) {
        this.mainHandWeapon = mainHandWeapon;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The offHandWeapon
     */
    @JsonProperty("off_hand_weapon")
    public OffHandWeapon getOffHandWeapon() {
        return offHandWeapon;
    }

    /**
     * 
     * @param offHandWeapon
     *     The off_hand_weapon
     */
    @JsonProperty("off_hand_weapon")
    public void setOffHandWeapon(OffHandWeapon offHandWeapon) {
        this.offHandWeapon = offHandWeapon;
    }

    /**
     * 
     * @return
     *     The party
     */
    @JsonProperty("party")
    public Double getParty() {
        return party;
    }

    /**
     * 
     * @param party
     *     The party
     */
    @JsonProperty("party")
    public void setParty(Double party) {
        this.party = party;
    }

    /**
     * 
     * @return
     *     The potionUsed
     */
    @JsonProperty("potion_used")
    public Boolean getPotionUsed() {
        return potionUsed;
    }

    /**
     * 
     * @param potionUsed
     *     The potion_used
     */
    @JsonProperty("potion_used")
    public void setPotionUsed(Boolean potionUsed) {
        this.potionUsed = potionUsed;
    }

    /**
     * 
     * @return
     *     The procs
     */
    @JsonProperty("procs")
    public List<Proc> getProcs() {
        return procs;
    }

    /**
     * 
     * @param procs
     *     The procs
     */
    @JsonProperty("procs")
    public void setProcs(List<Proc> procs) {
        this.procs = procs;
    }

    /**
     * 
     * @return
     *     The professions
     */
    @JsonProperty("professions")
    public List<Object> getProfessions() {
        return professions;
    }

    /**
     * 
     * @param professions
     *     The professions
     */
    @JsonProperty("professions")
    public void setProfessions(List<Object> professions) {
        this.professions = professions;
    }

    /**
     * 
     * @return
     *     The race
     */
    @JsonProperty("race")
    public String getRace() {
        return race;
    }

    /**
     * 
     * @param race
     *     The race
     */
    @JsonProperty("race")
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * 
     * @return
     *     The reactionMean
     */
    @JsonProperty("reaction_mean")
    public Double getReactionMean() {
        return reactionMean;
    }

    /**
     * 
     * @param reactionMean
     *     The reaction_mean
     */
    @JsonProperty("reaction_mean")
    public void setReactionMean(Double reactionMean) {
        this.reactionMean = reactionMean;
    }

    /**
     * 
     * @return
     *     The reactionNu
     */
    @JsonProperty("reaction_nu")
    public Double getReactionNu() {
        return reactionNu;
    }

    /**
     * 
     * @param reactionNu
     *     The reaction_nu
     */
    @JsonProperty("reaction_nu")
    public void setReactionNu(Double reactionNu) {
        this.reactionNu = reactionNu;
    }

    /**
     * 
     * @return
     *     The reactionOffset
     */
    @JsonProperty("reaction_offset")
    public Double getReactionOffset() {
        return reactionOffset;
    }

    /**
     * 
     * @param reactionOffset
     *     The reaction_offset
     */
    @JsonProperty("reaction_offset")
    public void setReactionOffset(Double reactionOffset) {
        this.reactionOffset = reactionOffset;
    }

    /**
     * 
     * @return
     *     The reactionStddev
     */
    @JsonProperty("reaction_stddev")
    public Double getReactionStddev() {
        return reactionStddev;
    }

    /**
     * 
     * @param reactionStddev
     *     The reaction_stddev
     */
    @JsonProperty("reaction_stddev")
    public void setReactionStddev(Double reactionStddev) {
        this.reactionStddev = reactionStddev;
    }

    /**
     * 
     * @return
     *     The readyType
     */
    @JsonProperty("ready_type")
    public Double getReadyType() {
        return readyType;
    }

    /**
     * 
     * @param readyType
     *     The ready_type
     */
    @JsonProperty("ready_type")
    public void setReadyType(Double readyType) {
        this.readyType = readyType;
    }

    /**
     * 
     * @return
     *     The resources
     */
    @JsonProperty("resources")
    public Resources getResources() {
        return resources;
    }

    /**
     * 
     * @param resources
     *     The resources
     */
    @JsonProperty("resources")
    public void setResources(Resources resources) {
        this.resources = resources;
    }

    /**
     * 
     * @return
     *     The role
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * 
     * @param role
     *     The role
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 
     * @return
     *     The scaleFactors
     */
    @JsonProperty("scale_factors")
    public ScaleFactors getScaleFactors() {
        return scaleFactors;
    }

    /**
     * 
     * @param scaleFactors
     *     The scale_factors
     */
    @JsonProperty("scale_factors")
    public void setScaleFactors(ScaleFactors scaleFactors) {
        this.scaleFactors = scaleFactors;
    }

    /**
     * 
     * @return
     *     The scalePlayer
     */
    @JsonProperty("scale_player")
    public Boolean getScalePlayer() {
        return scalePlayer;
    }

    /**
     * 
     * @param scalePlayer
     *     The scale_player
     */
    @JsonProperty("scale_player")
    public void setScalePlayer(Boolean scalePlayer) {
        this.scalePlayer = scalePlayer;
    }

    /**
     * 
     * @return
     *     The specialization
     */
    @JsonProperty("specialization")
    public String getSpecialization() {
        return specialization;
    }

    /**
     * 
     * @param specialization
     *     The specialization
     */
    @JsonProperty("specialization")
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * 
     * @return
     *     The startedWaiting
     */
    @JsonProperty("started_waiting")
    public Double getStartedWaiting() {
        return startedWaiting;
    }

    /**
     * 
     * @param startedWaiting
     *     The started_waiting
     */
    @JsonProperty("started_waiting")
    public void setStartedWaiting(Double startedWaiting) {
        this.startedWaiting = startedWaiting;
    }

    /**
     * 
     * @return
     *     The stats
     */
    @JsonProperty("stats")
    public List<Stat> getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    @JsonProperty("stats")
    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The timeofday
     */
    @JsonProperty("timeofday")
    public String getTimeofday() {
        return timeofday;
    }

    /**
     * 
     * @param timeofday
     *     The timeofday
     */
    @JsonProperty("timeofday")
    public void setTimeofday(String timeofday) {
        this.timeofday = timeofday;
    }

    /**
     * 
     * @return
     *     The worldLagOverride
     */
    @JsonProperty("world_lag_override")
    public Boolean getWorldLagOverride() {
        return worldLagOverride;
    }

    /**
     * 
     * @param worldLagOverride
     *     The world_lag_override
     */
    @JsonProperty("world_lag_override")
    public void setWorldLagOverride(Boolean worldLagOverride) {
        this.worldLagOverride = worldLagOverride;
    }

    /**
     * 
     * @return
     *     The worldLagStddevOverride
     */
    @JsonProperty("world_lag_stddev_override")
    public Boolean getWorldLagStddevOverride() {
        return worldLagStddevOverride;
    }

    /**
     * 
     * @param worldLagStddevOverride
     *     The world_lag_stddev_override
     */
    @JsonProperty("world_lag_stddev_override")
    public void setWorldLagStddevOverride(Boolean worldLagStddevOverride) {
        this.worldLagStddevOverride = worldLagStddevOverride;
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
        return new HashCodeBuilder().append(baseChiRegenPerSecond).append(baseEnergyRegenPerSecond).append(baseFocusRegenPerSecond).append(baseGcd).append(baseStats).append(brainLagStddev).append(brainLag).append(buffs).append(bugs).append(collectedData).append(combatReach).append(consumables).append(currentStats).append(dbc).append(deathPct).append(diminishingReturnsConstants).append(gains).append(gcdReady).append(height).append(initialStats).append(invertScaling).append(level).append(mainHandWeapon).append(name).append(offHandWeapon).append(party).append(potionUsed).append(procs).append(professions).append(race).append(reactionMean).append(reactionNu).append(reactionOffset).append(reactionStddev).append(readyType).append(resources).append(role).append(scaleFactors).append(scalePlayer).append(specialization).append(startedWaiting).append(stats).append(timeofday).append(worldLagOverride).append(worldLagStddevOverride).append(worldLagStddev).append(worldLag).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HealingPlayer) == false) {
            return false;
        }
        HealingPlayer rhs = ((HealingPlayer) other);
        return new EqualsBuilder().append(baseChiRegenPerSecond, rhs.baseChiRegenPerSecond).append(baseEnergyRegenPerSecond, rhs.baseEnergyRegenPerSecond).append(baseFocusRegenPerSecond, rhs.baseFocusRegenPerSecond).append(baseGcd, rhs.baseGcd).append(baseStats, rhs.baseStats).append(brainLagStddev, rhs.brainLagStddev).append(brainLag, rhs.brainLag).append(buffs, rhs.buffs).append(bugs, rhs.bugs).append(collectedData, rhs.collectedData).append(combatReach, rhs.combatReach).append(consumables, rhs.consumables).append(currentStats, rhs.currentStats).append(dbc, rhs.dbc).append(deathPct, rhs.deathPct).append(diminishingReturnsConstants, rhs.diminishingReturnsConstants).append(gains, rhs.gains).append(gcdReady, rhs.gcdReady).append(height, rhs.height).append(initialStats, rhs.initialStats).append(invertScaling, rhs.invertScaling).append(level, rhs.level).append(mainHandWeapon, rhs.mainHandWeapon).append(name, rhs.name).append(offHandWeapon, rhs.offHandWeapon).append(party, rhs.party).append(potionUsed, rhs.potionUsed).append(procs, rhs.procs).append(professions, rhs.professions).append(race, rhs.race).append(reactionMean, rhs.reactionMean).append(reactionNu, rhs.reactionNu).append(reactionOffset, rhs.reactionOffset).append(reactionStddev, rhs.reactionStddev).append(readyType, rhs.readyType).append(resources, rhs.resources).append(role, rhs.role).append(scaleFactors, rhs.scaleFactors).append(scalePlayer, rhs.scalePlayer).append(specialization, rhs.specialization).append(startedWaiting, rhs.startedWaiting).append(stats, rhs.stats).append(timeofday, rhs.timeofday).append(worldLagOverride, rhs.worldLagOverride).append(worldLagStddevOverride, rhs.worldLagStddevOverride).append(worldLagStddev, rhs.worldLagStddev).append(worldLag, rhs.worldLag).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
