package com.junrdev.rds.draft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {

    public static void main(String[] args) {
        String url = "jdbc:mysql://demodb.ccdwitjkt0qb.eu-north-1.rds.amazonaws.com:3306/demodb";
        String username = "junrdev";
        String password = "junrdev2022";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully to the database!");
            System.out.println(connection.getClientInfo().toString());
            connection.close();
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }
    }
}
