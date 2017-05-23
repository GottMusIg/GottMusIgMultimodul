package com.gottmusig.database.service.domain.character.jpa.blizzard;


import com.gottmusig.database.service.domain.character.jpa.exception.CharacterNotFoundException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;

/**
 * @author leong
 * @since 10.12.2016
 */
public class SearchCharacterClient implements Closeable {

    private static final String QUERY_PARAMS = "?fields=talents,items&locale=en_GB&apikey=";
    private static final String CHARACTER_PATH = "character/";

    private final Client client;
    private final String blizzardBasePath;
	private final String blizzardApiKey;

    public SearchCharacterClient(String path, String key) {
        this.blizzardBasePath = Objects.requireNonNull(path);
		this.blizzardApiKey = Objects.requireNonNull(key);
        client = ClientBuilder.newClient();
    }

    /**
     * https://eu.api.battle.net/wow/realm/status?locale=en_GB&apikey=apikey
     *
     * @param url URL as String
     * @return response
     */
    private Response request(String url) {
        WebTarget target = client.target(url);
        return target.request(MediaType.APPLICATION_JSON).buildGet().invoke();
    }

    public String searchCharacter(String realm, String characterName) throws CharacterNotFoundException {
        Response response = request(blizzardBasePath + CHARACTER_PATH
                                    + realm + "/" + characterName +
                                    QUERY_PARAMS + blizzardApiKey);

        if (response.getStatus() != 200) {
            throw new CharacterNotFoundException("Character not found!");
        }
        return response.readEntity(String.class);
    }

    @Override
    public void close() throws IOException {
        client.close();
    }
}

