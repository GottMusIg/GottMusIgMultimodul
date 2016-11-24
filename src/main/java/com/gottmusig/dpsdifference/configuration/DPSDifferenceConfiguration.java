package com.gottmusig.dpsdifference.configuration;

import com.gottmusig.dpsdifference.jpa.DPSDifferenceEntity;
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

    @Bean
    public DPSDifferenceEntity dpsDifferenceEntity() {
        return new DPSDifferenceEntity();
    }
}
