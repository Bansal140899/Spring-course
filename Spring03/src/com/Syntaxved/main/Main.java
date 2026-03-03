package com.Syntaxved.main;

//import javax.annotation.Resource;import org.springframework.core.io.Resource;
import org.springframework.core.io.Resource;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cache.annotation.AnnotationCacheOperationSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Syntaxved.bean.Student;
import com.Syntaxved.resource.JavaConfig;

public class Main {
	
       
       
       
       public static void main(String[] args) {
//    	      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	      ApplicationContext   context = new ClassPathXmlApplicationContext("com/Syntaxved/resource/applicationconfig.xml");
//    	      context.register(Student.class);
//    	      context.refresh();
    	      
    	      Student std =(Student) context.getBean("student");
    	       std.display();
       
       
	}

}
