

package in.sv.main;
import in.sv.beans.Empl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sv.beans.Empl;
//import in.sv.resource.SpringConfig;
import in.sv.dao.StudentDao;

public class App {

    public static void main(String[] args) {

        Empl emp = new Empl();
        emp.setId(2);
        emp.setName("bansal");
        emp.setRoll(120000);
        emp.setCity("delhi");

        ApplicationContext context =
        new AnnotationConfigApplicationContext("in/sv/resource/SpringConfig.class");

        StudentDao stddao = context.getBean(StudentDao.class);

        stddao.addEmpDetails(emp);

        System.out.println("Employee inserted successfully");
    }
}
