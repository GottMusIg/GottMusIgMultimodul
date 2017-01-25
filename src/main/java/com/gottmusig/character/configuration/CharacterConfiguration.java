package com.gottmusig.character.configuration;

import com.gottmusig.configuration.JpaConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
@Configuration
@Import(JpaConfiguration.class)
public class CharacterConfiguration {

}
