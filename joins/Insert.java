package com.example.demo.joins;

import java.sql.*;

public class Insert {
    public static void main(String[] args) throws SQLException {
        //Connection interface to connect to the database.
        Connection connection = null;
        //PreparedStatement interface is used to execute parameterized query.
        PreparedStatement preparedStatement = null;

        //url for connecting with postgresql database.
        String url = "jdbc:postgresql://localhost:5432/jdbc";
        //UserName for postgresql.
        String user = "postgres";
        //password for postgresql.
        String password = "123456";
        /*
            Here Insert.Update,Delete the records into the database.
         */
        String query = "\n" +
                "INSERT INTO basket_a (a, fruit_a)\n" +
                "VALUES\n" +
                "    (1, 'Apple'),\n" +
                "    (2, 'Orange'),\n" +
                "    (3, 'Banana'),\n" +
                "    (4, 'Cucumber')";
        String query1 = "INSERT INTO basket_b (b, fruit_b)\n" +
                "VALUES\n" +
                "    (1, 'Orange'),\n" +
                "    (2, 'Apple'),\n" +
                "    (3, 'Watermelon'),\n" +
                "    (4, 'Pear');";

        String[] qry = {query, query1};
        try {
            /*
               DriverManager class will attempt to load the driver classes.
               getConnection() method is for connecting with database server from application.
             */
            connection = DriverManager.getConnection(url, user, password);
            /*
                Creates a PreparedStatement object for sending parameterized SQL statements to the database.
                preparedStatement.executeUpdate() method for execute DML queries.
                preparedStatement.executeQuery() method for execute DQL queries.
             */
            for (String array : qry) {
                preparedStatement = connection.prepareStatement(array);

                preparedStatement.execute();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            /*
                Closing the costly resources within the 'finally' block.
             */
            if (connection != null & preparedStatement != null) {
                try {
                    connection.close();
                    preparedStatement.close();

                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println(" Successfully");
    }
}
