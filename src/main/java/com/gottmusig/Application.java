package com.gottmusig;

import com.gottmusig.account.configuration.AccountConfiguration;
import com.gottmusig.account.domain.api.AccountAdministration;
import com.gottmusig.account.jpa.AccountEntity;
import com.gottmusig.character.configuration.CharacterConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author leong
 * @since 24.11.2016
 */

public class Application extends SpringApplication {

    public Application() {
        super(AccountConfiguration.class, CharacterConfiguration.class);
    }



    public static void main(String[] args) {
        Application application = new Application();
        ConfigurableApplicationContext run = application.run();
        AccountAdministration accountAdministration = run.getBean(AccountAdministration.class);
        AccountEntity entity = (AccountEntity) accountAdministration.searchAccount("Penis123").get();
        entity.addCharacter("Malahkh", "Blackhand", "Fury", "Warrior", 2);

    }

}
