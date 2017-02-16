package com.gottmusig.database.service.domain;

import com.gottmusig.database.service.domain.account.AccountService;
import com.gottmusig.database.service.domain.character.CharacterService;
import com.gottmusig.database.service.domain.item.ItemService;
import com.gottmusig.database.service.domain.realm.RealmService;
import com.gottmusig.database.service.domain.simulation.SimulationService;

/**
 * Interface for all of the functionality of the Database Service
 *
 * @author lgottschick
 * @since 1.0.0
 */
public interface GottMusIg {

    RealmService realmService();

    ItemService itemService();

    AccountService accountService();

    CharacterService characterService();

    SimulationService dpsDifferenceService();

}
