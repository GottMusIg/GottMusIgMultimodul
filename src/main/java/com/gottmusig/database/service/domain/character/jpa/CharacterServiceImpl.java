package com.gottmusig.database.service.domain.character.jpa;

import com.google.gson.Gson;
import com.gottmusig.database.service.domain.character.Character;
import com.gottmusig.database.service.domain.character.CharacterService;
import com.gottmusig.database.service.domain.character.jpa.blizzard.SearchCharacterClient;
import com.gottmusig.database.service.domain.character.jpa.characterpojo.CharacterPOJO;
import com.gottmusig.database.service.domain.character.jpa.characterpojo.WOWClassId;
import com.gottmusig.database.service.domain.character.jpa.exception.CharacterNotFoundException;
import com.gottmusig.database.service.domain.realm.Realm;
import com.gottmusig.database.service.domain.realm.jpa.RealmEntity;
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

    @Autowired
    private transient SearchCharacterClient searchCharacterClient;

    @Autowired
    private transient CharacterEntity.CharacterRepository characterRepository;

    @Autowired
    private transient WOWClassEntity.WOWClassRepository wowClassRepository;

    @Autowired
    private transient RealmEntity.RealmRepository realmRepository;

    private final transient Gson gson = new Gson();

    @Override
    public Optional<Character> searchCharacter(String realmName, String name) {
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

        CharacterPOJO characterPOJO = gson.fromJson(response, CharacterPOJO.class);

        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setThumbnailId(characterPOJO.getThumbnail().replaceAll("-avatar[.]jpg",""));

        ClassSpecificationEntity specificationEntity = new ClassSpecificationEntity();
        specificationEntity.setName(characterPOJO.getTalents().get(0).getSpec().getName());
        String wowClassName = WOWClassId.getWowClassName(characterPOJO.get_Class());
        specificationEntity.setWowClass(wowClassRepository.findByName(wowClassName));

        characterEntity.setClassSpecification(specificationEntity);

        return characterEntity;
    }
}
