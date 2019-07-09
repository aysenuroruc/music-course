package com.example.coursebackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.coursebackend.model.Student;
import com.example.coursebackend.model.Teacher;
import com.example.coursebackend.repository.TeacherRepository;

@Component
public class TeacherService {

	@Autowired
	TeacherRepository teacherRepo;

	public Teacher getTeacher(String id){
		Teacher teacher = teacherRepo.findById(id).orElse(null);
		return teacher;
	}

	public void saveTeacher(Teacher teacher) {
		teacherRepo.save(teacher);
	}
	
	public Teacher findByLastName(String id) {
		List<Teacher> teacher = teacherRepo.findByLastname("oruc");
		return (Teacher) teacher;
	}
}
