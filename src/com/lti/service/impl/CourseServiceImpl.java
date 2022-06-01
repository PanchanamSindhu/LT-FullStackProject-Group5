package com.lti.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lti.dao.CourseDao;
import com.lti.service.CourseService;

public class CourseServiceImpl implements CourseService {

	CourseDao courseDao=new CourseDao();
	
	@Override
	public void CoursesList() {
		List<String> courses=new ArrayList<String>();
		courses=courseDao.ListOfCourses();
		System.out.println("Available Courses :"+ courses+"\n");
	}

	@Override
	public Void AllCoursesList() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
