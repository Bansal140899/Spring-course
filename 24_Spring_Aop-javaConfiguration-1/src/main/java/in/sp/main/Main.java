package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sv.resource.SpringConfig;
import in.sv.service.App;

public class Main {

    public static void main(String[] args) {
        
        // Spring container start karega aur XML load karega
        ApplicationContext context =
              new  AnnotationConfigApplicationContext(SpringConfig.class);
        // proxyBean ko container se get karenge
        
        
        App obj = (App) context.getBean(App.class);
        
        // methods call
        obj.trans();
        System.out.println();
        obj.debt();
        System.out.println();
        
        obj.cred();
        
    }

}