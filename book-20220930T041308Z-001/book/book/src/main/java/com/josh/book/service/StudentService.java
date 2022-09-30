package com.josh.book.service;

import com.josh.book.entity.Student;
import com.josh.book.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    //AutoWiring StudentRepo to access the respective methods.
    @Autowired
    private StudentRepo studentRepo;

    //Creating saveStudentData to implement the repository methods.
    public Student saveStudentData(Student student) {
        return studentRepo.save(student);
    }

    //Creating findData to implement the repository methods.
    public List<Student> findData() {
        return studentRepo.findAll();
    }

    //Creating findStudentById to implement the repository methods.
    public Student findStudentById(int id) {
        return studentRepo.findById(id).get();
    }
}
