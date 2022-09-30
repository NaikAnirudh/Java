package com.josh.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
/*
  Using @Entity to create a table with the Class name in the DataBase.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    //Using @Id to set the primary Key for the Entity.
    //implementing custom sequenceGenerator.
    @Id
    @SequenceGenerator(name = "studentNumber",sequenceName = "studentNumber",allocationSize = 1,initialValue = 100)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "studentNumber")
    private int studentId;
    private String studentName;

    //Using @ManyToMany to implement the said relation.
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "stu_lib",
            joinColumns = @JoinColumn(
                    name = "student_Id",
                    referencedColumnName = "studentId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "book_Id",
                    referencedColumnName = "bookId"
            )
    )
    private List<Library> libraryList;
}
