package in.sv.resource;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.sv.beans.Student;
import in.sv.dao.StduentDaoImp;
import in.sv.service.StudentServiceImp;

@Configuration
@ComponentScan(basePackages="in.sv.")
public class SpringConfig {

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/ajay");
        ds.setUsername("root");
        ds.setPassword("root");

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
         jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    @Bean
//    public StduentDaoImp createStudentDaoImp() {
//    	
//    	StduentDaoImp sdp = new StduentDaoImp();
//    	sdp.setDataSource(dataSource());
//    	
//    	return sdp;
//    	
//    }
//    
//    @Bean
//    public StudentServiceImp studentserviceimp() {
//    	StudentServiceImp ssi = new StudentServiceImp();
//    	ssi.setStdDao(createStudentDaoImp());
//    	return ssi;
//    }
//    
//    @Bean
//    public Student stdobj() {
//    	Student std = new Student();
//    	std.setRoll(143);
//    	std.setName("vikash");
//    	std.setCity("kttta");
//    	
//    	return std;
//    }
}