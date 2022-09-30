package com.josh.book.repo;

import com.josh.book.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
