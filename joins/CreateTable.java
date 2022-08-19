package com.example.demo.joins;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws SQLException {
        //url for connecting with postgresql database.
        final String url = "jdbc:postgresql://localhost:5432/jdbc";
        //UserName for postgresql.
        final String user = "postgres";
        //password for postgresql.
        final String password = "123456";
         /*
            Here Create table  into the database.
         */
        String query = "CREATE TABLE basket_a (\n" +
                "    a INT PRIMARY KEY,\n" +
                "    fruit_a VARCHAR (100) NOT NULL\n" +
                ");";

        String query1 = "CREATE TABLE basket_b (\n" +
                "    b INT PRIMARY KEY,\n" +
                "    fruit_b VARCHAR (100) NOT NULL\n" +
                ");";
        Connection connection = null;
        Statement statement = null;
        try {

            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            statement.execute(query);
            statement.execute(query1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Closing the connection & Statement.
        finally {
            if (statement != null && connection != null) {
                try {
                    statement.close();
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Created successfully");
            }
        }
    }
}
