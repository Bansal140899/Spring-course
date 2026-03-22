package in.sv.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.sv.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    
 EntityManagerFactory entityManagerFactory =     Persistence .createEntityManagerFactory("main-persistence-unit");  
    	EntityManager entityManager =  entityManagerFactory.createEntityManager();
    	EntityTransaction et = entityManager.getTransaction();
    	
    	try {
    		
    		et.begin();
    	Student std = 	entityManager.find(Student.class ,1);
    		
    		System.out.println("student-details");
    		System.out.println(std.getEmail() + " " +std.getId()+" " +std.getName() + "s" +std.getMarks());
    		
    		
    		et.commit();
    		System.out.println("successs");
    		
    	}catch(Exception e) {
    		
    		e.printStackTrace();
    		et.rollback();
    		System.out.println("fail");
    	}
    	finally {
    		entityManager.close();
    		entityManagerFactory.close();
    	}
    	
    	
    	
    	
    	
;    }
}
