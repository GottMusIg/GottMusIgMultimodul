package com.gottmusig.database.service.domain.simulation.jpa;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import com.gottmusig.database.service.domain.character.Character;
import com.gottmusig.database.service.domain.simulation.SimulationService;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Service
public class SimulationServiceImpl implements SimulationService {

    private static final String BASE_URL = "http://localhost:8080/"; //TODO
    private static final String SIMULATION_PATH = "gottmusig-simulation/rest/simulation/player";

    private static final String REGION = "region";
    private static final String REALM = "realm";
    private static final String USER = "user";


    @Override
    public Character simulateDPS(Character character) {

        Client c = ClientBuilder.newClient();
        WebTarget target = c.target(BASE_URL).path(SIMULATION_PATH) //
             .queryParam(REGION, "eu") //TODO
        .queryParam(REALM, character.getRealm().getName()) //
        .queryParam(USER, character.getName());


        SimulationCraft simulation = target.request().get(SimulationCraft.class);
        character.setDPS(simulation.getSim().getPlayers().get(0).getCollectedData().getDps().getMean().intValue());
        return character;

    }
}
