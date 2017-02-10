package com.gottmusig.gottmusig.model.blizzard;

public enum BlizzardParams {
	
	PROTOCOL("http://"),
	BASE_URL(".battle.net/api/wow"),
	DEFAULT_REGION("eu"),
	ITEM_PARA("item"),
	CHAR_PARAM("character");
	
	
	private String param;
	
	private BlizzardParams(String param) {
		this.param = param;
	}
	
	public String getParam(){
		return param;
	}
	
	
	public static String getBaseUrlFor(String region){
		return PROTOCOL.getParam()+region+BASE_URL.getParam();
		
		
		
	}
	

}
