package com.lti.service;

import java.util.ArrayList;

/**
 * Interface class that has the following methods.
 * 
 * @author Group5
 * @since 05-31-2022
 */
public interface StudentService {

	public void registerCourse(String input);

	public ArrayList<String> viewreportcard();

	public void viewCatalog();

	public void payFee();

	public void course();
	
	public void viewStudents();

}
