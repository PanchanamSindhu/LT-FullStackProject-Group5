package com.lti.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.lti.exception.CourseNotFoundException;
import com.lti.service.impl.StudentServiceImpl;

public class StudentDao implements StudentDaoInterface {

	@Override
	public void registerCourse(String inp) {
		if (inp.equals("Java")) {
			System.out.println("Successfully Registered for Java Course");
		} else if (inp.equals("Python")) {
			System.out.println("Successfully Registered for Python Course");
		} else if (inp.equals("Big Data")) {
			System.out.println("Successfully Registered for Big data Course");
		} else if (inp.equals("Cloud")) {
			System.out.println("Successfully Registered for Cloud Course");
		} else {
			try {
				throw new CourseNotFoundException("InValid Option Chosen. Choose the valid option.");
			} catch (CourseNotFoundException e) {
				System.out.println(e);
			}
		}
		StudentServiceImpl st = new StudentServiceImpl();
		st.studentMenu();
	}

	@Override
	public ArrayList viewreportcard(int i) {
		ArrayList<String> datalist = new ArrayList<String>();
		if(i == 1) {
			System.out.println("Report Card Generated fro ID :"+i);
			datalist.add("Java - A");
			datalist.add("Python - B");
			datalist.add("Big data - A+");
			datalist.add("Cloud - A");}
		if(i == 2) {
			System.out.println("Report Card Generated fro ID :"+i);
			datalist.add("Java - B");
			datalist.add("Python - A");
			datalist.add("Big data - A+");
			datalist.add("Cloud - C");}
		if(i == 3) {
			System.out.println("Report Card Generated fro ID :"+i);
			datalist.add("Java - A+");
			datalist.add("Python - B");
			datalist.add("Big data - A+");
			datalist.add("Cloud - B");}
		
		return datalist;
	
	}

	@Override
	public ArrayList viewCatalog() {

		Stream<String> stream = Stream.of("Java", "Python", "Big Data", "Cloud");

		List<String> list = stream.collect(Collectors.toList());

		ArrayList<String> arrayList = new ArrayList<String>(list);

		return arrayList;

	}

	@Override
	public void payFee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewFee(int f) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList course() {
		// TODO Auto-generated method stub

		return null;
	}

}
