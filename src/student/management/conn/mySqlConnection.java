package student.management.conn;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class mySqlConnection {

    Connection conn = null;

    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/");
            JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
