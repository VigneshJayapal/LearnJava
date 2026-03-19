package com.learnJava.MustKnownJavaConcept;

import com.mysql.cj.jdbc.Driver;
import org.testng.annotations.Test;

import java.sql.*;


public class CreateSQLConnection {

    /* To establish the SQL connection we need to follow the below steps,
    *   1. Mention the type of Database to be used
    *   2. Create Connection with Database by giving the DB details
    *   3. Create a Statement (Object creation for DB Server)
    *   4. Execute the Query (SQL query statement to retrieve data from DB)
    *   5. Store the Results in the Result Set
    *   6. Get the Result from the Result set
    *   7. Close the connection */

    /* XAMPP is there to create the MYSQL server Connection - trigger Apache server and MYSQL server */

    @Test
    public void mySQLconnection() throws ClassNotFoundException, SQLException {
//*   1. Mention the type of Database to be used - 1️⃣ Load MySQL Driver
        /* This loads the MySQL JDBC driver so Java can communicate with the database.
            Driver used: MySQL Connector/J */
        Class.forName("com.mysql.cj.jdbc.Driver");

//*   2. Create Connection with Database by giving the DB details - 2️⃣ Create Database Connection
        /* Format used:
            jdbc:mysql://hostname:port/databasename */
        Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/employeedetails");

//*   3. Create a Statement (Object creation for DB Server) - 3️⃣ Create Statement
        /* This object sends SQL queries to the database.*/
        Statement statement = connection.createStatement();

//*   4. Execute the Query (SQL query statement to retrieve data from DB) - 4️⃣ Execute Query
        /* executeQuery() → used for SELECT statements */
        ResultSet resultSet = statement.executeQuery("select * from employeedetails");

//*   5. Store the Results in the Result Set - 5️⃣ Store Result in ResultSet
        /*  ResultSet holds the data returned from the database. */
        while (resultSet.next()){

//*   6. Get the Result from the Result set - 6️⃣ Retrieve Data
            /* resultSet.next() moves row by row.
            ✔ Correct (assuming column names match the table)*/
            System.out.println("S.No "+resultSet.getInt(1));
            System.out.println("Emp Name: "+resultSet.getString(2));
            System.out.println("Emp ID: "+resultSet.getString(3));
        }

//* 7. close connections - 7️⃣ Close Resources
        /* Very important to avoid memory leaks */
        resultSet.close();
        statement.close();
        connection.close();
    }
}
