package com.assessment.a2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.sql.SQLException;
import java.sql.Statement;

@Data
@AllArgsConstructor
@ToString
public class Student extends Person {
    public static void studentDetails() throws SQLException {
        Statement statement1 =null;
        String query2 =  "INSERT INTO Person (PERSONID,PERSONNAME,PERSONAGE,PERSONADDRESS,PERSONDESIGNATION) VALUES (1, 'ANIRUDH', 23, 'BANGALORE','STUDENT');";
        String query3 =  "INSERT INTO Person (PERSONID,PERSONNAME,PERSONAGE,PERSONADDRESS,PERSONDESIGNATION) VALUES (2, 'Lohith', 24, 'Davangere','STUDENT');";
        String query4 =  " UPDATE Person SET AGE = 25 WHERE ID = 1;";
        String query5 = "DELETE FROM COMPANY WHERE ID = 2;";
        statement1.execute(query2);
        statement1.execute(query3);
        statement1.execute(query4);
        statement1.execute(query5);
        statement1.close();
    }

    public static void main(String[] args) throws SQLException {
        Student.studentDetails();

    }
}
