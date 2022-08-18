package com.example.demo;

import java.sql.*;

/**
 * Using Class Insertion to Perform Various Operations via Queries.
 */
public class Insertion {
    private final String url = "jdbc:postgresql://localhost:5432/jdbc";
    private final String user = "postgres";
    private final String password = "123456";
    private final String query = "CREATE TABLE COMPANY(\n" +
            "   ID INT PRIMARY KEY     NOT NULL,\n" +
            "   NAME           TEXT    NOT NULL,\n" +
            "   AGE            INT     NOT NULL,\n" +
            "   ADDRESS        CHAR(50),\n" +
            "   SALARY         REAL,\n" +
            "   JOIN_DATE\t  DATE\n" +
            ");";
    //Inserting the data into the table.
    private final String query1 = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY,JOIN_DATE) VALUES (1, 'Paul', 32, 'California', 20000.00,'2001-07-13');";
    private final String query2 = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY,JOIN_DATE) VALUES (2, 'Anirudh', 42, 'Bangalore', 50230.00,'2022-06-11');";
    private final String query3 = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY,JOIN_DATE) VALUES (3, 'Lohith', 47, 'Bangalore', 55600.00,'2022-06-11');";
    private final String query4 = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY,JOIN_DATE) VALUES (4, 'Jeevan', 22, 'Bangalore', 50056.00,'2022-06-11');";
    private final String query5 = " UPDATE COMPANY SET SALARY = 59000 WHERE ID = 3;";
    private final String query6 = "DELETE FROM COMPANY WHERE ID = 1;";

    public static void main(String[] args) {
        Insertion insert = new Insertion();
        insert.connect();
    }

    //Establishing the connection Using Connection Interface.
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Connected to the PostgreSQL server successfully!!!");
            } else {
                System.out.println("Failed to make connection!");
            }

            //Using Statement interface to Enter queries.
            Statement stmt = conn.createStatement();
            stmt.execute(query);
            stmt.execute(query1);
            stmt.execute(query2);
            stmt.execute(query3);
            stmt.execute(query4);
            stmt.execute(query5);
            stmt.execute(query6);
            System.out.println("Table created and inserted successfully!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return conn;
    }
}
