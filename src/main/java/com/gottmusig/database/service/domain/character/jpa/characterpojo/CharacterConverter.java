package com.gottmusig.database.service.domain.character.jpa.characterpojo;

import com.gottmusig.database.service.domain.character.jpa.CharacterEntity;
import com.gottmusig.database.service.domain.character.jpa.ClassSpecificationEntity;
import com.gottmusig.database.service.domain.character.jpa.WOWClassEntity;
import com.gottmusig.database.service.domain.item.jpa.EquipmentSetImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

/**
 * @author leong
 * @since 27.04.2017
 */
@Service
public class CharacterConverter implements Converter<WoWCharacter, CharacterEntity> {


    @Autowired
    WOWClassEntity.WOWClassRepository wowClassRepository;

    @Override
    public CharacterEntity convert(WoWCharacter source) {
        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setThumbnailId(source.getThumbnail().replaceAll("-avatar[.]jpg",""));

        ClassSpecificationEntity specificationEntity = new ClassSpecificationEntity();
        specificationEntity.setName(source.getTalents().get(0).getSpec().getName());
        String wowClassName = WOWClassId.getWowClassName(source.getClazz());
        specificationEntity.setWowClass(wowClassRepository.findByName(wowClassName));
        characterEntity.setClassSpecification(specificationEntity);
        characterEntity.setEquipmentSet(new EquipmentSetImpl(source.getItems()));
        return characterEntity;
    }

}
