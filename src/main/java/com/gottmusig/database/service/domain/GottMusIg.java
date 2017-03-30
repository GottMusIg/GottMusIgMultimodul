package com.gottmusig.database.service.domain;

import com.gottmusig.database.service.domain.account.AccountService;
import com.gottmusig.database.service.domain.character.CharacterService;
import com.gottmusig.database.service.domain.dpsdifference.DPSDifferenceService;
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

    /**
     * The realm service can be used to save, search and get all available realms in the database
     *
     * @return the realmService interface
     */
    RealmService realmService();

    /**
     * The item service can be used to store, search or find all items available in the database
     * @return the itemService interface
     */
    ItemService itemService();

    /**
     * The account service can be used to register, delete or edit accounts from GottMusIg (not World of Warcraft Accounts!!)
     * @return the accountService interface
     */
    AccountService accountService();

    /**
     * The character service can be used to search, save and update existing World of Warcraft characters in the database and
     * via the blizzard api
     * @return the characterService interface
     */
    CharacterService characterService();

    /**
     * The simulation service can be used to simulate the DPS of a given Character.
     * @return the simulationService interface
     */
    SimulationService simulationService();

    /**
     * The dps difference service can be used to get the current to DPS list in descending order by DPS
     * @return the dpsDifferenceService interface
     */
    DPSDifferenceService dpsDifferenceService();

}
