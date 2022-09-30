package com.josh.book.controller;

import com.josh.book.entity.Teacher;
import com.josh.book.repo.TeacherRepo;
import com.josh.book.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*
Annotating the class BookController with @RestController.
 */
@RestController
public class TeacherController {
    //AutoWiring TeacherService to access the respective methods.
    @Autowired
    private TeacherService teacherService;

    //Using PostMapping to add and save the data into the DataBase.
    @PostMapping("/saveData")
    public Teacher saveData(@RequestBody Teacher teacher) {
        return teacherService.saveTeacherData(teacher);
    }

    //Using GetMapping to fetch the data from the DataBase.
    @GetMapping("/getvalue")
    public List<Teacher> fetchvalue() {
        return teacherService.findTeacherData();
    }
}
