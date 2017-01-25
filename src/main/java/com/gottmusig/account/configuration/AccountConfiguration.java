package com.gottmusig.account.configuration;

import com.gottmusig.account.domain.api.AccountAdministration;
import com.gottmusig.account.jpa.AccountAdministrationImpl;
import com.gottmusig.configuration.JpaConfiguration;
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
public class AccountConfiguration {

    @Bean
    public AccountAdministration accountAdministration() {
        return new AccountAdministrationImpl();
    }

}
