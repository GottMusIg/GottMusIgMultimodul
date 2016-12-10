package com.gottmusig.rest.blizzard;


import com.gottmusig.rest.blizzard.utils.UrlBuilder;
import com.gottmusig.utils.PropertyLoader;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author leong
 * @since 10.12.2016
 */
public class RestClient {

    private final static String BLIZZARD_PROPERTIES="src/main/resources/blizzard.properties";

    public RestClient() {
        PropertyLoader.loadProperties(BLIZZARD_PROPERTIES);
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
    private static String request(String url) {
        Client client = ClientBuilder.newClient();
        String response;
        try {
            WebTarget target = client.target(url);
            response = target.request(MediaType.APPLICATION_JSON).get().readEntity(String.class);
        }
        finally {
            client.close();
        }
        return response;
    }

    public String searchCharacter(String location, String realm, String characterName) {
        return request(UrlBuilder.buildUrl("character/"+realm+"/"+characterName));
    }

}

