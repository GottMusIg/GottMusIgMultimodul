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
import com.gottmusig.gottmusig.model.blizzard.BlizzardParams;
import com.gottmusig.gottmusig.model.blizzard.WowChar;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlizzardGateway {


	private final ObjectMapper objectMapper;
	
	public BlizzardGateway(){
		this.objectMapper = new ObjectMapper(); 
	}

	public BlizzardItem getItemWithId(String id, String bonus) throws JsonParseException, JsonMappingException, IOException{
		
		String requestUrl = buildUrl(BlizzardParams.DEFAULT_REGION.getParam(),BlizzardParams.ITEM_PARA,id, bonus);
		log.debug(requestUrl+" was called!");
		String itemJsonString = request(requestUrl);
		log.debug(itemJsonString);
		return (BlizzardItem) convertJsonStringToObject(itemJsonString, BlizzardItem.class);

	}
	
	public BlizzardItem getItemWithId(String id) throws JsonParseException, JsonMappingException, IOException{
		return getItemWithId(id,null);
	}
	
	public WowChar getCharWith(String region, String realm, String name) throws JsonParseException, JsonMappingException, IOException{
	
		String requestUrl = buildUrl(region, BlizzardParams.CHAR_PARAM, realm, name);
		log.debug(requestUrl+" was called!");
		String charJsonStrimg = request(requestUrl);
		log.debug(charJsonStrimg);
		return (WowChar) convertJsonStringToObject(charJsonStrimg, WowChar.class);
		
	}
	
	private String buildUrl(String region, BlizzardParams searchParam, String... values){
		String finalUrl = BlizzardParams.getBaseUrlFor(region)+"/"+ searchParam.getParam();
		
		for(String value : values){
			if(value != null){
				finalUrl+= "/"+value;
			}
		}
		return finalUrl;

	}
	
	private String request(String url){
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
	
	//TODO 
	private Object convertJsonStringToObject(String jsonString, Class objectClass) throws JsonParseException, JsonMappingException, IOException{
		return objectMapper.readValue(jsonString, objectClass);
	}
	
	
}
