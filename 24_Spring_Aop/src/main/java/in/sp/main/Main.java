package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sv.service.App;

public class Main {

    public static void main(String[] args) {
        
        // Spring container start karega aur XML load karega
        ApplicationContext context =
                new ClassPathXmlApplicationContext("in/sv/resource/applicationContext.xml");
        
        // proxyBean ko container se get karenge
        App obj = (App) context.getBean("proxyBean");
        
        // methods call
        obj.trans();
        obj.debt();
        obj.cred();
        
    }

}