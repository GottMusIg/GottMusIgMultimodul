package com.gottmusig;

import com.gottmusig.account.configuration.AccountConfiguration;
import com.gottmusig.character.configuration.CharacterConfiguration;
import com.gottmusig.dpsdifference.configuration.DPSDifferenceConfiguration;
import org.springframework.boot.SpringApplication;

/**
 * @author leong
 * @since 24.11.2016
 */

public class Application extends SpringApplication {

    public Application() {
        super(AccountConfiguration.class, CharacterConfiguration.class, DPSDifferenceConfiguration.class);
    }



    public static void main(String[] args) {
        /*
        Application application = new Application();
        ConfigurableApplicationContext run = application.run();
        AccountAdministration accountAdministration = run.getBean(AccountAdministration.class);
        DPSDifference dpsDifference = run.getBean(DPSDifference.class);
        dpsDifference.findWOWClass("Warrior");
*/

    }

}
