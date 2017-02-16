package com.gottmusig.database.service.deprecated.account.jpa;

import com.gottmusig.database.service.deprecated.account.domain.api.AccountAdministration;
import com.gottmusig.database.service.domain.account.Account;
import com.gottmusig.database.service.jpa.account.AccountEntity;
import com.gottmusig.database.service.jpa.account.AccountEntity.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * @author leong
 * @since 24.01.2017
 */
public class AccountAdministrationImpl implements AccountAdministration {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountAdministrationImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account register(String name, String password) {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setPassword(password);
        accountEntity.setUserName(name);
        return accountRepository.save(accountEntity);
    }

    @Override
    public void delete(String name) {
        AccountEntity accountEntity = accountRepository.findByUserName(name);
        accountRepository.delete(accountEntity);
    }

    @Override
    public Optional<Account> searchAccount(String userName) {
        return Optional.ofNullable(accountRepository.findByUserName(userName));
    }
}
