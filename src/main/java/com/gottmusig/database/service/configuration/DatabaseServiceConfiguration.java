package com.gottmusig.database.service.configuration;

import com.gottmusig.database.service.domain.GottMusIg;
import com.gottmusig.database.service.domain.account.AccountService;
import com.gottmusig.database.service.domain.account.jpa.AccountServiceImpl;
import com.gottmusig.database.service.domain.character.CharacterService;
import com.gottmusig.database.service.domain.character.jpa.CharacterServiceImpl;
import com.gottmusig.database.service.domain.character.jpa.blizzard.SearchCharacterClient;
import com.gottmusig.database.service.domain.dpsdifference.DPSDifferenceService;
import com.gottmusig.database.service.domain.dpsdifference.jpa.DPSDifferenceServiceImpl;
import com.gottmusig.database.service.domain.item.ItemService;
import com.gottmusig.database.service.domain.item.jpa.ItemServiceImpl;
import com.gottmusig.database.service.domain.jpa.GottMusIgImpl;
import com.gottmusig.database.service.domain.realm.RealmService;
import com.gottmusig.database.service.domain.realm.jpa.RealmServiceImpl;
import com.gottmusig.database.service.domain.simulation.SimulationService;
import com.gottmusig.database.service.domain.simulation.jpa.SimulationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Configuration
@Import(JpaConfiguration.class)
@PropertySource({"classpath:blizzard.properties"})
public class DatabaseServiceConfiguration {

    @Autowired
    private Environment env;

    @Bean
    public GottMusIg gottMusIg() {
        return new GottMusIgImpl(realmService(),
                                 itemService(),
                                 accountService(),
                                 characterService(),
                                 simulationService(),
                                 dpsDifferenceService());
    }

    @Bean
    public CharacterService characterService() {
        return new CharacterServiceImpl();
    }

    @Bean
    public ItemService itemService() {
        return new ItemServiceImpl();
    }

    @Bean
    public RealmService realmService() {
        return new RealmServiceImpl();
    }

    @Bean
    public AccountService accountService() {
        return new AccountServiceImpl();
    }

    @Bean
    public SimulationService simulationService() {
        return new SimulationServiceImpl();
    }

    @Bean
    public DPSDifferenceService dpsDifferenceService() {
        return new DPSDifferenceServiceImpl();
    }

    @Bean
    public SearchCharacterClient searchCharacterClient() {
        return new SearchCharacterClient(env.getRequiredProperty("api.path"), env.getRequiredProperty("api.key"));
    }

}
