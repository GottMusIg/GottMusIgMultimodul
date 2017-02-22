import com.gottmusig.database.service.configuration.DatabaseServiceConfiguration;
import com.gottmusig.database.service.domain.GottMusIg;
import com.gottmusig.database.service.domain.account.AccountService;
import com.gottmusig.database.service.domain.character.CharacterService;
import com.gottmusig.database.service.domain.dpsdifference.DPSDifferenceService;
import com.gottmusig.database.service.domain.item.ItemService;
import com.gottmusig.database.service.domain.realm.RealmService;
import com.gottmusig.database.service.domain.simulation.SimulationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DatabaseServiceConfiguration.class })
public class DatabaseServiceConfigurationTest {

    @Autowired
    private CharacterService characterService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private GottMusIg gottMusIg;

    @Autowired
    private SimulationService simulationService;

    @Autowired
    private RealmService realmService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private DPSDifferenceService dpsDifferenceService;


    @Test
    public void testDatabaseServiceConfiguration() throws Exception {
        assertNotNull(characterService);
        assertNotNull(itemService);
        assertNotNull(gottMusIg);
        assertNotNull(simulationService);
        assertNotNull(realmService);
        assertNotNull(accountService);
        assertNotNull(dpsDifferenceService);
    }

}
