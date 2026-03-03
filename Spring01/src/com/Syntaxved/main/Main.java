package com.Syntaxved.main;

//import javax.annotation.Resource;import org.springframework.core.io.Resource;
import org.springframework.core.io.Resource;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.Syntaxved.bean.Student;

public class Main {
	public static void main(String[] args) {
        // XML configuration file ko classpath (src folder) se load kar raha hai
        Resource resource = new ClassPathResource("com/Syntaxved/resource/applicationconfig.xml");
        
        // Spring container create kar raha hai jo XML file se beans load karega
        BeanFactory container = new XmlBeanFactory(resource);
        
        // Spring container se "std" id wali bean (object) nikal raha hai
        Student std = (Student)container.getBean("std");
        
        // Student class ka display() method call kar raha hai
        std.display();

	}

}
