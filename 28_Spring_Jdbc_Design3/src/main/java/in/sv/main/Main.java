package in.sv.main;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sv.beans.Student;
import in.sv.resource.SpringConfig;
import in.sv.service.StudentService;
import in.sv.service.StudentServiceImp;

public class Main {

    public static void main(String[] args) {
    	
    	Student std = new Student();
    	std.setRoll(664);
    	std.setName("vika");
    	std.setCity("kmina");

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
//        Student std1 = context.getBean(Student.class);

        StudentServiceImp stdser = context.getBean(StudentServiceImp.class);
        boolean status = stdser.addstdservice(std);
        if(status) {
        	System.out.println("success");
        }else {
        	System.out.println("falsemyd");
        }

    }
}