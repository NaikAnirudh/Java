package com.example.demo.joins;

import java.sql.*;

public class Joins {
    public static void main(String[] args) throws SQLException {
        //Connection interface to connect to the database.
        Connection connection = null;
        //PreparedStatement interface is used to execute parameterized query.
        PreparedStatement preparedStatement = null;
        //ResultSet interface is used to retrieve the records from database.
        ResultSet resultSet = null;
        //url for connecting with postgresql database.
        String url = "jdbc:postgresql://localhost:5432/jdbc";
        //UserName for postgresql.
        String user = "postgres";
        //password for postgresql.
        String password = "123456";
        /*
            Here Insert.Update,Delete the records into the database.
         */

        String query = "SELECT\n" +
                "    a,\n" +
                "    fruit_a,\n" +
                "    b,\n" +
                "    fruit_b\n" +
                "FROM\n" +
                "    basket_a\n" +
                "INNER JOIN basket_b\n" +
                "    ON fruit_a = fruit_b;";

        try {
            /*
               DriverManager class will attempt to load the driver classes.
               getConnection() method is for connecting with database server from application.
             */
            connection = DriverManager.getConnection(url, user, password);
            preparedStatement = connection.prepareStatement(query);
            /*
                Creates a PreparedStatement object for sending parameterized SQL statements to the database.
                preparedStatement.executeUpdate() method for execute DML queries.
                preparedStatement.executeQuery() method for execute DQL queries.
             */
            resultSet = preparedStatement.executeQuery();
            System.out.println("hi");

            while (resultSet.next()) {
                int id = resultSet.getInt("a");
                String name = resultSet.getString("fruit_a");
                int id2 = resultSet.getInt("b");
                String name2 = resultSet.getString("fruit_b");
                System.out.println(id + name + id2 + name2);


            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            /*
                Displaying the required records using resultSet interface reference.
             */


        } finally {
            /*
                Closing the costly resources within the 'finally' block.
             */
            if (connection != null & preparedStatement != null & resultSet != null) {
                try {
                    connection.close();
                    preparedStatement.close();
                    resultSet.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println(" Successfully");
    }
}

