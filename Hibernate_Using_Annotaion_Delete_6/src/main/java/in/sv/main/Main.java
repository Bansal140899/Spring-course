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
    	

    	emp.setId(1);
    	emp.setName("aj");
    	emp.setCity("kota");
    	emp.setRoll(1233);
    	
    	
    	
    	
    	//=======================================
    	Configuration cfg = new Configuration();
    	cfg.configure("/in/sv/resource/hibernate.hbm.xml");
    	
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	
    	
    	
    	Session session =  sessionFactory.openSession();
    	Transaction ts= session.beginTransaction();
    	try {
    		Employee emp1 = session.get(Employee.class ,1);
    		emp1.setCity("jaipur");
    		System.out.println("success");
    		ts.commit();
    	}catch(Exception e) {
    		System.out.println("fail");
    		ts.rollback();
    		e.printStackTrace();
    	}finally {
    		session.close();
    		sessionFactory.close();
    		
    	}
    		
    	}
    	
    	
    	
    	
    	
    	
    	
   

    
}