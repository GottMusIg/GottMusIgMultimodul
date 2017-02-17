package com.gottmusig.database.service.jpa.realm;

import com.gottmusig.database.service.domain.realm.Realm;
import com.gottmusig.database.service.jpa.NumericSequenceId;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * @author leong
 * @since 09.12.2016
 */
@Entity
@Table(name = "realm")
public class RealmEntity implements Realm {

    @EmbeddedId
    @Column(name = "id")
    private NumericSequenceId id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    public RealmEntity() {
        this.id = new NumericSequenceId();
    }

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Location getLocation() {
        return Location.valueOf(location);
    }
    public void setLocation(Location location) {
        this.location = location.name();
    }

    @Override
    public NumericSequenceId getId() {
        return id;
    }
    public void setId(NumericSequenceId id) {
        this.id = id;
    }

    public interface RealmRepository extends CrudRepository<RealmEntity, NumericSequenceId> {

        List<Realm> findByLocation(String location);

        Realm findByName(String name);

        List<Realm> findAll(Sort sort);

    }

}
