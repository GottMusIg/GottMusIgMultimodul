package com.gottmusig.database.service.jpa.account;

import com.gottmusig.database.service.domain.account.Account;
import com.gottmusig.database.service.domain.account.AccountService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public Account register(String userName, String password) {
        return null;
    }

    @Override
    public void delete(Account account) {

    }

    @Override
    public Optional<Account> searchAccount(String userName) {
        return null;
    }
}
