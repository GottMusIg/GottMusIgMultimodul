package com.gottmusig.database.service.configuration;

import com.gottmusig.database.service.domain.account.AccountService;
import com.gottmusig.database.service.domain.character.CharacterService;
import com.gottmusig.database.service.domain.item.ItemService;
import com.gottmusig.database.service.domain.realm.RealmService;
import com.gottmusig.database.service.domain.simulation.SimulationService;
import com.gottmusig.database.service.jpa.account.AccountServiceImpl;
import com.gottmusig.database.service.jpa.character.CharacterServiceImpl;
import com.gottmusig.database.service.jpa.item.ItemServiceImpl;
import com.gottmusig.database.service.jpa.realm.RealmServiceImpl;
import com.gottmusig.database.service.jpa.simulation.SimulationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Configuration
@Import(JpaConfiguration.class)
public class DatabaseServiceConfiguration {

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

}
