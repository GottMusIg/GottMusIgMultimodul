package com.gottmusig.rest.blizzard;


import com.gottmusig.utils.exception.CharacterNotFoundException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Closeable;
import java.io.IOException;


/**
 * @author leong
 * @since 10.12.2016
 */
public class RestClient implements Closeable {

    private final Client client;
    private String path;
	private String key;

    public RestClient(String path, String key) {
        this.path = path;
		this.key = key;
        client = ClientBuilder.newClient();
    }

    /**
     * https://eu.api.battle.net/wow/realm/status?locale=en_GB&apikey=apikey
     * Example:
     * public static void main(String[] args) {
     *    request(https://eu.api.battle.net/wow/realm/status?locale=en_GB&apikey=apikey)
     * }
     *
     * @param url URL as String
     * @return response
     */
    private Response request(String url) {
        WebTarget target = client.target(url);
        return target.request(MediaType.APPLICATION_JSON).buildGet().invoke();
    }

    public String searchCharacter(String location, String realm, String characterName) throws CharacterNotFoundException {
        Response response = request(this.path +
                "character/" +
                realm +
                "/" +
                characterName +
                "?fields=talents&locale=en_GB" +
                "&apikey=" +
                this.key);

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

