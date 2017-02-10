package com.gottmusig.gottmusig.model.blizzard;

import java.util.ArrayList;
import java.util.List;

public enum Races {

	ORC(2, "Horde"),
	UNDEAD(5, "Horde"),
	TAUREN(6, "Horde"),
	TROLL(8, "Horde"),
	GOBLIN(9, "Horde"),
	BLOOD_ELF(10, "Horde"),
	PANDAREN(26, "Horde");

	
	private static final String HORDE = "Horde";
	
	
	private int id;
	private String side;
	
	private Races(int id, String side){
		this.id = id;
		this.side = side;
	}
	
	public int getId(){
		return id;
	}
	
	public String getSide(){
		return side;
	}
	
	public static List<Integer> getHordeIds() {
		
		List<Integer> hordeRaces = new ArrayList<>();
		
		for(Races race : Races.values()){
			
			if(race.getSide().equals(HORDE)){
				hordeRaces.add(race.getId());
			}
		}
		return hordeRaces;
	}

}
