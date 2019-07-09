package com.example.coursebackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.coursebackend.model.Student;

public interface StudentRepository extends CrudRepository<Student, String> {

	List<Student> findByLastname(String lastname);
}
