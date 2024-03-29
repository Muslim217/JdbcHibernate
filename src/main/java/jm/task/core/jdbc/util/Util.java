package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String URL = "jdbc:mysql://localhost:3306/kata_db?serverTimezone=UTC&useSSL=false";
    public static final String NAME = "root";
    public static final String PASSWORD = "22117788";

    public static Connection connection;


    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, NAME, PASSWORD);
                return connection;

            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
        return connection;
    }

    public static void closedConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
// реализуйте настройку соеденения с БД
}
