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
	
		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
				
	JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean(JdbcTemplate.class);
	
	
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
