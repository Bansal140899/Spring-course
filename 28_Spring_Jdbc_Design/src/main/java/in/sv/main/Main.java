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

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Student std1 = context.getBean(Student.class);

        StudentService stdser = context.getBean(StudentService.class);
        boolean status = stdser.addstdservice(std1);
        if(!status) {
        	System.out.println("success");
        }else {
        	System.out.println("falsemyd");
        }

    }
}