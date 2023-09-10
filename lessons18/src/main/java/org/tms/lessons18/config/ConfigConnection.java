package org.tms.lessons18.config;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigConnection {

    static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Connection getConnection(String dbname, String user, String pass) {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);

            if (connection != null) {
                System.out.println("Connection");
            } else {
                System.out.println("Not connection");
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return connection;
    }
}
