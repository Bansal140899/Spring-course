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

import in.sv.beans.Studentt;
import in.sv.service.StudentService;
import in.sv.service.StudentServiceImp;

public class Main {

    public static void main(String[] args) {
    	
    	Studentt std = new Studentt();
    	std.setRoll(101);
    	std.setName("ajay");
    	std.setCity("kota");

    	
    	
    	
    	
    	
    	//=======================================
    	Configuration cfg = new Configuration();
    	cfg.configure("/in/sv/resource/hibernate.hbm.xml");
    	
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	
    	
    	
    	Session session =  sessionFactory.openSession();
    	Transaction ts= session.beginTransaction();
    	try {
    		session.save(std);
    		System.out.println("success");
    		ts.commit();
    	}catch(Exception e) {
    		System.out.println("fail");
    		ts.rollback();
    		e.printStackTrace();
    	}finally {
    		session.close();
    		
    	}
    		
    	}
    	
    	
    	
    	
    	
    	
    	
   

    
}