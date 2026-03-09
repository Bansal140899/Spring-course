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
	
		
		int id=  124;
		String name=  "kkkk";
		String addr=  "gujart";
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
				
	JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean(JdbcTemplate.class);
	
	String sql_query = "insert into student values('" + id + "','" + name + "','" + addr + "')";
	int count = jdbcTemplate.update(sql_query);
	
	if(count>0) {
		System.out.println("succchgehj");
	}
	else {
		System.out.println("failled");
	}

	
	}
}
