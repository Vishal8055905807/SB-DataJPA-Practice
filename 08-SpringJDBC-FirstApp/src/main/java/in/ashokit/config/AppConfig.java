package in.ashokit.config;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "in.ashokit")
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
	public JdbcTemplate createJdbcTemplate(DataSource ds) { ////JdbcTemplate is a helper class provided by Spring JDBC that simplifies database operations.
		return new JdbcTemplate(ds);
	}
	
	
	
}
