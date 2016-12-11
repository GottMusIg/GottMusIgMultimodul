package com.gottmusig.configuration;

import com.gottmusig.utils.SpringEntityListener;
import com.mysql.jdbc.Driver;
import org.apache.commons.dbcp.BasicDataSource;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Main configuration for all JPA aspects. Couples Eclipse Link with Spring Data JPA. 
 *
 * @author Leon Gottschick
 * @since 0.0.1
 */
@Configuration
@EnableJpaRepositories(basePackages="com.gottmusig", considerNestedRepositories=true)
@ComponentScan("com.gottmusig")
@PropertySource({"classpath:/database.properties"})
public class JpaConfiguration {

    @Autowired Environment env;
    @Autowired AutowireCapableBeanFactory beanFactory;
    
    @Bean
    public SpringEntityListener SpringEntityListener() {
        SpringEntityListener listener = SpringEntityListener.get();
        listener.setBeanFactory(beanFactory);
        return listener;
    }
    
    @Bean(destroyMethod="close")
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(Driver.class.getName());
        dataSource.setUrl(env.getRequiredProperty("datasource.url"));
        dataSource.setUsername(env.getRequiredProperty("datasource.username"));
        dataSource.setPassword(env.getRequiredProperty("datasource.password"));
        dataSource.setTestOnBorrow(true);
        return dataSource;
    }
    
    @Bean
    protected Map<String, Object> getVendorProperties() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put(PersistenceUnitProperties.WEAVING, Boolean.FALSE.toString());
        map.put(PersistenceUnitProperties.LOGGING_LEVEL, "FINE");
        return map;
    }
    
    @Bean
    public JpaProperties jpaProperties() {
        return new JpaProperties();
    }
    
    @Bean
    protected EclipseLinkJpaVendorAdapter jpaVendorAdapter() {
        EclipseLinkJpaVendorAdapter adapter = new EclipseLinkJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(false);
        return adapter;
    }
    
    @Bean
    public EntityManagerFactoryBuilder entityManagerFactoryBuilder() {
        return new EntityManagerFactoryBuilder(jpaVendorAdapter(), jpaProperties(), null);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        Map<String, Object> vendorProperties = getVendorProperties();
        return entityManagerFactoryBuilder().dataSource(dataSource())
                                            .packages("com.gottmusig")
                                            .properties(vendorProperties)
                                            .jta(false)
                                            .build();
    }
    
    @Bean
    public PlatformTransactionManager txManager() {
        return new JpaTransactionManager(entityManagerFactory().getObject());
    }
}