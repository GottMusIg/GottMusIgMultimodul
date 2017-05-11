package com.gottmusig.database.service;

import com.gottmusig.database.service.configuration.DatabaseServiceConfiguration;
import com.gottmusig.database.service.domain.GottMusIg;
import com.gottmusig.database.service.domain.account.Account;
import com.gottmusig.database.service.domain.account.jpa.AccountEntity;
import com.gottmusig.database.service.domain.character.Character;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
        ConfigurableApplicationContext run = new Application().run(args);

        GottMusIg bean = run.getBean(GottMusIg.class);

        AccountEntity accountEntity = new AccountEntity();
        Optional<Account> leon = bean.accountService().searchAccount("Leon");
        Character character = bean.characterService().searchCharacter("Blackrock", "Døsenöffner").get();
    }
    
}
