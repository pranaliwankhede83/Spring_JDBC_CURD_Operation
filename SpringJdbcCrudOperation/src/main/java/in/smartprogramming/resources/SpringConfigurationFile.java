package in.smartprogramming.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigurationFile {
	
	@Bean
	public DriverManagerDataSource myDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbccrud_bydeepak");
		dataSource.setUsername("root");
		dataSource.setPassword("Aailuvbaba@123");
		
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate myJdbcTemplate() {
		
		JdbcTemplate jdbctemplate = new JdbcTemplate();
		
		jdbctemplate.setDataSource(myDataSource());
		
		return jdbctemplate;
	}

}
