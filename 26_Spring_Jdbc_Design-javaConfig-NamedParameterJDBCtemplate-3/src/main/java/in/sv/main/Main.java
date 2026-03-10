package in.sv.main;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.sv.beans.Student;
import in.sv.resource.SpringConfig;

public class Main {
	public static void main(String[] args) {
	
		
		int id=  124;
		String name=  "kkkk";
		String addr=  "gujart";
		
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		
//		Map<String , Object> map = new HashMap<String ,Object>();
		params.addValue("id", 109);
		params.addValue("name", "kamina");
		params.addValue("addr", "US");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
				
		NamedParameterJdbcTemplate Template =  context.getBean(NamedParameterJdbcTemplate.class);
	
		
		
		
		
		
		
	String sql_query = "insert into student values(:id ,:name , :addr)";
int count =	Template.update(sql_query, params);
	
	
	if(count>0) {
		System.out.println("succchgehj");
	}
	else {
		System.out.println("failled");
	}

	
	}
}
