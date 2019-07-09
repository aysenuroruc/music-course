package com.example.coursebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.coursebackend.model.Student;
import com.example.coursebackend.repository.StudentRepository;
import com.example.coursebackend.service.StudentService;

@RestController
@RequestMapping(value ="/student")
public class StudentController {
	@Autowired
	StudentRepository studentRepository;

	@Autowired
	StudentService studentService;

	@RequestMapping(value="/create/{id}", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(Student id) {
		Student student = new Student();
		student.category = "guitar";
		student.firstName  = "aysenur";
		student.id = "2";
		student.lastName = "oruc";
		return studentRepository.save(student);
	}
	
	@RequestMapping(value = "/get/{id}", method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.NON_AUTHORITATIVE_INFORMATION) 
	public Student getStudent(@PathVariable String id) {
		Student student = studentService.getStudent(id);
		return (Student) studentRepository.findAll();		
	}

	@RequestMapping(value ="/delete/{id}", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Student deleteStudent(@PathVariable String id) {
		Student student = studentRepository.findById(id).orElse(null);
		studentRepository.deleteById(id);
		return student;
	}
	@RequestMapping(value ="/update/{id}", method = RequestMethod.PUT)
	public Student updateStudent(String id) {
		Student student = new Student();
		if (!student.equals(student)) {
			System.out.println("student null");
		}
		return studentService.getStudent(id);
	}
	
}












