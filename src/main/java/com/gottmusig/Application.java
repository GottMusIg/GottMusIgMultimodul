package com.gottmusig;

import com.gottmusig.account.configuration.AccountConfiguration;
import com.gottmusig.account.domain.api.Account;
import com.gottmusig.account.domain.api.AccountAdministration;
import com.gottmusig.character.domain.api.Character;
import com.gottmusig.dpsdifference.configuration.DPSDifferenceConfiguration;
import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import com.gottmusig.dpsdifference.domain.api.SpecificationDPS;
import com.gottmusig.searchcharacter.configuration.SearchCharacterConfiguration;
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
        super(DPSDifferenceConfiguration.class, SearchCharacterConfiguration.class, AccountConfiguration.class);
    }

    public static void main(String[] args) {
        Application application = new Application();
        ConfigurableApplicationContext run = application.run();
        DPSDifference bean = run.getBean(DPSDifference.class);
        AccountAdministration accountAdministration = run.getBean(AccountAdministration.class);
        Optional<Account> cem = accountAdministration.searchAccount("Cem");
        SearchCharacter bean1 = run.getBean(SearchCharacter.class);
        Character character = bean1.searchCharacter(Location.de_DE, "Blackhand", "Malahkh").get();
        List<SpecificationDPS> allDPSValues = bean.getAllDPSValues();
        allDPSValues.stream().map(SpecificationDPS::getSpecificationDPS).peek(System.out::println);
        cem.get().addCharacter(character);
    }
}