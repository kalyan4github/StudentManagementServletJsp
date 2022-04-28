package com.techdenovo.japps.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    final private String url ="jdbc:mysql://192.168.1.6:3306/local_studentmanagement";
    final private String dbUsername = "local_studentmanagement";
    final private String password = "local_studentmanagement";

    public Connection getDbConnection(){
        Connection connection=null;
        try {
            connection = DriverManager.getConnection(url,dbUsername,password);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
