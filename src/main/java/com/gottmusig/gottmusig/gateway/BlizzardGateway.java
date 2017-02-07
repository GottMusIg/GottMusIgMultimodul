package com.gottmusig.gottmusig.gateway;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gottmusig.gottmusig.model.blizzard.BlizzardItem;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlizzardGateway {

	private static final String BASE_URL =  "http://eu.battle.net/api/wow/item/";
	private final ObjectMapper objectMapper;
	
	public BlizzardGateway(){
		this.objectMapper = new ObjectMapper(); 
	}

	public BlizzardItem getItemWithId(String id, String bonus) throws JsonParseException, JsonMappingException, IOException{
		
		String requestUrl = buildUrl(id, bonus);
		log.debug(requestUrl+" was called!");
		String itemJsonString = requestItem(requestUrl);
		return convertJsonStringToObject(itemJsonString);

	}
	
	private String buildUrl(String id, String bonus){
		String finalUrl = BASE_URL+id;
		
		if(bonus != null){
			return finalUrl + "/" + bonus;  
		}
		return finalUrl;
	}
	
	private String requestItem(String url){
        Client client = ClientBuilder.newClient();
        String response="";
        try {
            WebTarget target = client.target(url);
            response = target.request(MediaType.APPLICATION_JSON).get().readEntity(String.class);
        }
        finally {
            client.close();
        }
        return response;
	}
	
	private BlizzardItem convertJsonStringToObject(String jsonString) throws JsonParseException, JsonMappingException, IOException{
		return objectMapper.readValue(jsonString, BlizzardItem.class);
	}
	
}
