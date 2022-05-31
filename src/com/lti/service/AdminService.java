package com.lti.service;

import java.util.List;

import com.lti.bean.Course;

/**
 * Interface class that has the following methods.
 * 
 * @author Group5
 * @since 05-31-2022
 */
public interface AdminService {

	public void addProfessor();

	public void approveStudents();

	public void generateReportCard();

	public List<Course> addCourse();
	
	public void removeCourse(List<Course> l);

}
