import com.google.common.base.Splitter;
import com.gottmusig.database.service.configuration.DatabaseServiceConfiguration;
import com.gottmusig.database.service.domain.GottMusIg;
import com.gottmusig.database.service.domain.account.AccountService;
import com.gottmusig.database.service.domain.character.CharacterService;
import com.gottmusig.database.service.domain.character.jpa.characterpojo.CharacterConverter;
import com.gottmusig.database.service.domain.dpsdifference.DPSDifferenceService;
import com.gottmusig.database.service.domain.item.ItemService;
import com.gottmusig.database.service.domain.realm.RealmService;
import com.gottmusig.database.service.domain.simulation.SimulationService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertNotNull;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DatabaseServiceConfiguration.class })
@TestPropertySource("classpath:test-h2-context.properties")
public class DatabaseServiceConfigurationTest {

    @Autowired
    ResourceLoader loader;
    @Autowired
    DataSource dataSource;
    @Autowired
    EntityManager entityManager;

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

    @Autowired
    private CharacterConverter characterConverter;

    @Before
    public void setUp() throws Exception {
        execute(Files.readAllBytes(loader.getResource("classpath:create_schema.sql").getFile().toPath()));
        execute(Files.readAllBytes(loader.getResource("classpath:create_tables.sql").getFile().toPath()));
        execute(Files.readAllBytes(loader.getResource("classpath:initialize_tables.sql").getFile().toPath()));
    }

    @After
    public void after() throws Exception {
        execute(Files.readAllBytes(loader.getResource("classpath:drop_schema.sql").getFile().toPath()));
    }

    @Test
    public void testDatabaseServiceConfiguration() throws Exception {

        assertNotNull(characterService);
        assertNotNull(itemService);
        assertNotNull(gottMusIg);
        assertNotNull(simulationService);
        assertNotNull(realmService);
        assertNotNull(accountService);
        assertNotNull(dpsDifferenceService);
        assertNotNull(characterConverter);

    }

    private void execute(byte[] bytes) throws SQLException {
        try (Connection conn = dataSource.getConnection()) {
            Splitter.on("\n\n").trimResults().omitEmptyStrings().split(new String(bytes, StandardCharsets.UTF_8)).forEach(sql -> {
                try (Statement statement = conn.createStatement()) {
                    statement.execute(sql);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

}
