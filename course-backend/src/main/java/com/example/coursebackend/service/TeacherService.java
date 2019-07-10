package com.example.coursebackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.coursebackend.model.Course;
import com.example.coursebackend.model.Teacher;
import com.example.coursebackend.repository.CourseRepository;
import com.example.coursebackend.repository.TeacherRepository;

@Component
public class TeacherService {


	@Autowired
	TeacherRepository teacherRepo;
	
	@Autowired
	CourseRepository courseRepository;

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
	
	public List<Course> getCourses(String courseId) {
		return (List<Course>) courseRepository.findAll();
		// should am i create findAllCorses() method at CourseRepository instead of be cast ?
	}
	
	public Course saveCourse(Course courseId) { // sadece teacher'ýn kurslarýný kaydetmek istemiþtim ya :/
		courseRepository.save(entity);
	}
	
	public Optional<Teacher> getCourse(String courseId, String teacherId) { //optional yaptýrdý zorla :/
		Teacher teacher = getTeacher(teacherId);
		return teacherRepo.findById(courseId);
	}
}
