package com.lti.dao;

import java.util.ArrayList;

/**
 * Interface class that has the following methods.
 * 
 * @author Group5
 * @since 05-31-2022
 */
public interface StudentDaoInterface {

	public void registerCourse(String inp);

	public ArrayList viewreportcard(int i);

	public ArrayList viewCatalog();

	public void payFee(int i);

	public void viewFee();

	public ArrayList course();
	
	public void StudentDetails();

}
