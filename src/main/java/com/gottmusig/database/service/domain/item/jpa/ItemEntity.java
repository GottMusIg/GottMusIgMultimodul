package com.gottmusig.database.service.domain.item.jpa;

import com.gottmusig.database.service.domain.item.Item;
import com.gottmusig.database.service.domain.jpa.NumericSequenceId;
import com.gottmusig.database.service.domain.jpa.SpringEntityListener;

import javax.persistence.*;

/**
 * @author leong
 * @since 07.05.2017
 */
@Entity
@Table( name = "item")
@EntityListeners(SpringEntityListener.class)
public class ItemEntity implements Item {

    @EmbeddedId
    private NumericSequenceId id;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "name")
    private String name;

    @Column(name = "item_level")
    private Long itemLevel;

    @Column(name = "armor")
    private Long armor;

    @Column(name = "quality")
    private Long quality;

    @OneToOne
    @JoinColumn(name = "tooltip_params_id", referencedColumnName = "id")
    private TooltipParamsEntity tooltipParams;

    @Column(name = "context")
    private String context;

    public ItemEntity() {
        this.id = new NumericSequenceId();
    }

    public ItemEntity getUnusedSlot() {
        this.setItemLevel(0L);
        this.setItemId(0L);
        this.setName("unused");
        return this;
    }

    public NumericSequenceId getId() {
        return id;
    }

    public void setId(NumericSequenceId id) {
        this.id = id;
    }

    @Override
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(Long itemLevel) {
        this.itemLevel = itemLevel;
    }

    @Override
    public Long getArmor() {
        return armor;
    }

    public void setArmor(Long armor) {
        this.armor = armor;
    }

    @Override
    public Long getQuality() {
        return quality;
    }

    public void setQuality(Long quality) {
        this.quality = quality;
    }

    public TooltipParamsEntity getTooltipParams() {
        return tooltipParams;
    }

    public void setTooltipParams(TooltipParamsEntity tooltipParams) {
        this.tooltipParams = tooltipParams;
    }

    @Override
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
