package com.gottmusig.database.service.domain.item.jpa;

import com.gottmusig.database.service.domain.jpa.NumericSequenceId;
import com.gottmusig.database.service.domain.jpa.SpringEntityListener;

import javax.persistence.*;

/**
 * @author leong
 * @since 07.05.2017
 */
@Entity
@Table(name = "tooltip_params")
@EntityListeners(SpringEntityListener.class)
public class TooltipParamsEntity {

    @EmbeddedId
    private NumericSequenceId id;

    @Column(name = "enchant")
    private Long enchant;

    @Column(name = "gem0")
    private Long gem0;

    @Column(name = "gem1")
    private Long gem1;

    @Column(name = "gem2")
    private Long gem2;

    @Column(name = "transmog_item")
    private Long transmogItemId;

    public TooltipParamsEntity() {
        this.id = new NumericSequenceId();
    }

    public NumericSequenceId getId() {
        return id;
    }

    public Long getEnchant() {
        return enchant;
    }

    public void setEnchant(Long enchant) {
        this.enchant = enchant;
    }

    public Long getGem0() {
        return gem0;
    }

    public void setGem0(Long gem0) {
        this.gem0 = gem0;
    }

    public Long getGem1() {
        return gem1;
    }

    public void setGem1(Long gem1) {
        this.gem1 = gem1;
    }

    public Long getGem2() {
        return gem2;
    }

    public void setGem2(Long gem2) {
        this.gem2 = gem2;
    }

    public Long getTransmogItemId() {
        return transmogItemId;
    }

    public void setTransmogItemId(Long transmogItemId) {
        this.transmogItemId = transmogItemId;
    }
}
