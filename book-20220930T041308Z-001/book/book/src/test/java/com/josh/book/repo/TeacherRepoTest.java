package com.josh.book.repo;

import com.josh.book.entity.Course;
import com.josh.book.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepoTest {
    @Autowired
    public  TeacherRepo teacherRepo;

    @Test
    public  void  save(){
        Course course = Course.builder()
                .courseName("jPA")
                .build();
        Course course1 = Course.builder()
                .courseName("hibernate")
                .build();
        Teacher teacher = Teacher.builder()
                .teacherName("saqlain")
                .course(Arrays.asList(course,course1))
                .build();


        teacherRepo.save(teacher);
    }
    @Test
    public void fetchdata(){
      Teacher list = (Teacher) teacherRepo.findAll();
        System.out.println(list);
    }

}