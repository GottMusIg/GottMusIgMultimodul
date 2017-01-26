package com.gottmusig;

import com.gottmusig.account.configuration.AccountConfiguration;
import com.gottmusig.account.domain.api.AccountAdministration;
import com.gottmusig.account.jpa.AccountEntity;
import com.gottmusig.character.domain.api.Character;
import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author leong
 * @since 24.11.2016
 */

public class Application extends SpringApplication {

    public Application() {
        super(AccountConfiguration.class);
    }



    public static void main(String[] args) {


        Application application = new Application();
        ConfigurableApplicationContext run = application.run();
        DPSDifference dpsDifference = run.getBean(DPSDifference.class);
        AccountAdministration accountAdministration = run.getBean(AccountAdministration.class);
        AccountEntity accountEntity = (AccountEntity) accountAdministration.searchAccount("Cem").get();
        Character character = accountEntity.addCharacter("Patin", "Blackhand", "Holy", "Priest", 2);
    }

}
