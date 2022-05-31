package com.lti.service;

import java.util.List;

import com.lti.bean.Course;

public interface AdminService {

	public void addProfessor();

	public void approveStudents();

	public void generateReportCard();

	public List<Course> addCourse();
	
	public void removeCourse(List<Course> l);

	public void addUser();

	public void login();

}
