package com.gottmusig.database.service.deprecated.searchcharacter.configuration;

import com.gottmusig.database.service.configuration.JpaConfiguration;
import com.gottmusig.database.service.deprecated.searchcharacter.domain.api.SearchCharacter;
import com.gottmusig.database.service.deprecated.searchcharacter.jpa.SearchCharacterImpl;
import com.gottmusig.database.service.domain.simulation.DPSDifference;
import com.gottmusig.database.service.jpa.blizzard.RestClient;
import com.gottmusig.database.service.jpa.character.CharacterEntity;
import com.gottmusig.database.service.jpa.realm.RealmEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author leong
 * @since 09.12.2016
 */

@Configuration
@Import(JpaConfiguration.class)
@PropertySource({"classpath:/blizzard.properties"})
public class SearchCharacterConfiguration {

    private final Environment env;

    private final DPSDifference dpsDifference;

    private final RealmEntity.RealmRepository realmRepository;

    private final CharacterEntity.CharacterRepository characterRepository;

    @Autowired
    public SearchCharacterConfiguration(Environment env,
                                        DPSDifference dpsDifference,
                                        RealmEntity.RealmRepository realmRepository,
                                        CharacterEntity.CharacterRepository characterRepository) {
        this.env = env;
        this.dpsDifference = dpsDifference;
        this.realmRepository = realmRepository;
        this.characterRepository = characterRepository;
    }

    @Bean
    public SearchCharacter searchCharacter() {
        return new SearchCharacterImpl(realmRepository, restClient(), characterRepository, dpsDifference,
                                       classSpecificationRepository);
    }

    @Bean
    public RestClient restClient() {
        return new RestClient(env.getProperty("api.path"),
                env.getProperty("api.key"));
    }
}
