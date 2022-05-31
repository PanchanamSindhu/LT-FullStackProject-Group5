package com.lti.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.lti.bean.Course;
import com.lti.bean.Professor;
import com.lti.bean.Student;
import com.lti.service.impl.AdminServiceImpl;

public class AdminDao implements AdminDaoInterface {

	AdminServiceImpl adminServiceImpl = new AdminServiceImpl();;

	@Override
	public void addProfessor() {
		System.out.flush();
		List<Professor> prof = new ArrayList<Professor>();
		System.out.println(" Enter the count of professor to add");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			Professor pro = new Professor();
			System.out.println(" Enter Name , Designation, Department");
			String n = sc.next();
			String desi = sc.next();
			String dept = sc.next();
			pro.setProfName(n);
			pro.setDepartment(dept);
			pro.setDesignation(desi);
			prof.add(pro);
		}
		System.out.println(" enter 1 to display ProfessorList and 2 to redirect to main menu");
		int b = sc.nextInt();
		if (b == 1) {
			for (Professor po : prof) {
				System.out.println(" Department Name:-  " + po.getDepartment() + " \n Designation :- "
						+ po.getDesignation() + "\n Professor Name:- " + po.getProfName());
				System.out.println();
			}
			System.out.println(" Redirecting to main menu...");
			adminServiceImpl.loginList();
		} else if (b == 2) {
			adminServiceImpl.loginList();
		}

	}

	@Override
	public void approveStudents() {
		
		
	}

	@Override
	public void generateReportCard() {
		
		// TODO Auto-generated method stub

	}

	@Override
	public List addCourse() {
		List<Course> courseList = new ArrayList<Course>();
		System.out.println(" Enter the no of  Courses to add");
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
		for(int i=1;i<=count;i++) {
			Course course = new Course();
			System.out.println(" Enter CourseCode , CourseName, isoffered,  Instructor Name");
			String courseCode = sc.next();
			String courseName = sc.next();
			Boolean isOffered = sc.nextBoolean();
			String instructorName=sc.next();
			
			course.setCourseCode(courseCode);
			course.setCourseName(courseName);
			course.setOffered(isOffered);
			course.setInstructor(instructorName);
			courseList.add(course);
			
		}
		System.out.println(" enter 1 to display CourseList and 2 to redirect to main menu");
		int b = sc.nextInt();
		if (b == 1) {
			for (Course co : courseList) {
				System.out.println(" Course Code:-  " + co.getCourseCode() + " \n CourseName :- "
						+ co.getCourseName() + "\n Course is Offered:- " + co.isOffered() + "\n Intrsuctor Name:-" + co.getInstructor());
				System.out.println();
			}
			System.out.println(" Redirecting to main menu...");
			adminServiceImpl.loginList();
		} else if (b == 2) {
			adminServiceImpl.loginList();
		}

		
		return courseList;

	}

	@Override
	public void removeCourse(List<Course> couserList) {
		
		System.out.println("inside remove DAO");
		System.out.println(" Enter the Course Name to Remove");
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
//		for(Course course:couserList) {
//			if(course.getCourseName().equals(name)) {
//				couserList.remove(course);
//			}
//			
//		}
		System.out.println(
				"Removing Course from List : " + couserList.stream().filter(i -> i.getCourseName().equals(name)).collect(Collectors.toList()));
			
		System.out.println(" Course Removed Successfully!!" + couserList);
		System.out.println(" Redirecting to main menu...");
		adminServiceImpl.loginList();
	}

}
