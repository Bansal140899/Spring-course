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
    	
    	Student st = new Student();
//    	st.setId(1);
    	st.setName("ajay");
    	st.setEmail("aj@gmail.com");
    	st.setMarks(122.3f);
    	
 EntityManagerFactory entityManagerFactory =     Persistence .createEntityManagerFactory("main-persistence-unit");  
    	EntityManager entityManager =  entityManagerFactory.createEntityManager();
    	EntityTransaction et = entityManager.getTransaction();
    	
    	try {
    		
    		et.begin();
    		entityManager.persist(st);
    		
    		
    		
    		
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
