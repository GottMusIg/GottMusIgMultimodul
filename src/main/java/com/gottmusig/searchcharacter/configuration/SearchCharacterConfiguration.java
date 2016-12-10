package com.gottmusig.searchcharacter.configuration;

import com.gottmusig.configuration.JpaConfiguration;
import com.gottmusig.rest.blizzard.RestClient;
import com.gottmusig.searchcharacter.jpa.SearchCharacterImpl;
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

    @Autowired Environment env;

    @Bean
    public SearchCharacterImpl searchCharacterImpl() {
        return new SearchCharacterImpl();
    }

    @Bean
    public RestClient restClient(){
    	RestClient restClient = new RestClient(env.getProperty("api.path"),
    										   env.getProperty("api.key"));
        return restClient;
    }

}
