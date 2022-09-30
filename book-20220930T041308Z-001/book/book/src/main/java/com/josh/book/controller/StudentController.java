package com.josh.book.controller;

import com.josh.book.entity.Library;
import com.josh.book.entity.Student;
import com.josh.book.repo.LibraryRepo;
import com.josh.book.repo.StudentRepo;
import com.josh.book.service.LibraryService;
import com.josh.book.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
/*
Annotating the class StudentController with @RestController.
 */
@RestController
public class StudentController {
    //AutoWiring StudentService to access the respective methods.
    @Autowired
    private StudentService studentService;

    //AutoWiring LibraryService to access the respective methods.
    @Autowired
    private LibraryService libraryService;

    //Using PostMapping to add and save the data into the DataBase.
    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student) {

        return studentService.saveStudentData(student);
    }

    //Using PostMapping to add and save the data into the DataBase.
    @PostMapping("/savelibrary")
    public Library saveLib(@RequestBody Library library) {
        return libraryService.saveLibraryData(library);
    }

    //Using GetMapping to fetch the data from the DataBase.
    @GetMapping("/getStudent")
    public List<Student> getStudent() {
        return studentService.findData();
    }

    //Using GetMapping to fetch the data from the DataBase.
    @GetMapping("/findStudentId/{id}")
    public Student findStudentById(@PathVariable("id") int id) {
        return studentService.findStudentById(id);

    }
}
