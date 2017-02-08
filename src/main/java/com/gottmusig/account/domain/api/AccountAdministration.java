package com.gottmusig.account.domain.api;

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
