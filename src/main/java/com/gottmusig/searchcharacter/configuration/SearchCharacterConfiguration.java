package com.gottmusig.searchcharacter.configuration;

import com.gottmusig.configuration.JpaConfiguration;
import com.gottmusig.searchcharacter.jpa.SearchCharacterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author leong
 * @since 09.12.2016
 */

@Configuration
@Import(JpaConfiguration.class)
public class SearchCharacterConfiguration {

    @Bean
    public SearchCharacterImpl searchCharacterImpl() {
        return new SearchCharacterImpl();
    }

}
