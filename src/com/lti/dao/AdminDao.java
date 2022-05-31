package com.lti.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.lti.bean.Course;
import com.lti.bean.Professor;
import com.lti.bean.Student;
import com.lti.service.impl.AdminServiceImpl;
import com.lti.service.impl.StudentServiceImpl;

public class AdminDao implements AdminDaoInterface {

	AdminServiceImpl adminServiceImpl = new AdminServiceImpl();;

	/**
	 * 
	 * This method allow to add professors .
	 * return nothing
	 */
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

	/**
	 * 
	 * This method allows user to generate ReportCard .
	 * return nothing
	 */
	@Override
	public void generateReportCard() {

		StudentServiceImpl st = new StudentServiceImpl();
		ArrayList<String> al = new ArrayList<String>();
		al = st.viewreportcard();

	}

	/**
	 * 
	 * This method allows user to add course . 
	 * return List
	 */
	@Override
	public List<Course> addCourse() {
		List<Course> courseList = new ArrayList<Course>();
		System.out.println(" Enter the no of  Courses to add");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			Course course = new Course();
			System.out.println(" Enter CourseCode , CourseName, isoffered,  Instructor Name");
			String courseCode = sc.next();
			String courseName = sc.next();
			Boolean isOffered = sc.nextBoolean();
			String instructorName = sc.next();

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
				System.out.println(" Course Code:-  " + co.getCourseCode() + " \n CourseName :- " + co.getCourseName()
						+ "\n Course is Offered:- " + co.isOffered() + "\n Intrsuctor Name:-" + co.getInstructor());
				System.out.println();
			}
			System.out.println(" Redirecting to main menu...");
			adminServiceImpl.loginList();
		} else if (b == 2) {
			adminServiceImpl.loginList();
		}
		System.out.println("inside add course" + courseList);
		return courseList;

	}

	/**
	 * 
	 * This method allows user to remove course . 
	 * return nothing
	 */
	@Override
	public void removeCourse(List<Course> couserList) {

		System.out.println(couserList);
		System.out.println(" Enter the Course Name to Remove");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		List<Course> cList = new ArrayList<Course>();

		couserList.stream().filter(item -> item.getCourseName().equals(name)).forEach(item -> {

			cList.add(item);
		});
		System.out.println(cList);
		couserList.removeAll(cList);

		System.out.println(" Course Removed Successfully!!" + couserList);
		System.out.println(" Redirecting to main menu...");
		adminServiceImpl.loginList();
	}

}
