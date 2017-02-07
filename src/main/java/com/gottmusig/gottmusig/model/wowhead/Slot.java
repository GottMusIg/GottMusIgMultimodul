package com.gottmusig.gottmusig.model.wowhead;

public enum Slot {
	
	HEAD(1),
	NECK(2),
	SHOULDER(3),
	SHIRT(4),
	CHEST(5),
	WAIST(6),
	LEGS(7),
	FEET(8),
	WRIST(9),
	HANDS(10),
	FINGER(11),
	TRINKET(12),
	ONE_HAND(13),
	SHIELD(14),
	RANGED(15),
	BACK(16),
	TWO_HAND(17),
	BAG(18),
	TABARD(19),
	MAIN_HAND(21),
	OFF_HAND(22),
	HELD_IN_OFF_HAND(23),
	PROJECTILE(24),
	THROWN(25),
	RELIC(28);

	private final int id;
	public static final String paramSlot = "slot";
	

	Slot(int id){
		this.id = id;
	}
	
	public String getURLPart(){
		return paramSlot+":"+id+"/";
	}

}