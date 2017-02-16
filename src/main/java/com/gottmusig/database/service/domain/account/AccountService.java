package com.gottmusig.database.service.domain.account;

import java.util.Optional;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public interface AccountService {

    Account register(String userName, String password);

    void delete(Account account);

    Optional<Account> searchAccount(String userName);

}
