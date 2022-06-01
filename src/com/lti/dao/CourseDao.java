package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

public class CourseDao implements CourseDaoInterface {

	
	@Override
	public List<String> returnAllCoursesList() {
		List<String> allCoursesList = new ArrayList<>();
		allCoursesList.add("Java");
		allCoursesList.add("Python");
		allCoursesList.add("Data Science");
		allCoursesList.add("Cloud Computing");
		allCoursesList.add("Kafka");
		return allCoursesList;
	}

	@Override
	public List<String> ListOfCourses() {
		List<String> courseList = new ArrayList<>();
		courseList.add("Java");
		courseList.add("Python");
		courseList.add("Data Science");
		courseList.add("Cloud Computing");

		return courseList;
	}

}
