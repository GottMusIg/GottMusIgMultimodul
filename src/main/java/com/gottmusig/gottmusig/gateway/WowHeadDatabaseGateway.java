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
	
	public WowHead getItemsFor(Classes wowClass, Slot slot, Quality quality) throws Exception{
		
		if(wowClass == null){
			throw new Exception(); //mind class muss angegeben werden TODO Exception schreiben
		}
		
		String requestUrl = buildUrl(wowClass, slot, quality);
		Document wowheadResultPage =  Jsoup.connect(requestUrl).get();
		String itemsAsJsonString = getJsonItemListString(wowheadResultPage);
		WowHead wowhead = convertJsonStringToObject(itemsAsJsonString);
		log.debug("Found: "+wowhead.getItems().size()+ " wowheaditems :)");
		return wowhead;
	}
	
	
	public WowHead getItemsFor(Classes wowClass, Slot slot) throws Exception{
		return getItemsFor(wowClass,slot,null);
	}
	
	public WowHead getItemsFor(Classes wowClass) throws Exception{
		return getItemsFor(wowClass,null,null);
	}
	
	private String buildUrl(Classes wowClass, Slot slot, Quality quality){
		
		String finalUrl = BASE_URL + wowClass.getURLPart();

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
			
		Filters filter = Filters.RACE_SPECIFIC.setClass(wowClass);
		Filters filter2 = Filters.CAN_BE_EQUIPPED_YES;	
		String urlPart = Filters.mergeFiltersWith(filter, filter2);

		return url += urlPart;
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
	
	//Momentaner unschöner quickfix
	private String addJsonWrapper(String values){
		String jsonString =  "{\"items\": "+values+" }";
		log.debug(jsonString);
		return jsonString;
	}
	
	private WowHead convertJsonStringToObject(String jsonString) throws JsonParseException, JsonMappingException, IOException{
		return objectMapper.readValue(jsonString, WowHead.class);
	}
	
}
