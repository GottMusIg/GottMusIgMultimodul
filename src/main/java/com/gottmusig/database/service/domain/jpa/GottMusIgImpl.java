package com.gottmusig.database.service.domain.jpa;

import org.springframework.beans.factory.annotation.Autowired;

import com.gottmusig.database.service.domain.GottMusIg;
import com.gottmusig.database.service.domain.account.AccountService;
import com.gottmusig.database.service.domain.character.CharacterService;
import com.gottmusig.database.service.domain.dpsdifference.DPSDifferenceService;
import com.gottmusig.database.service.domain.item.ItemService;
import com.gottmusig.database.service.domain.realm.RealmService;
import com.gottmusig.database.service.domain.simulation.SimulationService;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public class GottMusIgImpl implements GottMusIg {

	@Autowired
    private RealmService realmService;
	@Autowired
	private ItemService itemService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private CharacterService characterService;
	@Autowired
	private SimulationService simulationService;
	@Autowired
	private DPSDifferenceService dpsDifferenceService;

    @Override
    public RealmService realmService() {
        return realmService;
    }

    @Override
    public ItemService itemService() {
        return itemService;
    }

    @Override
    public AccountService accountService() {
        return accountService;
    }

    @Override
    public CharacterService characterService() {
        return characterService;
    }

    @Override
    public SimulationService simulationService() {
        return simulationService;
    }

    @Override
    public DPSDifferenceService dpsDifferenceService() {
        return dpsDifferenceService;
    }
}
