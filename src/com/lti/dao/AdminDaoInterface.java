package com.lti.dao;

import java.util.List;

import com.lti.bean.Course;



public interface AdminDaoInterface {

	public void addProfessor();

	public void approveStudents();

	public void generateReportCard();

	public List<Course> addCourse();
	
	public void removeCourse(List<Course> course);
	

}
