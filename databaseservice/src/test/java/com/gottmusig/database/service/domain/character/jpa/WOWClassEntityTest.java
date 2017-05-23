package com.gottmusig.database.service.domain.character.jpa;

import com.google.common.base.Splitter;
import com.gottmusig.database.service.configuration.DatabaseServiceConfiguration;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leong
 * @since 11.05.2017
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DatabaseServiceConfiguration.class })
@TestPropertySource("classpath:test-h2-context.properties")
public class WOWClassEntityTest {

    @Autowired
    ResourceLoader loader;
    @Autowired
    DataSource dataSource;
    @Autowired
    EntityManager entityManager;

    @Autowired
    WOWClassEntity.WOWClassRepository wowClassRepository;

    public WOWClassEntity wowClassEntity() {
        WOWClassEntity wowClassEntity = new WOWClassEntity();
        wowClassEntity.setName("Test");
        return wowClassEntity;
    }

    @Before
    public void setUp() throws Exception {
        execute(Files.readAllBytes(loader.getResource("classpath:create_schema.sql").getFile().toPath()));
        execute(Files.readAllBytes(loader.getResource("classpath:create_tables.sql").getFile().toPath()));
    }

    @After
    public void after() throws Exception {
        execute(Files.readAllBytes(loader.getResource("classpath:drop_schema.sql").getFile().toPath()));
    }

    @Test
    public void testWoWClassRepositoryInsert() {
        String expectedName = "Test";
        wowClassRepository.save(wowClassEntity());
        WOWClassEntity classEntity = wowClassRepository.findByName(expectedName);

        assertEquals(expectedName, classEntity.getName());
        wowClassRepository.deleteAll();
    }

    @Test
    public void testWoWClassRepositoryDeletion() {
        WOWClassEntity save = wowClassRepository.save(wowClassEntity());
        wowClassRepository.delete(save);
        assertTrue(!wowClassRepository.findAll().iterator().hasNext());
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