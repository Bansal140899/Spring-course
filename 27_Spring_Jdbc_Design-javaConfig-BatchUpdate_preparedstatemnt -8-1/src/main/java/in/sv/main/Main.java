package in.sv.main;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.sv.beans.Student;
import in.sv.resource.SpringConfig;

public class Main {
	public static void main(String[] args) {
	
	
		
		
		
		
		
		
		
		

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
				
		JdbcTemplate Template = (JdbcTemplate) context.getBean(JdbcTemplate.class);
	
		
		
		
		
		
		
	String sql_query1 = "insert into student values(2222 ,'antima' , 'kota')";
	String sql_query2 = "insert into student values(111 ,'heena' , 'khatoli')";
	String sql_query3 = "insert into student values(333 ,'wait' , 'wait')";
	
	int[] count = Template.batchUpdate(sql_query1, sql_query2 ,sql_query3);
	
for(int i :count) {
	System.out.println(i+" : success");
}
}}
	
