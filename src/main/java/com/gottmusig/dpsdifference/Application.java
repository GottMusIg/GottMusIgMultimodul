package com.gottmusig.dpsdifference;

import com.gottmusig.searchcharacter.configuration.SearchCharacterConfiguration;
import com.gottmusig.searchcharacter.domain.api.RealmLocation;
import com.gottmusig.searchcharacter.domain.api.SearchCharacter;
import com.gottmusig.searchcharacter.jpa.RealmEntity;
import com.gottmusig.searchcharacter.jpa.RealmLocationEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author leong
 * @since 24.11.2016
 */

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SearchCharacterConfiguration.class);
        SearchCharacter searchCharacter = context.getBean(SearchCharacter.class);
        RealmEntity realmEntity = new RealmEntity();
        realmEntity.setName("Blackhand");
        realmEntity.setLocation(RealmLocation.Location.de_DE);
        System.out.println(searchCharacter.getAllRealms(RealmLocation.Location.de_DE));
        System.out.println(searchCharacter.searchCharacter(new RealmLocationEntity(RealmLocation.Location.de_DE), realmEntity,"Malahkh"));
    }
}
