package in.sv.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sv.beans.Empl;
import in.sv.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Empl emp = new Empl();
        emp.setId(1);
        emp.setName("ajay");
        emp.setRoll(120000);
        emp.setCity("delhi");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/sv/resource/applicationContext.xml");
        
        StudentDao stddao = (StudentDao) context.getBean("stddao");
    	
        stddao.addEmpDetails(emp);
    	
    	
    	
    }
}
