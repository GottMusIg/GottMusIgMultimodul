package com.gottmusig.database.service.deprecated.dpsdifference.configuration;

import com.gottmusig.database.service.configuration.JpaConfiguration;
import com.gottmusig.database.service.domain.simulation.DPSDifference;
import com.gottmusig.database.service.jpa.character.ClassSpecificationEntity;
import com.gottmusig.database.service.jpa.character.WOWClassEntity;
import com.gottmusig.database.service.jpa.simulation.DPSDifferenceImpl;
import com.gottmusig.database.service.jpa.simulation.SpecificationDPSEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author leong
 * @since 24.11.2016
 */
@Configuration
@Import(JpaConfiguration.class)
public class DPSDifferenceConfiguration {

    private final SpecificationDPSEntity.SpecificationDPSRepository dpsRepository;

    private final ClassSpecificationEntity.ClassSpecificationRepository specificationRepository;

    private final WOWClassEntity.WOWClassRepository wowClassRepository;

    @Autowired
    public DPSDifferenceConfiguration(SpecificationDPSEntity.SpecificationDPSRepository dpsRepository,
                                      ClassSpecificationEntity.ClassSpecificationRepository specificationRepository,
                                      WOWClassEntity.WOWClassRepository wowClassRepository) {
        this.dpsRepository = dpsRepository;
        this.specificationRepository = specificationRepository;
        this.wowClassRepository = wowClassRepository;
    }

    @Bean
    public DPSDifference dpsDifference() {
        return new DPSDifferenceImpl(dpsRepository, specificationRepository, wowClassRepository);
    }
}
