package in.sv.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sv.beans.Student;
import in.sv.resource.SpringConfig;

public class Main {

    public static void main(String[] args) throws SQLException {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        
        
        
        
        DataSource dataSource = context.getBean(DataSource.class);
        
        
        Connection con1 = dataSource.getConnection();
        Connection con2 = dataSource.getConnection();
        
        Connection con3 = dataSource.getConnection();
        
        Connection con4 = dataSource.getConnection();
        
        Connection con5 = dataSource.getConnection();
        
        con1.close();
        Connection con6 = dataSource.getConnection();
        
        
        
        System.out.println("succes");
        
        
        
        
       
    }
}