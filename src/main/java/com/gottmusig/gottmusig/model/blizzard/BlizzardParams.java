package com.gottmusig.gottmusig.model.blizzard;

public enum BlizzardParams {
	
	BASE_URL("http://eu.battle.net/api/wow"),
	ITEM_PARA("item"),
	CHAR_PARAM("character");
	
	
	private String param;
	
	private BlizzardParams(String param) {
		this.param = param;
	}
	
	public String getParam(){
		return param;
	}
	

}
