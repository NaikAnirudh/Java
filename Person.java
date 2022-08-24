package com.assessment.a2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Person {
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
        String query1 ="CREATE TABLE PERSON (\n" +
                "    PERSONID int,\n" +
                "    PERSONName varchar(255),\n" +
                "    PERSONAge int,\n" +
                "    PERSONAddress varchar(255),\n" +
                "    PERSONDESIGNATION varchar(255)\n" +
                ");";
        Connection connection = null;
        Statement statement = null;
        try {

            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            statement.execute(query1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
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
