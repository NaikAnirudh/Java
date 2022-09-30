package com.josh.book.service;

import com.josh.book.entity.Library;
import com.josh.book.repo.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    //AutoWiring LibraryRepo to access the respective methods.
    @Autowired
    private LibraryRepo libraryRepo;

    //Creating saveLibraryData to implement the repository methods.
    public Library saveLibraryData(Library library) {
        return libraryRepo.save(library);
    }
}
