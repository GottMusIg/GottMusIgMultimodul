package com.gottmusig.database.service;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gottmusig.database.service.configuration.DatabaseServiceConfiguration;
import com.gottmusig.database.service.domain.GottMusIg;

/**
 * @author leong
 * @since 24.11.2016
 */
public class Application extends SpringApplication {

    public Application() {
        super(DatabaseServiceConfiguration.class);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = new Application().run(args);

        GottMusIg bean = run.getBean(GottMusIg.class);

    }
}