package com.gottmusig.database.service.deprecated.searchcharacter.jpa;

import com.google.gson.Gson;
import com.gottmusig.database.service.deprecated.searchcharacter.domain.api.SearchCharacter;
import com.gottmusig.database.service.domain.character.Character;
import com.gottmusig.database.service.domain.character.ClassSpecification;
import com.gottmusig.database.service.domain.realm.Realm;
import com.gottmusig.database.service.domain.simulation.DPSDifference;
import com.gottmusig.database.service.jpa.blizzard.RestClient;
import com.gottmusig.database.service.jpa.character.CharacterEntity;
import com.gottmusig.database.service.jpa.character.ClassSpecificationEntity;
import com.gottmusig.database.service.jpa.character.characterpojo.CharacterPOJO;
import com.gottmusig.database.service.jpa.character.characterpojo.WOWClassId;
import com.gottmusig.database.service.jpa.character.exception.CharacterNotFoundException;
import com.gottmusig.database.service.jpa.realm.Location;
import com.gottmusig.database.service.jpa.realm.RealmEntity;
import com.gottmusig.database.service.jpa.realm.RealmEntity.RealmRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * @author leong
 * @since 09.12.2016
 */
public class SearchCharacterImpl implements SearchCharacter {

    private final transient RealmRepository realmRepository;
    private final transient RestClient restClient;
    private final transient CharacterEntity.CharacterRepository characterRepository;
    private final transient DPSDifference dpsDifference;
    private final transient ClassSpecificationEntity.ClassSpecificationRepository classSpecificationRepository;

    @Autowired
    public SearchCharacterImpl(RealmRepository realmRepository, RestClient restClient,
                               CharacterEntity.CharacterRepository characterRepository, DPSDifference dpsDifference,
                               ClassSpecificationEntity.ClassSpecificationRepository classSpecificationRepository) {
        this.realmRepository = realmRepository;
        this.restClient = restClient;
        this.characterRepository = characterRepository;
        this.dpsDifference = dpsDifference;
        this.classSpecificationRepository = classSpecificationRepository;
    }

    @Override
    public List<Location> getAllLocations() {
        return (Location.getLocations());
    }

    @Override
    public Optional<Character> searchCharacter(Location location, Realm realm, String name) {
        Optional<Character> character = characterRepository.findByNameAndRealm(name, realm);
        if (character.isPresent()) {
            return character;
        }
        String response;
        try {
            response = restClient.searchCharacter(location.name(), realm.getName(), name);
        } catch (CharacterNotFoundException e) {
            return Optional.empty();
        }
        character = Optional.of(characterRepository.save(getCharacterFromResponse(response)));
        return character;
    }

    private CharacterEntity getCharacterFromResponse(String response) {
        Gson gson = new Gson();
        CharacterPOJO characterIntermediate = gson.fromJson(response, CharacterPOJO.class);
        return convertIntermediate(characterIntermediate);
    }

    private CharacterEntity convertIntermediate(CharacterPOJO characterIntermediate) {
        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setThumbnailId(characterIntermediate.getThumbnail().replaceAll("-avatar.jpg", ""));
        characterEntity.setDPS(0);
        characterEntity.setName(characterIntermediate.getName());
        String specification = characterIntermediate.getTalents().get(0).getSpec().getName();
        int wowClassId = Math.toIntExact(characterIntermediate.get_Class());
        Optional<ClassSpecification> classSpecification = dpsDifference.findClassSpecification(specification,
                                                                                               WOWClassId.getWowClassName(
                                                                                                       wowClassId));
        classSpecification.ifPresent(characterEntity::setClassSpecification);
        return characterEntity;
    }

    @Override
    public Realm saveRealm(String name, Location location) {
        RealmEntity realm = new RealmEntity();
        realm.setLocation(location);
        realm.setName(name);
        return realmRepository.save(realm);
    }

    @Override
    public List<Realm> getAllRealms() {
        return realmRepository.find();
    }

    @Override
    public List<Realm> getRealms(Location location) {
        return realmRepository.findByLocation(location.name());
    }
}
