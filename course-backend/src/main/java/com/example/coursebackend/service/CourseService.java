package com.example.coursebackend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coursebackend.model.Course;
import com.example.coursebackend.model.Student;
import com.example.coursebackend.model.Teacher;
import com.example.coursebackend.repository.CourseRepository;
import com.example.coursebackend.repository.StudentRepository;
import com.example.coursebackend.repository.TeacherRepository;

@Service
public class CourseService {
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	TeacherRepository teacherRepository;
	
	public Optional<Course> getCourse(String courseId) {
		Optional<Course> course = courseRepository.findById(courseId); // neden sürekli optional yapmak istiyor? 
		return course;
	}
	 
	public Optional<Student> getRegisteredStudent(String studentId) {
		//Student student = studentRepository.findById(studentId);
		return studentRepository.findById(studentId);
	}
	
	public Optional<Teacher> getRegisteredTeacher(String teacherId) {	
		return teacherRepository.findById(teacherId);
		
	}
}
