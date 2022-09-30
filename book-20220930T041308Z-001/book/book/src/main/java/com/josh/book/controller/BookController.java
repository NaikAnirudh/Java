package com.josh.book.controller;

import com.josh.book.entity.Book;
import com.josh.book.repo.BookRepo;
import com.josh.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
/*
Annotating the class BookController with @RestController.
*/
@RestController
public class BookController {
    //AutoWiring BookService to access the respective methods.
    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public Book saveData(@RequestBody Book book) {
        return bookService.saveData(book);
    }

    //Using GetMapping to fetch the data from the DataBase.
    @GetMapping("/find1/{id}")
    public Book findBook(@PathVariable("id") int id) {

        return bookService.getDataById(id);
    }

    //Using GetMapping to fetch all the respective data from the DataBase.
    @GetMapping("/findalllll")
    public List<Book> findall() {
        return bookService.findAllData();
    }
}
