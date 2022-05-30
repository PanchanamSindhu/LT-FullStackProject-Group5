package com.lti.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.bean.Student;
import com.lti.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public void registerCourses() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewReportCard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewCatalog() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dropCourse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewGrades() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addStudent() {
		List<Student> student = new ArrayList<Student>();
		Student stu = new Student();
		System.out.println("Welcome to Student registration page \n ");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your ID: ");
		String a = sc.next();
		stu.setStudentId(a);
		System.out.println(" Enter your branch ");
		String branch = sc.next();
		stu.setBranch(branch);
		System.out.println(" Enter your Grade ");
		String g = sc.next();
		stu.setGrade(g);
		System.out.println("Enter your Name :");
		String un = sc.next();
		stu.setStudentName(un);
		System.out.println("Enter Password :");
		String pwd = sc.next();
		stu.setPassWord(pwd);
		System.out.println("Registration succesfully \n ");
		studentLogin();

	}

	@Override
	public void studentLogin() {
		List<Student> student = new ArrayList<Student>();
		System.out.println("Welcome to Student Login page \n ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StudentId :");
		String userName = sc.next();
		System.out.println("Enter Password :");
		String password = sc.next();
		for (Student stu : student) {
			if ((userName.equals(stu.getStudentId())) && (password.equals(stu.getPassWord()))) {
				System.out.println("Login Successfull");
				// StudentList();
			} else {
				System.out.println(" In valid userName of password \n");
				// adminApplication.AdminMenu();;
			}
		}

	}

}
