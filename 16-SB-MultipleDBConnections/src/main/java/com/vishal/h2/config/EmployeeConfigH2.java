package com.vishal.h2.config;

import java.util.HashMap;
import java.util.Map;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.vishal.h2.repo",
        entityManagerFactoryRef = "h2EntityManager",
        transactionManagerRef = "h2TransactionManager"
)
public class EmployeeConfigH2 {

    
    @Bean
    @ConfigurationProperties(prefix = "spring.h2.datasource")
    public DataSource h2DataSource() {

        return DataSourceBuilder.create().build();
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean h2EntityManager(
            EntityManagerFactoryBuilder builder) {

        return builder
                .dataSource(h2DataSource())
                .packages("com.vishal.h2.entity")
                .persistenceUnit("h2")
                .properties(getProperties())
                .build();
    }


    @Bean
    public PlatformTransactionManager h2TransactionManager(
            @Qualifier("h2EntityManager")
            LocalContainerEntityManagerFactoryBean h2EntityManager) {

        return new JpaTransactionManager(h2EntityManager.getObject());
    }
    private Map<String, Object> getProperties() {

        Map<String, Object> props = new HashMap<>();

        props.put("hibernate.hbm2ddl.auto", "update");
        props.put("hibernate.show_sql", true);

        return props;
    }

}