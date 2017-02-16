package com.gottmusig.database.service.deprecated.account.domain.api;

import com.gottmusig.database.service.domain.account.Account;

import java.util.Optional;

/**
 * @author leong
 * @since 20.01.2017
 */
public interface AccountAdministration {

    Account register(String name, String password);

    void delete(String name);

    Optional<Account> searchAccount(String userName);

}
