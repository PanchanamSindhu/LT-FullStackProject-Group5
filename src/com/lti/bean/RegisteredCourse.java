package com.lti.bean;

public class RegisteredCourse {

	private String courseCode;
	private Integer semster;
	private Integer studentId;
	private Grade grade;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public Integer getSemster() {
		return semster;
	}

	public void setSemster(Integer semster) {
		this.semster = semster;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

}
