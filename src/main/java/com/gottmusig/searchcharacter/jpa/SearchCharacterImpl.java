package com.gottmusig.searchcharacter.jpa;

import com.google.gson.Gson;
import com.gottmusig.character.domain.api.Character;
import com.gottmusig.character.jpa.CharacterEntity;
import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import com.gottmusig.rest.blizzard.RestClient;
import com.gottmusig.searchcharacter.domain.api.Realm;
import com.gottmusig.searchcharacter.domain.api.SearchCharacter;
import com.gottmusig.searchcharacter.jpa.RealmEntity.RealmRepository;
import com.gottmusig.utils.character.CharacterPOJO;
import com.gottmusig.utils.character.WOWClassId;
import com.gottmusig.utils.exception.CharacterNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author leong
 * @since 09.12.2016
 */

public class SearchCharacterImpl implements SearchCharacter {

    @Autowired
    private transient RealmRepository realmRepository;
    @Autowired
    private transient RestClient restClient;
    @Autowired
    private transient CharacterEntity.CharacterRepository characterRepository;
    @Autowired
    private transient DPSDifference dpsDifference;

    @Override
    public List<Location> getAllLocations() {
        return (Location.getLocations());
    }

    @Override
    public Optional<Character> searchCharacter(Location location, String realm, String characterName) {
        Optional<Character> character = Optional.ofNullable(characterRepository.findByNameAndRealm(characterName, realmRepository.findByName(realm)));
        if (character.isPresent()) {
            return character;
        }
        String response = null;
        try {
            response = restClient.searchCharacter(location.name(), realm, characterName);
        } catch (CharacterNotFoundException e) {
            return Optional.empty();
        }
        character = Optional.of(characterRepository.save((CharacterEntity) getCharacterFromResponse(response)));
        return character;
    }

    private Character getCharacterFromResponse(String response) {
        Gson gson = new Gson();
        CharacterPOJO characterIntermediate = gson.fromJson(response, CharacterPOJO.class);
        return convertIntermediate(characterIntermediate);
    }

    private Character convertIntermediate(CharacterPOJO characterIntermediate) {
        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setThumbnailId(characterIntermediate.getThumbnail().replaceAll("-avatar.jpg", ""));
        characterEntity.setRealm(realmRepository.findByName(characterIntermediate.getRealm()));
        characterEntity.setDPS(0);
        characterEntity.setName(characterIntermediate.getName());
        String specification = characterIntermediate.getTalents().get(0).getSpec().getName();
        int wowClassId = Math.toIntExact(characterIntermediate.get_Class());
        characterEntity.setClassSpecification(dpsDifference.findClassSpecification(specification, WOWClassId.getWowClassName(wowClassId)).get());
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
