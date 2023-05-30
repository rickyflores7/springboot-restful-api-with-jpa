package com.bootcamp.springbootrestfulapiwithjpa.repository;


import com.bootcamp.springbootrestfulapiwithjpa.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
