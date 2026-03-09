package in.sv.main;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.sv.beans.Student;
import in.sv.resource.SpringConfig;

public class Main {
	public static void main(String[] args) {
	DriverManagerDataSource dataSoruce = new DriverManagerDataSource();
	
	dataSoruce.setDriverClassName("com.mysql.cj.jdbc.Driver");
	
	dataSoruce.setUrl("jdbc:mysql://localhost:3306/ajay");
	dataSoruce.setUsername("root");
	dataSoruce.setPassword("root");
	
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	jdbcTemplate.setDataSource(dataSoruce);
	System.out.println("successs");
	
	try {
		Connection con = jdbcTemplate.getDataSource().getConnection();
		
		if(con != null) {
			System.out.println("successs");
		}else {
			System.out.println("fail");
		}
		
		
		
		
	}catch(Exception e) {
		e.printStackTrace()
;		
	}
	
	}
}
