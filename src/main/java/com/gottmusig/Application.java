package com.gottmusig;

import com.gottmusig.searchcharacter.configuration.SearchCharacterConfiguration;
import com.gottmusig.searchcharacter.domain.api.SearchCharacter;
import com.gottmusig.searchcharacter.jpa.Location;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author leong
 * @since 24.11.2016
 */

public class Application extends SpringApplication {

    public Application() {
        super(SearchCharacterConfiguration.class);
    }



    public static void main(String[] args) {

        Application application = new Application();
        ConfigurableApplicationContext run = application.run();
        SearchCharacter searchCharacter = run.getBean(SearchCharacter.class);
        String character = searchCharacter.searchCharacter(Location.de_DE, "Blackhand", "Malahkh");
        System.out.println(character);
    }

}
