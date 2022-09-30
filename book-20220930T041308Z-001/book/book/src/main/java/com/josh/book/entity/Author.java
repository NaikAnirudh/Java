package com.josh.book.entity;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
/*
  Using @Entity to create a table with the Class name in the DataBase.
 */
@Entity
@Data
@RequiredArgsConstructor
//Changing the table name
@Table(name = "authors")
public class Author {
    //Using @Id to set the primary Key for the Entity.
    //implementing custom sequenceGenerator.
    @Id
    @SequenceGenerator(name = "authorId", sequenceName = "authorId", allocationSize = 1, initialValue = 400)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authorId")
    private int authorId;
    private String firstName;
    private String lastName;
    private String language;

//Using @OneToOne to implement the said relation.
/*
    @OneToOne(mappedBy = "author")
    @JoinColumn(
            name = "id",
            referencedColumnName = "id"
    )
    private Book book;
 */

}
