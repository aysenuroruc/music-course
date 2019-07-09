package com.example.coursebackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.coursebackend.model.Student;
import com.example.coursebackend.model.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, String>{
	List<Teacher> findByLastname(String lastname);
}
