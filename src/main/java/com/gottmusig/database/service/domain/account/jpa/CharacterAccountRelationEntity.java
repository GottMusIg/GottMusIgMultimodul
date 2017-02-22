package com.gottmusig.database.service.domain.account.jpa;

import com.gottmusig.database.service.domain.account.CharacterAccountRelation;
import com.gottmusig.database.service.domain.character.jpa.CharacterEntity;
import com.gottmusig.database.service.domain.jpa.NumericSequenceId;
import com.gottmusig.database.service.domain.jpa.SpringEntityListener;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

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

    public interface CharacterAccountRelationRepository extends CrudRepository<CharacterAccountRelationEntity, NumericSequenceId> {

        List<CharacterAccountRelationEntity> findByAccount(AccountEntity account);

        CharacterAccountRelationEntity findFirstByAccount(AccountEntity account);

        Optional<CharacterAccountRelationEntity> findFirstByAccountAndCharacter(AccountEntity account, CharacterEntity character);

    }
}
