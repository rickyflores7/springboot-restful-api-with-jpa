package com.bootcamp.springbootrestfulapiwithjpa.repository;

import com.bootcamp.springbootrestfulapiwithjpa.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
