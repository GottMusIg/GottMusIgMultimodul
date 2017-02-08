package com.gottmusig;

import com.gottmusig.account.configuration.AccountConfiguration;
import com.gottmusig.account.domain.api.Account;
import com.gottmusig.account.domain.api.AccountAdministration;
import com.gottmusig.character.domain.api.Character;
import com.gottmusig.searchcharacter.domain.api.SearchCharacter;
import com.gottmusig.searchcharacter.jpa.Location;
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
        super(AccountConfiguration.class, SearchCharacter.class);
    }



    public static void main(String[] args) {


        Application application = new Application();
        ConfigurableApplicationContext run = application.run();
        SearchCharacter searchCharacter = run.getBean(SearchCharacter.class);
        AccountAdministration accountAdministration = run.getBean(AccountAdministration.class);
        Character character = searchCharacter.searchCharacter(Location.de_DE, "Blackhand", "Glurak").get();
        Character malahkh = searchCharacter.searchCharacter(Location.de_DE,"Blackhand", "Malahkh").get();
        Optional<Account> cem = accountAdministration.searchAccount("Cem");
        Account account = cem.orElse(null);
        account.addCharacter(malahkh);
        List<Character> characters = account.getCharacters();
    }
}