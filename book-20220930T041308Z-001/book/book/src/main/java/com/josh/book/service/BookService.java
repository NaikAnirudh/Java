package com.josh.book.service;

import com.josh.book.entity.Book;
import com.josh.book.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BookService {
    //AutoWiring BookRepo to access the respective methods.
    @Autowired
    private BookRepo bookRepo;

    //Creating saveData to implement the repository methods.
    public Book saveData(Book book) {
        return bookRepo.save(book);
    }

    //Creating getDataById to implement the repository methods.
    public Book getDataById(int id) {
        return bookRepo.findById(id).get();
    }

    //Creating findAllData to implement the repository methods.
    public List<Book> findAllData() {
        return bookRepo.findAll();
    }
}
