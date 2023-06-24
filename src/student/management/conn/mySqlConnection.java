package student.management.conn;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import student.management.entity.students;

import javax.swing.*;
import java.sql.*;

public class mySqlConnection {

    Connection conn = null;

    public static Connection ConnectDataBase() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sms");
            JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public static ObservableList<students> getDataUsers() {

        Connection conn = ConnectDataBase();
        ObservableList<students> list = FXCollections.observableArrayList();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from  students");
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                list.add(new students(
                        Integer.parseInt(
                        resultSet.getString("student_id")),
                        resultSet.getString("firstName"),
                        resultSet.getString("lastName"),
                        resultSet.getString("std_class"),
                        resultSet.getString("school")
                        ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}
