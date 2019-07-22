package com.example.coursebackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coursebackend.model.Student;
import com.example.coursebackend.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public Student retrieveStudent(String id) {
		Student student = studentRepository.findById(id).orElse(null);
		return student;
	}

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updateStudent(Student student) {
		// TODO here add some checks
		return studentRepository.save(student);
	}

	public void deleteStudent(String id) {
		// TODO add some checks
		studentRepository.deleteById(id);
	}
}
