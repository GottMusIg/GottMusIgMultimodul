package com.gottmusig.database.service.domain.account.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gottmusig.database.service.domain.account.Account;
import com.gottmusig.database.service.domain.account.AccountService;
import com.gottmusig.database.service.domain.account.jpa.AccountEntity.AccountRepository;
import com.gottmusig.database.service.domain.account.jpa.exception.CharacterAlreadyExistsException;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired AccountRepository accountRepository;

    @Override
    public Account register(String userName, String password) throws CharacterAlreadyExistsException {
        AccountEntity account = new AccountEntity();
        account.setPassword(password);
        account.setUserName(userName);
        Optional<Account> accountOptional = accountRepository.findByUserName(userName);
        if(accountOptional.isPresent()) {
            throw new CharacterAlreadyExistsException("User name already exists!");
        }
        return accountRepository.save(account);
    }

    @Override
    public void delete(Account account) {
        accountRepository.delete((AccountEntity) account);
    }

    @Override
    public Optional<Account> searchAccount(String userName) {
        return accountRepository.findByUserName(userName);
    }
}
