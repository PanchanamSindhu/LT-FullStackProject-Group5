package com.lti.dao;

import java.util.List;

import com.lti.bean.Course;

/**
 * Interface class that has the following methods.
 * 
 * @author Group5
 * @since 05-31-2022
 */
public interface AdminDaoInterface {

	public void addProfessor();

	public void approveStudents();

	public void generateReportCard();

	public List<Course> addCourse();
	
	public void removeCourse(List<Course> course);
	

}
