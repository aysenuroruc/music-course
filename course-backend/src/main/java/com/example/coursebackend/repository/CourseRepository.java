package com.example.coursebackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.coursebackend.model.Course;
import com.example.coursebackend.model.Student;
import com.example.coursebackend.model.Teacher;

public interface CourseRepository extends CrudRepository<Course, String> {
	List<Course> findAllCoursesForTeacher(String teacherId , String courseId);
	List<Course> findAllCoursesForStudent(String studentId , String courseId);	
}
