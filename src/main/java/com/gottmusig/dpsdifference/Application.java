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
        specificationDPS.setDps(500000);
        ClassSpecificationEntity specification = new ClassSpecificationEntity();
        specification.setName("Furor");
        WOWClassEntity wowClass = new WOWClassEntity();
        wowClass.setName("Krieger");
        specification.setWowClass(wowClass);
        specificationDPS.setSpecification(specification);
        dpsDifference.addSpecificationDPS(specificationDPS);
    }
}
