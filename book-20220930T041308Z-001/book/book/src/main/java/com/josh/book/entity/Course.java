package com.josh.book.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
/*
  Using @Entity to create a table with the Class name in the DataBase.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    //Using @Id to set the primary Key for the Entity.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    private String courseName;

    //Using @ManyToOne to implement the said relation with the specified tableName and columnName.
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(
            name = "teacher_Id",
            referencedColumnName = "teacherId"
    )
    private Teacher teacher;
}
