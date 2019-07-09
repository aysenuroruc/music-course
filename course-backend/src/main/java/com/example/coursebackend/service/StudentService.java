package com.example.coursebackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.coursebackend.model.Student;
import com.example.coursebackend.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student getStudent(String id) {
		Student student = studentRepository.findById(id).orElse(null);
		return student;
	}
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void doSomething() {
		List<Student> student = studentRepository.findByLastname("oruc");
	}

}
