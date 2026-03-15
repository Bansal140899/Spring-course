package in.sv.main;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import javax.security.auth.login.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sv.beans.Employee;
import in.sv.service.StudentService;
import in.sv.service.StudentServiceImp;

public class Main {

    public static void main(String[] args) {
    	
    	Employee emp = new Employee();
    	

    	
    	
    	
    	
    	
    	//=======================================
    	Configuration cfg = new Configuration();
    	cfg.configure("/in/sv/resource/hibernate.hbm.xml");
    	
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	
    	
    	
    	Session session =  sessionFactory.openSession();
    	
    	try {
    		session.get(Employee.class ,1);
    		System.out.println("Employee Id :" +emp.getId());
    		System.out.println("Employee name :" +emp.getName());
    		System.out.println("Employee City :" +emp.getCity());
    		System.out.println("Employee roll :" +emp.getRoll());
    		
    	}catch(Exception e) {
    		System.out.println("fail");
    	
    		e.printStackTrace();
    	}finally {
    		session.close();
    		sessionFactory.close();
    		
    	}
    		
    	}
    	
    	
    	
    	
    	
    	
    	
   

    
}