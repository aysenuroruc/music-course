package com.example.coursebackend.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	public Student() {
		super();
	}

	public Student(String studentId, List<Course> courses, String firstName, String lastName, String category) {
		super();
		this.studentId = studentId;
		this.courses = courses;
		this.firstName = firstName;
		this.lastName = lastName;
		this.category = category;
	}
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Id
	public String studentId;
	public List<Course> courses;

	public String getId() {
		return studentId;
	}

	public void setId(String id) {
		this.studentId = id;
	}
	public String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String lastName;
	public String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
