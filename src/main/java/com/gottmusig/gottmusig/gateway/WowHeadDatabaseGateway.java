package com.gottmusig.gottmusig.gateway;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gottmusig.gottmusig.model.blizzard.WowChar;
import com.gottmusig.gottmusig.model.wowhead.Classes;
import com.gottmusig.gottmusig.model.wowhead.Filters;
import com.gottmusig.gottmusig.model.wowhead.Quality;
import com.gottmusig.gottmusig.model.wowhead.Slot;
import com.gottmusig.gottmusig.model.wowhead.WowHead;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WowHeadDatabaseGateway {
	

	private static final String BASE_URL = "http://www.wowhead.com/items/";
	private static final String WOW_LIST_VIEW_ITEMS_REGEX = "(?<=listviewitems\\s=\\s)\\[.*\\]?(?=;)";
	private final ObjectMapper objectMapper;
	
	public WowHeadDatabaseGateway(){
		objectMapper = new ObjectMapper();
		objectMapper.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
	}
	
	public WowHead getItemsFor(WowChar wowChar, Slot slot, Quality quality) throws Exception{
		
		if(wowChar == null){
			throw new Exception(); //mind char muss angegeben werden TODO Exception schreiben
		}
		
		Classes characterClass = Classes.getClassIdFor(wowChar);
		int charLvl = wowChar.getLevel();
		return getItemsFor(characterClass, charLvl, charLvl, slot, quality);
	}
	
	public WowHead getItemsFor(Classes wowClass, int minLvl, int maxLvl, Slot slot, Quality quality) throws IOException{
		
		String requestUrl = buildUrl(wowClass,minLvl, maxLvl, slot, quality);
		
		Document wowheadResultPage =  Jsoup.connect(requestUrl).get();
		String itemsAsJsonString = getJsonItemListString(wowheadResultPage);
		WowHead wowhead = convertJsonStringToObject(itemsAsJsonString);
		log.debug("Found: "+wowhead.getItems().size()+ " wowheaditems :)");
		return wowhead;
	}

	public WowHead getItemsFor(WowChar wowChar, Slot slot) throws Exception{
		return getItemsFor(wowChar,slot,null);
	}
	
	public WowHead getItemsFor(WowChar wowChar) throws Exception{
		return getItemsFor(wowChar,null,null);
	}
	
	//TODO
	private String buildUrl(Classes wowClass,int minLvl,int maxLvl, Slot slot, Quality quality ){
		
		String finalUrl = BASE_URL+Filters.getMinRequiredLevelUrlPart(maxLvl) + Filters.getMaxRequiredLevelUrlPart(minLvl)+wowClass.getURLPart();
		
		if(quality != null){
			finalUrl += quality.getURLPart();
		}
		
		if(slot != null){
			finalUrl+=slot.getURLPart();
		}
		
		log.debug("URL: "+finalUrl);
		return applyStandtartfilters(finalUrl, wowClass);
	}
	
	private String applyStandtartfilters(String url, Classes wowClass){			
		Filters filter2 = Filters.CAN_BE_EQUIPPED_YES;	
		return url += filter2.getUrlPart();
	}
	
	private String getJsonItemListString(Document doc){
		
		Elements scripts = doc.select("script"); // Get the script part
		String values="";
		for(Element script : scripts){
			
			Pattern p =   Pattern.compile(WOW_LIST_VIEW_ITEMS_REGEX); // Regex for the value of the key
			Matcher m = p.matcher(script.html()); 
			
			while( m.find() )
			{
				values = m.group();
			}
		}
		return addJsonWrapper(values);

	}

	private String addJsonWrapper(String values){
		String jsonString =  "{\"items\": "+values+" }";
		log.debug(jsonString);
		return jsonString;
	}
	
	private WowHead convertJsonStringToObject(String jsonString) throws JsonParseException, JsonMappingException, IOException{
		return objectMapper.readValue(jsonString, WowHead.class);
	}
	
}
