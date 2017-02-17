package com.gottmusig.database.service;

import com.gottmusig.database.service.configuration.DatabaseServiceConfiguration;
import com.gottmusig.database.service.domain.GottMusIg;
import com.gottmusig.database.service.domain.account.Account;
import com.gottmusig.database.service.domain.character.Character;
import com.gottmusig.database.service.domain.realm.Realm;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

/**
 * @author leong
 * @since 24.11.2016
 */
public class Application extends SpringApplication {

    public Application() {
        super(DatabaseServiceConfiguration.class);
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext run = new Application().run();

        GottMusIg gottMusIg = run.getBean(GottMusIg.class);
        Optional<Account> testlul = gottMusIg.accountService()
                                             .searchAccount("Testlul");
        List<Realm> realms = gottMusIg.realmService()
                                         .getAllRealms();
        Realm blackhand = null;
        for(Realm realm : realms) {
            if(realm.getName().equals("Blackhand")) {
                blackhand = realm;
                break;
            }
        }
        Optional<Character> malahkh = gottMusIg.characterService()
                                               .searchCharacter("Malahkh", blackhand);

        testlul.get().addCharacter(malahkh.get());
        List<Character> characters = testlul.get()
                                            .getCharacters();
    }
}