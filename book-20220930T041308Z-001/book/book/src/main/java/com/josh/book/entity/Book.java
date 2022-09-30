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
@Table(name = "Books")
public class Book {
    //Using @Id to set the primary Key for the Entity.
    //implementing custom sequenceGenerator.
    @Id
    @SequenceGenerator(name = "bookNumber", sequenceName = "bookNumber", allocationSize = 1, initialValue = 100)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookNumber")
    private int id;
    private String title;

    //Using @OneToOne to implement the said relation.
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_Id", referencedColumnName = "authorId")
    private Author author;
}



