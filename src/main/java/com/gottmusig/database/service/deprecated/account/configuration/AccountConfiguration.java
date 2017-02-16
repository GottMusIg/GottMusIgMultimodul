package com.gottmusig.database.service.deprecated.account.configuration;

import com.gottmusig.database.service.configuration.JpaConfiguration;
import com.gottmusig.database.service.deprecated.account.domain.api.AccountAdministration;
import com.gottmusig.database.service.deprecated.account.jpa.AccountAdministrationImpl;
import com.gottmusig.database.service.jpa.account.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
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

    private final AccountEntity.AccountRepository accountRepository;

    @Autowired
    public AccountConfiguration(AccountEntity.AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Bean
    public AccountAdministration accountAdministration() {
        return new AccountAdministrationImpl(accountRepository);
    }

}
