package com.lti.bean;

import java.util.Date;

public class SemesterRegistration {

	private String studentId;
	private Integer semester;
	private String courseCode;
	private Date registrationdDate;

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

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public Date getRegistrationdDate() {
		return registrationdDate;
	}

	public void setRegistrationdDate(Date registrationdDate) {
		this.registrationdDate = registrationdDate;
	}

}
