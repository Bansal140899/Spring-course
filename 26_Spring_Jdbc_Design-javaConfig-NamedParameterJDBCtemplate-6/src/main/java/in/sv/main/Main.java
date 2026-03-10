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
	
		Student st = new Student();
		st.setRoll(855141);
		st.setName("god");
		st.setCity("heaven");
		
		
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(st);
		
		
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		
//		Map<String , Object> map = new HashMap<String ,Object>();
//		params.addValue("id", 109);
//		params.addValue("name", "kamina");
//		params.addValue("addr", "US");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
				
		NamedParameterJdbcTemplate Template =  context.getBean(NamedParameterJdbcTemplate.class);
	
		
		
		
		
		
		
	String sql_query = "insert into student values(:roll ,:name , :city)";
int count =	Template.update(sql_query, param);
	
	
	if(count>0) {
		System.out.println("succcessj");
	}
	else {
		System.out.println("failled");
	}

	
	}
}
