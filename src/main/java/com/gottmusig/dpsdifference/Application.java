package com.gottmusig.dpsdifference;

import com.gottmusig.searchcharacter.configuration.SearchCharacterConfiguration;
import com.gottmusig.searchcharacter.domain.api.Realm;
import com.gottmusig.searchcharacter.domain.api.SearchCharacter;
import com.gottmusig.searchcharacter.jpa.Location;
import com.gottmusig.searchcharacter.jpa.RealmEntity;
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
        realmEntity.setLocation(Location.de_DE);
        realmEntity.setName("Blackhand");
        searchCharacter.saveRealm(realmEntity.getName(), realmEntity.getLocation());
        Realm realm = searchCharacter.getAllRealms().get(0);
        System.out.println(realm.getLocation());
        System.out.println(realm.getName());
    }

}
