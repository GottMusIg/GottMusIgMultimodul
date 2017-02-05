package com.gottmusig.searchcharacter.jpa;

import com.google.gson.Gson;
import com.gottmusig.character.domain.api.Character;
import com.gottmusig.character.jpa.CharacterEntity;
import com.gottmusig.dpsdifference.jpa.ClassSpecificationEntity;
import com.gottmusig.rest.blizzard.RestClient;
import com.gottmusig.searchcharacter.domain.api.Realm;
import com.gottmusig.searchcharacter.domain.api.SearchCharacter;
import com.gottmusig.searchcharacter.jpa.RealmEntity.RealmRepository;
import com.gottmusig.utils.CharacterPOJO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author leong
 * @since 09.12.2016
 */

public class SearchCharacterImpl implements SearchCharacter {

    @Autowired transient RealmRepository realmRepository;
    @Autowired transient RestClient restClient;
    @Autowired
    transient CharacterEntity.CharacterRepository characterRepository;
    @Autowired
    transient ClassSpecificationEntity.ClassSpecificationRepository classSpecificationRepository;

    @Override
    public List<Location> getAllLocations() {
        return (Location.getLocations());
    }

    @Override
    public Optional<Character> searchCharacter(Location location, String realm, String characterName) {
        Optional<Character> character = Optional.ofNullable(characterRepository.findByName(characterName));
        if (!character.isPresent()) {
            character = getCharacterFromBlizzard(restClient.searchCharacter(location.name(), realm, characterName));
        }
        return character;
    }

    private Optional<Character> getCharacterFromBlizzard(String response) {
        Gson gson = new Gson();
        Optional<CharacterPOJO> characterIntermediate = Optional.of(gson.fromJson(response, CharacterPOJO.class));
        Optional<Character> characterOptional = Optional.empty();
        if (characterIntermediate.isPresent()) {
            Character character = convertIntermediate(characterIntermediate.get());
            characterOptional = Optional.of(character);
        }
        return characterOptional;
    }

    private Character convertIntermediate(CharacterPOJO characterIntermediate) {
        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setThumbnailId(characterIntermediate.getThumbnail().replaceAll("-avatar.jpg", ""));
        characterEntity.setRealm(realmRepository.findByName(characterIntermediate.getRealm()));
        characterEntity.setDPS(0);
        characterEntity.setName(characterIntermediate.getName());
        characterEntity.setClassSpecification(classSpecificationRepository.findByName(characterIntermediate.getTalents().get(0).getSpec().getName()));
        return characterEntity;
    }

    @Override
    public void saveRealm(String name, Location location) {
        RealmEntity realm = new RealmEntity();
        realm.setLocation(location);
        realm.setName(name);
        realmRepository.save(realm);
    }

    @Override
    public List<Realm> getAllRealms() {

        return ((List<RealmEntity>) realmRepository.findAll()).stream().map(realmEntity -> (Realm) realmEntity).collect(Collectors.toList());

    }

    @Override
    public List<String> getRealms(Location location) {

        return realmRepository.findByLocation(location.name()).stream().map(Realm::getName).collect(Collectors.toList());

    }
}
