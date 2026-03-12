package in.sv.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ajay",
                    "root",
                    "root"
            );

        } catch (Exception e) {

            e.printStackTrace();

        }

        return con;
    }

}