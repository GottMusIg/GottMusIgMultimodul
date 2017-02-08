package com.gottmusig.account.jpa;

import com.gottmusig.account.domain.api.CharacterAccountRelation;
import com.gottmusig.character.jpa.CharacterEntity;
import com.gottmusig.dpsdifference.jpa.NumericSequenceId;
import com.gottmusig.utils.SpringEntityListener;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.List;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Entity
@Table(name = "characteraccountrelation")
@EntityListeners(SpringEntityListener.class)
public class CharacterAccountRelationEntity implements CharacterAccountRelation {

    @EmbeddedId
    private NumericSequenceId id;

    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private AccountEntity account;

    @OneToOne
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private CharacterEntity character;

    public CharacterAccountRelationEntity() {
        this.id = new NumericSequenceId();
    }

    @Override
    public Id getId() {
        return id;
    }

    @Override
    public AccountEntity getAccount() {
        return account;
    }

    @Override
    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    @Override
    public CharacterEntity getCharacter() {
        return character;
    }

    @Override
    public void setCharacter(CharacterEntity character) {
        this.character = character;
    }

    public static interface CharacterAccountRelationRepository extends CrudRepository<CharacterAccountRelationEntity, NumericSequenceId> {

        List<CharacterAccountRelationEntity> findByAccount(AccountEntity account);

    }
}
