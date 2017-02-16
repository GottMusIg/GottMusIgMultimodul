package com.gottmusig.database.service;

import com.gottmusig.database.service.deprecated.account.configuration.AccountConfiguration;
import com.gottmusig.database.service.deprecated.dpsdifference.configuration.DPSDifferenceConfiguration;
import com.gottmusig.database.service.deprecated.searchcharacter.configuration.SearchCharacterConfiguration;
import org.springframework.boot.SpringApplication;

/**
 * @author leong
 * @since 24.11.2016
 */
public class Application extends SpringApplication {

    public Application() {
        super(DPSDifferenceConfiguration.class, SearchCharacterConfiguration.class, AccountConfiguration.class);
    }

    public static void main(String[] args) {
    }
}