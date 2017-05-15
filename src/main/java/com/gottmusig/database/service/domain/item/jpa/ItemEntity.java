package com.gottmusig.database.service.domain.item.jpa;

import com.gottmusig.database.service.domain.item.Item;
import com.gottmusig.database.service.domain.jpa.NumericSequenceId;
import com.gottmusig.database.service.domain.jpa.SpringEntityListener;
import org.springframework.data.repository.CrudRepository;

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

    @Column(name = "wowhead_tooltip")
    private String wowHeadTooltip;

    @Column(name = "context")
    private String context;

    @Override
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public ItemEntity() {
        this.id = new NumericSequenceId();
    }

    public NumericSequenceId getId() {
        return id;
    }

    public void setId(NumericSequenceId id) {
        this.id = id;
    }

    @Override
    public String getWowHeadTooltip() {
        return wowHeadTooltip;
    }

    public void setWowHeadTooltip(String wowHeadTooltip) {
        this.wowHeadTooltip = wowHeadTooltip;
    }

    public interface ItemRepository extends CrudRepository<ItemEntity, NumericSequenceId> {

        ItemEntity findByWowHeadTooltip(String wowHeadTooltip);
    }
}
