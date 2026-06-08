package in.ashokit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.hibernate.SessionFactory;

@Configuration
@ComponentScan(basePackages = "in.ashokit")
@EnableTransactionManagement
public class AppConfig {

	@Bean
	public DataSource dataSource() {   //DataSource bean is used to configure and provide database connection details.
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/bwjava");
		ds.setUsername("root");
		ds.setPassword("Vishal@12377");
		
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
		
		sfb.setDataSource(dataSource());
		sfb.setPackagesToScan("in.ashokit.entity");   //we pass package name where entity classes are stored
		
		Properties props = new Properties();   //It is a legacy class extends HashTable(Map). Similar as map.
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect"); // Hibernate generates SQL compatible with: MySQL version 8.
		props.put("hibernate.hbm2ddl.auto", "update"); // creates table in DB if table is not already present
		props.put("hibernate.show_sql", "true");// shows executed SQL queries to console
		
		sfb.setHibernateProperties(props);	
		
		return sfb;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager(LocalSessionFactoryBean sfb) {

	    HibernateTransactionManager txManager = new HibernateTransactionManager();

	    txManager.setSessionFactory(sfb.getObject());

	    return txManager;
	}

	@Bean
	public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory) {

	    return new HibernateTemplate(sessionFactory);
	}
	
}
