package com.lti.bean;

import java.util.List;

public class Report {

	private String studentId;
	private Integer semester;
	private float cgpa;
	private List<RegisteredCourse> registeredCourses;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public List<RegisteredCourse> getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(List<RegisteredCourse> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}

}