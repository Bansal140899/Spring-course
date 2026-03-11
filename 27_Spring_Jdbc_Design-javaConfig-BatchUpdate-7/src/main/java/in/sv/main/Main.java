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

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        JdbcTemplate template = context.getBean(JdbcTemplate.class);

        String sql = "insert into student values(?,?,?)";

        // Creating 4 Student objects
        List<Student> students = new ArrayList<>();

        students.add(new Student("Rahul",101,"Jaipur"));
        students.add(new Student("Deepak",102,"Kota"));
        students.add(new Student("Aman",103,"Delhi"));
        students.add(new Student("Riya",104,"Mumbai"));

        int[] count = template.batchUpdate(sql, new BatchPreparedStatementSetter() {

            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {

                Student std = students.get(i);

                ps.setInt(1, std.getRoll());
                ps.setString(2, std.getName());
                ps.setString(3, std.getCity());
            }

            @Override
            public int getBatchSize() {
                return students.size();
            }
        });

        for(int i : count) {
            System.out.println(i + " record inserted");
        }
    }
}