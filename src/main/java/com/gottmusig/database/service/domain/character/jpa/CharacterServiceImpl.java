package com.gottmusig.database.service.domain.character.jpa;

import com.google.gson.Gson;
import com.gottmusig.database.service.domain.character.Character;
import com.gottmusig.database.service.domain.character.CharacterService;
import com.gottmusig.database.service.domain.character.jpa.CharacterEntity.CharacterRepository;
import com.gottmusig.database.service.domain.character.jpa.blizzard.SearchCharacterClient;
import com.gottmusig.database.service.domain.character.jpa.characterpojo.CharacterConverter;
import com.gottmusig.database.service.domain.character.jpa.characterpojo.WoWCharacter;
import com.gottmusig.database.service.domain.character.jpa.exception.CharacterNotFoundException;
import com.gottmusig.database.service.domain.realm.Realm;
import com.gottmusig.database.service.domain.realm.jpa.RealmEntity.RealmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired SearchCharacterClient searchCharacterClient;
    @Autowired CharacterRepository characterRepository;
    @Autowired RealmRepository realmRepository;
    @Autowired CharacterConverter characterConverter;

    private final transient Gson gson = new Gson();



    @Override
    public Optional<Character> searchCharacter(String realmName, String name) {
        //TODO wtf?
        Realm realm = realmRepository.findByName(realmName).get();
        Optional<Character> characterOptional = characterRepository.findByNameAndRealm(name, realm);
        if(characterOptional.isPresent()) {
            return characterOptional;
        }
        return searchCharacterViaBlizzard(name, realm);
    }

    @Override
    public Character saveCharacter(Character character) {
        return characterRepository.save((CharacterEntity) character);
    }

    private Optional<Character> searchCharacterViaBlizzard(String name, Realm realm) {

        String response;
        try {
            response = searchCharacterClient.searchCharacter(realm.getName(), name);
        } catch (CharacterNotFoundException e) {
            return Optional.empty();
        }
        CharacterEntity characterEntity = createCharacterFromResponse(response);
        characterEntity.setRealm(realm);
        characterEntity.setName(name);

        return Optional.of(characterEntity);
    }

    private CharacterEntity createCharacterFromResponse(String response) {

        WoWCharacter characterPOJO = gson.fromJson(response, WoWCharacter.class);
        return characterConverter.convert(characterPOJO);
    }
}
