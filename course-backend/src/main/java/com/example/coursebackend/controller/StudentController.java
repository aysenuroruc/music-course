package com.example.coursebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.coursebackend.model.Student;
import com.example.coursebackend.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Student get(@PathVariable String id) {
		return studentService.retrieveStudent(id);
	}

	@PostMapping(value = "")
	@ResponseStatus(HttpStatus.CREATED)
	public Student save(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@PutMapping(value = "")
	public Student update(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
}
