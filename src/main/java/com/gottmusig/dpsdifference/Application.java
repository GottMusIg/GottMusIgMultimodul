package com.gottmusig.dpsdifference;

import com.gottmusig.dpsdifference.configuration.DPSDifferenceConfiguration;
import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author leong
 * @since 24.11.2016
 */

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DPSDifferenceConfiguration.class);
        DPSDifference dpsDifference = context.getBean(DPSDifference.class);

            dpsDifference.addSpecificationDPS(300000,"Fury","Warrior");
            dpsDifference.addSpecificationDPS(200000,"Arms","Warrior");
            dpsDifference.addSpecificationDPS(100000,"Protection","Warrior");

            dpsDifference.addSpecificationDPS(50,"Holy","Paladin");
            dpsDifference.addSpecificationDPS(20000,"Protection","Paladin");
            dpsDifference.addSpecificationDPS(100,"Retribution","Paladin");

            dpsDifference.addSpecificationDPS(700000,"Beast Mastery","Hunter");
            dpsDifference.addSpecificationDPS(200000,"Marksmanship","Hunter");
            dpsDifference.addSpecificationDPS(100000,"Survival","Hunter");

            dpsDifference.addSpecificationDPS(480000,"Assassination","Rogue");
            dpsDifference.addSpecificationDPS(240000,"Outlaw","Rogue");
            dpsDifference.addSpecificationDPS(190000,"Subtlety","Rogue");

            dpsDifference.addSpecificationDPS(263845,"Holy","Priest");
            dpsDifference.addSpecificationDPS(67325,"Shadow","Priest");
            dpsDifference.addSpecificationDPS(622345,"Discipline","Priest");

            dpsDifference.addSpecificationDPS(124346,"Blood","Death Knight");
            dpsDifference.addSpecificationDPS(153753,"Frost","Death Knight");
            dpsDifference.addSpecificationDPS(362634,"Unholy","Death Knight");

            dpsDifference.addSpecificationDPS(14124,"Elemental","Shaman");
            dpsDifference.addSpecificationDPS(151144,"Enhancement","Shaman");
            dpsDifference.addSpecificationDPS(1613,"Restoration","Shaman");

            dpsDifference.addSpecificationDPS(151342,"Frost","Mage");
            dpsDifference.addSpecificationDPS(135151,"Arcane","Mage");
            dpsDifference.addSpecificationDPS(664532,"Fire","Mage");

            dpsDifference.addSpecificationDPS(266234,"Demonology","Warlock");
            dpsDifference.addSpecificationDPS(567743,"Destruction","Warlock");
            dpsDifference.addSpecificationDPS(243262,"Affliction","Warlock");

            dpsDifference.addSpecificationDPS(235,"Brewmaster","Monk");
            dpsDifference.addSpecificationDPS(236235,"Windwalker","Monk");
            dpsDifference.addSpecificationDPS(26234,"Mistweaver","Monk");

            dpsDifference.addSpecificationDPS(242352,"Guardian","Druid");
            dpsDifference.addSpecificationDPS(221123,"Balance","Druid");
            dpsDifference.addSpecificationDPS(379965,"Feral","Druid");
            dpsDifference.addSpecificationDPS(7000,"Restoration","Druid");

            dpsDifference.addSpecificationDPS(700000,"Havoc","Demon Hunter");
            dpsDifference.addSpecificationDPS(346242,"Vengeance","Demon Hunter");

    }
}
