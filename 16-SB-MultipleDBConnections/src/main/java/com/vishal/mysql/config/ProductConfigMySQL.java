package com.vishal.mysql.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
@EnableJpaRepositories(     // decides which repository uses which flow
        basePackages = "com.vishal.mysql.repo",
        entityManagerFactoryRef = "mysqlEntityManager",           	
        transactionManagerRef = "mysqlTransactionManager"
)
public class ProductConfigMySQL {

	
	@Bean
    @ConfigurationProperties(prefix = "spring.mysql.datasource")
    public DataSource mysqlDataSource() {

        return DataSourceBuilder.create().build();
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean mysqlEntityManager(
            EntityManagerFactoryBuilder builder) {

        return builder
                .dataSource(mysqlDataSource())
                .packages("com.vishal.mysql.entity")
                .persistenceUnit("mysql")
                .properties(getProperties())
                .build();
    }


    @Bean
    public PlatformTransactionManager mysqlTransactionManager( // "Transactions must be managed separately for each database."
            @Qualifier("mysqlEntityManager")
            LocalContainerEntityManagerFactoryBean mysqlEntityManager) {

        return new JpaTransactionManager(mysqlEntityManager.getObject());
    }	
	
    private Map<String, Object> getProperties() {

        Map<String, Object> props = new HashMap<>();

        props.put("hibernate.hbm2ddl.auto", "update");
        props.put("hibernate.show_sql", true);

        return props;
    }
	
}
