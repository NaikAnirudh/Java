package com.josh.book.service;

import com.josh.book.entity.Author;
import com.josh.book.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    //AutoWiring AuthorRepo to access the respective methods.
    @Autowired
    private AuthorRepo authorRepo;

    //Creating getAuthorData to implement the repository methods.
    public Author getAuthorData(int authorId) {
        return authorRepo.findById(authorId).get();
    }

    //Creating getAllData to implement the repository methods.
    public List<Author> getAllData() {
        return authorRepo.findAll();
    }
}
