package com.gottmusig.utils.character;

/**
 * @author leong
 * @since 06.02.2017
 */
public enum WOWClassId {

    WARRIOR("Warrior", 1), PALADIN("Paladin", 2), HUNTER("Hunter", 3), ROGUE("Rogue", 4), PRIEST("Priest", 5), DEATHKNIGHT("Death Knight", 6), SHAMAN("Shaman", 7), MAGE("Mage", 8), WARLOCK("Warlock", 9), MONK("Monk", 10), DRUID("Druid", 11), DEMONHUNTER("Demon Hunter", 12);


    private final String wowClassName;
    private final int id;

    WOWClassId(String wowClassName, int id) {
        this.wowClassName = wowClassName;
        this.id = id;
    }

    public static String getWowClassName(int id) {
        return WOWClassId.values()[id - 1].name();
    }


}
