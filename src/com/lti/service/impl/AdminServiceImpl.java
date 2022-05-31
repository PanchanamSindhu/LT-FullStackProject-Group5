package com.lti.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.application.CRSApplication;
import com.lti.bean.Admin;
import com.lti.bean.Course;
import com.lti.dao.AdminDao;
import com.lti.service.AdminService;

public class AdminServiceImpl implements AdminService {

	Admin admin = new Admin();

	@Override
	public void addProfessor() {
		AdminDao adminDao = new AdminDao();
		adminDao.addProfessor();
	}

	@Override
	public void approveStudents() {
		// TODO Auto-generated method stub
		// adminDao.approveStudents();
		AdminDao adminDao = new AdminDao();
		adminDao.approveStudents();
	}

	@Override
	public void generateReportCard() {
		// TODO Auto-generated method stub
		AdminDao adminDao = new AdminDao();
		adminDao.generateReportCard();

	}

	@Override
	public List<Course> addCourse() {
		// TODO Auto-generated method stub
		AdminDao adminDao = new AdminDao();
		return adminDao.addCourse();

	}

	@Override
	public void addUser() {
		System.out.println("Welcome to registration page \n ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName :");
		String un = sc.next();
		admin.setUserName(un);
		System.out.println("Enter Password :");
		String pwd = sc.next();
		admin.setPassWord(pwd);
		System.out.println("Registration succesfully \n ");
		login();

	}

	@Override
	public void login() {
		CRSApplication adminApplication = new CRSApplication();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName :");
		String userName = sc.next();
		System.out.println("Enter Password :");
		String password = sc.next();
		if ((userName.equals(admin.getUserName())) && (password.equals(admin.getPassWord()))) {
			System.out.println("Login Successfull");
			loginList();

		} else {
			System.out.println(" In valid userName of password \n");
			adminApplication.AdminMenu();
			
		}

	}

	public void loginList() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1 - Add Professor ");
		System.out.println(" 2 - Approve Students");
		System.out.println(" 3 - Generate Report Card ");
		System.out.println(" 4 - Add Course ");
		System.out.println(" 5 - Remove Course ");
		int a = sc.nextInt();
		List<Course> course=new ArrayList<Course>();

		if (a == 1) {
			addProfessor();
		} else if (a == 2) {
			approveStudents();
		} else if (a == 3) {
			generateReportCard();
		} else if (a == 4) {
			 course = addCourse();
		} else if (a == 5) {

			removeCourse(course);
		}

	}

	@Override
	public void removeCourse(List<Course> course) {
		
		// TODO Auto-generated method stub
		AdminDao adminDao = new AdminDao();
		System.out.println("inside remove");
		adminDao.removeCourse(course);

	}

}
