
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
    "actual_amount",
    "avg_actual_amount",
    "count",
    "fight_actual_amount",
    "fight_total_amount",
    "overkill_pct",
    "pct",
    "result",
    "total_amount"
})
public class TickResult {

    /**
     * 
     */
    @JsonProperty("actual_amount")
    private ActualAmount actualAmount;
    /**
     * 
     */
    @JsonProperty("avg_actual_amount")
    private AvgActualAmount avgActualAmount;
    /**
     * 
     */
    @JsonProperty("count")
    private Count count;
    /**
     * 
     */
    @JsonProperty("fight_actual_amount")
    private FightActualAmount fightActualAmount;
    /**
     * 
     */
    @JsonProperty("fight_total_amount")
    private FightTotalAmount fightTotalAmount;
    /**
     * 
     */
    @JsonProperty("overkill_pct")
    private OverkillPct overkillPct;
    /**
     * 
     */
    @JsonProperty("pct")
    private Double pct;
    /**
     * 
     */
    @JsonProperty("result")
    private String result;
    /**
     * 
     */
    @JsonProperty("total_amount")
    private TotalAmount totalAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The actualAmount
     */
    @JsonProperty("actual_amount")
    public ActualAmount getActualAmount() {
        return actualAmount;
    }

    /**
     * 
     * @param actualAmount
     *     The actual_amount
     */
    @JsonProperty("actual_amount")
    public void setActualAmount(ActualAmount actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * 
     * @return
     *     The avgActualAmount
     */
    @JsonProperty("avg_actual_amount")
    public AvgActualAmount getAvgActualAmount() {
        return avgActualAmount;
    }

    /**
     * 
     * @param avgActualAmount
     *     The avg_actual_amount
     */
    @JsonProperty("avg_actual_amount")
    public void setAvgActualAmount(AvgActualAmount avgActualAmount) {
        this.avgActualAmount = avgActualAmount;
    }

    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public Count getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(Count count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The fightActualAmount
     */
    @JsonProperty("fight_actual_amount")
    public FightActualAmount getFightActualAmount() {
        return fightActualAmount;
    }

    /**
     * 
     * @param fightActualAmount
     *     The fight_actual_amount
     */
    @JsonProperty("fight_actual_amount")
    public void setFightActualAmount(FightActualAmount fightActualAmount) {
        this.fightActualAmount = fightActualAmount;
    }

    /**
     * 
     * @return
     *     The fightTotalAmount
     */
    @JsonProperty("fight_total_amount")
    public FightTotalAmount getFightTotalAmount() {
        return fightTotalAmount;
    }

    /**
     * 
     * @param fightTotalAmount
     *     The fight_total_amount
     */
    @JsonProperty("fight_total_amount")
    public void setFightTotalAmount(FightTotalAmount fightTotalAmount) {
        this.fightTotalAmount = fightTotalAmount;
    }

    /**
     * 
     * @return
     *     The overkillPct
     */
    @JsonProperty("overkill_pct")
    public OverkillPct getOverkillPct() {
        return overkillPct;
    }

    /**
     * 
     * @param overkillPct
     *     The overkill_pct
     */
    @JsonProperty("overkill_pct")
    public void setOverkillPct(OverkillPct overkillPct) {
        this.overkillPct = overkillPct;
    }

    /**
     * 
     * @return
     *     The pct
     */
    @JsonProperty("pct")
    public Double getPct() {
        return pct;
    }

    /**
     * 
     * @param pct
     *     The pct
     */
    @JsonProperty("pct")
    public void setPct(Double pct) {
        this.pct = pct;
    }

    /**
     * 
     * @return
     *     The result
     */
    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 
     * @return
     *     The totalAmount
     */
    @JsonProperty("total_amount")
    public TotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * 
     * @param totalAmount
     *     The total_amount
     */
    @JsonProperty("total_amount")
    public void setTotalAmount(TotalAmount totalAmount) {
        this.totalAmount = totalAmount;
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
        return new HashCodeBuilder().append(actualAmount).append(avgActualAmount).append(count).append(fightActualAmount).append(fightTotalAmount).append(overkillPct).append(pct).append(result).append(totalAmount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TickResult) == false) {
            return false;
        }
        TickResult rhs = ((TickResult) other);
        return new EqualsBuilder().append(actualAmount, rhs.actualAmount).append(avgActualAmount, rhs.avgActualAmount).append(count, rhs.count).append(fightActualAmount, rhs.fightActualAmount).append(fightTotalAmount, rhs.fightTotalAmount).append(overkillPct, rhs.overkillPct).append(pct, rhs.pct).append(result, rhs.result).append(totalAmount, rhs.totalAmount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
