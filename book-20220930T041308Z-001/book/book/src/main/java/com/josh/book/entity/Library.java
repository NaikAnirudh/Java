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
public class Library {
    //Using @Id to set the primary Key for the Entity.
    //implementing custom sequenceGenerator.
    @Id
    @SequenceGenerator(name = "libraryNumber", sequenceName = "libraryNumber", allocationSize = 1, initialValue = 400)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libraryNumber")
    private int bookId;
    private String bookName;

    //Using @OneToOne to implement the said relation.
    /*
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "lib_stu",
            joinColumns = @JoinColumn(
                    name = "book_Id",
                    referencedColumnName = "bookId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "student_Id",
                    referencedColumnName = "studentId"
            )
    )
    private List<Student> studentList;
     */

}
