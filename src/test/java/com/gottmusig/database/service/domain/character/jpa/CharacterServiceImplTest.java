package com.gottmusig.database.service.domain.character.jpa;

import com.google.gson.Gson;
import com.gottmusig.database.service.domain.character.jpa.characterpojo.WOWClassId;
import com.gottmusig.database.service.domain.character.jpa.characterpojo.WoWCharacter;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

/**
 * @author leong
 * @since 16.05.2017
 */
public class CharacterServiceImplTest {

    private Gson gson = new Gson();


    private WoWCharacter woWCharacter() throws IOException {

        String characterString = new BufferedReader(new FileReader(Paths.get("src/test/resources/testCharacter").toFile())).readLine();
        return gson.fromJson(characterString, WoWCharacter.class);
    }


    @Test
    public void testConvertCharacterName() throws Exception {

        CharacterEntity characterEntity = new CharacterEntity();
        WoWCharacter woWCharacter = woWCharacter();
        characterEntity.setName(woWCharacter.getName());

        assertEquals("Malahkh", characterEntity.getName());
    }

    @Test
    public void testConvertClassSpecification() throws Exception {

        CharacterEntity characterEntity = new CharacterEntity();
        WoWCharacter woWCharacter = woWCharacter();
        ClassSpecificationEntity classSpecificationEntity = new ClassSpecificationEntity();
        classSpecificationEntity.setName(woWCharacter.getTalents().get(0).getSpec().getName());

        WOWClassEntity wowClassEntity = new WOWClassEntity();
        String wowClassName = WOWClassId.getWowClassName(woWCharacter.getClazz());
        wowClassEntity.setName(wowClassName);

        assertEquals("Fury", classSpecificationEntity.getName());
        assertEquals("Warrior", wowClassEntity.getName());
    }

}