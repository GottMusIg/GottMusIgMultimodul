package com.gottmusig.dpsdifference.configuration;

import com.gottmusig.configuration.JpaConfiguration;
import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import com.gottmusig.dpsdifference.jpa.ClassSpecificationEntity;
import com.gottmusig.dpsdifference.jpa.DPSDifferenceImpl;
import com.gottmusig.dpsdifference.jpa.SpecificationDPSEntity;
import com.gottmusig.dpsdifference.jpa.WOWClassEntity;
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
