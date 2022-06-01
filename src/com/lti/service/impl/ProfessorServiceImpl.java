package com.lti.service.impl;

import java.util.Scanner;

import com.lti.application.CRSApplication;
import com.lti.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {

	@Override
	public void addGrades() {
		
	}

	@Override
	public void viewRegisteredStudents() {
		StudentServiceImpl studentService=new StudentServiceImpl();
		studentService.viewStudents();

	}

	@Override
	public void selectCourses() {
		CourseServiceImpl courseService = new CourseServiceImpl();
		courseService.CoursesList();

	}

	public  void professorMenu() {
		System.out.println("===== Professor Memu =====");
		System.out.println("Choose from following options:");
		System.out.println("--------------");
		System.out.println("1. View Teaching Courses : ");
		System.out.println("2. View Enrolled Student : ");
		System.out.println("3. Add Grades : ");
		System.out.println("4. Logout : ");
		
		System.out.println("Enter your Option : \n");
		Scanner sc= new Scanner(System.in);
		int profChoice=sc.nextInt();
		
		switch (profChoice) {
		case 1:
			selectCourses();
			professorMenu();
			break;

		case 2:
			viewRegisteredStudents();
			professorMenu();
			break;

		case 3:
			//addGrades();
			//professorMenu();
			//break;
		case 4:
			CRSApplication.optionSelect();

		}	
		
	}

}
