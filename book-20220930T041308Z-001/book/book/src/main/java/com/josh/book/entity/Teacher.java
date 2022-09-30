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
public class Teacher {
    //Using @Id to set the primary Key for the Entity.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teacherId;
    private String teacherName;

    //Using @OneToMany to implement the said relation.
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(
            name = "teacher_Id",
            referencedColumnName = "teacherId"
    )
    private List<Course> course;
}
