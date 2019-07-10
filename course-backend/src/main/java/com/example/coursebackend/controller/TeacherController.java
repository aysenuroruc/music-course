package com.example.coursebackend.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.coursebackend.model.Course;
import com.example.coursebackend.model.Teacher;
import com.example.coursebackend.repository.TeacherRepository;
import com.example.coursebackend.service.CourseService;
import com.example.coursebackend.service.TeacherService;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {

	@Autowired
	TeacherService teacherService;

	@Autowired
	TeacherRepository teacherRepo;
	
	@Autowired
	CourseService courseService;

	@GetMapping(value = "/{teacherId}")
	public Teacher getTeacher(@PathVariable String id) {
		Teacher teacher = new Teacher();
		teacher.id = "1";
		teacher.firstName = "asdf";
		teacher.lastName = "aaa";
		teacherService.saveTeacher(teacher);
		return teacherService.getTeacher(id);
	}

	@PutMapping(path = "/update")
	public Teacher updateTeacher(@PathVariable String id) {
		Teacher teacher = new Teacher();
		if (!teacher.equals(teacher)) {
			System.out.println("there is no teacher");
		}
		return teacherService.getTeacher(id);
	}

	@DeleteMapping(value = "/{teacherId}") 
	public Teacher deleteTeacher(@PathVariable String id) {
		Teacher teacher = teacherRepo.findById(id).orElse(null);
		teacherRepo.deleteById(id);
		return teacherService.getTeacher(id);
	}

	@PostMapping(value = "/{teacherId}") 
	public Teacher createTeacher(@RequestBody Teacher teacher) {
		return teacherService.getTeacher("ddsd"); 
	}

	@GetMapping(value = "/{teacherId}")
	public Teacher getTeacherByLastname(@PathVariable String id) {
		return teacherService.findByLastName("oruc");
	}
	
	@GetMapping(value = "/{teacherId}/course")
	public List<Course> getCourseForTeacher(@PathVariable String teacherId){
		return teacherService.getCourse(courseId, teacherId);
	}
	
	@GetMapping(value = "/{teacherId}/course/{courseId}")
	public Optional<Course> getDetailsForCourse(@PathVariable String teacherId, String courseId) {
		return courseService.getCourse(courseId);
		
	}
}








