package com.josh.book.service;

import com.josh.book.entity.Teacher;
import com.josh.book.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    //AutoWiring TeacherRepo to access the respective methods.
    @Autowired
    private TeacherRepo teacherRepo;

    //Creating saveStudentData to implement the repository methods.
    public Teacher saveTeacherData(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    //Creating findTeacherData to implement the repository methods.
    public List<Teacher> findTeacherData() {
        return teacherRepo.findAll();
    }
}
