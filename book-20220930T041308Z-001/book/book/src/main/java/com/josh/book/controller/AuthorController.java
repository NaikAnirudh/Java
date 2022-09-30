package com.josh.book.controller;

import com.josh.book.entity.Author;
import com.josh.book.repo.AuthorRepo;
import com.josh.book.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*
Annotating the class AuthorController with @RestController.
 */
@RestController
public class AuthorController {
    //AutoWiring AuthorService to access the respective methods.
    @Autowired
    private AuthorService authorService;

    //Using GetMapping to fetch the data from the DataBase.
    @GetMapping("/getById/{authorId}")
    public Author fetch(@PathVariable("authorId") int authorId) {
        return authorService.getAuthorData(authorId);
    }

    //Using GetMapping to fetch all the respective data from the DataBase.
    @GetMapping("/find")
    public List<Author> find() {
        return authorService.getAllData();
    }
}

