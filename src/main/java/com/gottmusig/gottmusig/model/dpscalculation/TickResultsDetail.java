
package com.gottmusig.gottmusig.model.dpscalculation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

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

@EqualsAndHashCode
@Getter
@ToString
public class TickResultsDetail {

    
    @JsonProperty("actual_amount")
    private ActualAmount actualAmount;
    
    @JsonProperty("avg_actual_amount")
    private AvgActualAmount avgActualAmount;
    
    @JsonProperty("count")
    private Count count;
    
    @JsonProperty("fight_actual_amount")
    private FightActualAmount fightActualAmount;
    
    @JsonProperty("fight_total_amount")
    private FightTotalAmount fightTotalAmount;
    
    @JsonProperty("overkill_pct")
    private OverkillPct overkillPct;
    
    @JsonProperty("pct")
    private Double pct;
    
    @JsonProperty("result")
    private String result;
    
    @JsonProperty("total_amount")
    private TotalAmount totalAmount;


}
