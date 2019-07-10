package com.example.coursebackend.service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coursebackend.model.Course;
import com.example.coursebackend.model.Student;
import com.example.coursebackend.repository.CourseRepository;
import com.example.coursebackend.repository.StudentRepository;

@Service
public class StudentService {

	// should i be static the below list?
	private List<Student> students = new ArrayList<Student>(); 

	//Student enes = new Student(5, ddd, "enes", "oruc", "guitar");

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CourseRepository courseRepository;

	public Student getStudent(String studentId) {
		Student student = studentRepository.findById(studentId).orElse(null);
		return student;
	}
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	public void doSomething() {
		List<Student> student = studentRepository.findByLastname("oruc");
	}

	public void saveCourse(Course course) {
		courseRepository.save(course);
	}

	// I was cast so will am i die?
	public List<Course> getCourses(String studentId){
		return (List<Course>) courseRepository.findAll();

	}
	public List<Student> getAllStudent(){
		return students;
	}

	public Course getCourse(String studentId, String courseId) {
		Student student = getStudent(studentId); 
		return courseId; // i cant see that problm 
	}

	public Course addCourse(String studentId, Course course) {
		Student student = getStudent(studentId);
		if (student == null) {
			return null;		
		}

		//private SecureRandom random = new SecureRandom();
		String uniqueID = UUID.randomUUID().toString();
		course.setId(uniqueID);
		student.getCourses().add(course);  //checkout returned value of getCourses 
		return course;
	}
}
