package com.gottmusig.dpsdifference;

import com.gottmusig.dpsdifference.configuration.DPSDifferenceConfiguration;
import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import com.gottmusig.dpsdifference.jpa.ClassSpecificationEntity;
import com.gottmusig.dpsdifference.jpa.SpecificationDPSEntity;
import com.gottmusig.dpsdifference.jpa.WOWClassEntity;
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
        SpecificationDPSEntity specificationDPS = new SpecificationDPSEntity();
        specificationDPS.setDps(400000);
        ClassSpecificationEntity specification = new ClassSpecificationEntity();
        specification.setName("Penis");
        WOWClassEntity wowClass = new WOWClassEntity();
        wowClass.setName("Dödel");
        specification.setWowClass(wowClass);
        dpsDifference.addSpecificationDPS(specificationDPS);
    }
}
