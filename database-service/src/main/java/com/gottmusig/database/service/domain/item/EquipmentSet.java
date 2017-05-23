package com.gottmusig.database.service.domain.item;

/**
 * @author leong
 * @since 07.05.2017
 */
public interface EquipmentSet {

    Long getAverageItemLevel();

    Long getAverageItemLevelEquipped();

    Item getHead();

    Item getNeck();

    Item getShoulders();

    Item getBack();

    Item getSkirt();

    Item getChest();

    Item getWrist();

    Item getMainHand();

    Item getOffHand();

    Item getHands();

    Item getFinger1();

    Item getFinger2();

    Item getWaist();

    Item getLegs();

    Item getFeet();

    Item getTrinket1();

    Item getTrinket2();

}
