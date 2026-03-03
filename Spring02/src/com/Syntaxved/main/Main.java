package com.Syntaxved.main;

//import javax.annotation.Resource;import org.springframework.core.io.Resource;
import org.springframework.core.io.Resource;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cache.annotation.AnnotationCacheOperationSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Syntaxved.bean.Student;
import com.Syntaxved.resource.JavaConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext  container = new AnnotationConfigApplicationContext(JavaConfig.class);
	       Student std = (Student)container.getBean("std");
	       
	       System.out.println(std);
	       std.display();
	       Student std1 = (Student)container.getBean("std1");
	       
	       System.out.println(std1);
	       std.display();
	       
	       Student std2 = (Student)container.getBean("std2");
	       
	       System.out.println(std2);
	       std.display();
	}

}
 