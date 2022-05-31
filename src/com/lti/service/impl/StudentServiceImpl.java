package com.lti.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import com.lti.dao.StudentDao;
import com.lti.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public void registerCourse(String input) {
		// TODO Auto-generated method stub
		StudentDao ssd = new StudentDao();
		ssd.registerCourse(input);
		
	}

	@Override
	public ArrayList<String> viewreportcard() {
		StudentDao ssd = new StudentDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ID : ");
		int id=sc.nextInt();
		ArrayList<String> al=ssd.viewreportcard(id);
		System.out.println(al);
		return  al;
		
	}

	@Override
	public void viewCatalog() {
    	
    	StudentDao ssd = new StudentDao();
    	ArrayList resultlist = (ArrayList)ssd.viewCatalog();
    	
    	System.out.println(" Courses:");
    	for(int i=0;i<resultlist.size();i++){
    		System.out.println(i+1+"."+resultlist.get(i));
    	}
    	
    	
    }

	@Override
	public void payFee() {
		// TODO Auto-generated method stub
		StudentDao ssd = new StudentDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ID : ");
		int i=sc.nextInt();
		
		ssd.payFee(i);
		studentMenu();
		
	}

	@Override
	public void course() {
		// TODO Auto-generated method stub
		StudentDao ssd = new StudentDao();
		ArrayList a = new ArrayList();
		a=ssd.course();
		studentMenu();
	}
	public void studentMenu() {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Student Logged in at:  " + localDateTime);
		System.out.println("Menu");
		System.out.println("1.Register a Course\n2.View GradeCard\n3.View Catalog\n4.Add/Delete Course \n5.Pay Fee");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		switch (input) {

		case 1:
			StudentServiceImpl ssc = new StudentServiceImpl();
			ssc.viewCatalog();
			System.out.println("Please select the Course\n");
			String inp = sc.next();
			ssc.registerCourse(inp);

			break;

		case 2:
			StudentServiceImpl ssc1 = new StudentServiceImpl();
			ssc1.viewreportcard();
			studentMenu();
			break;

		case 3:
			StudentServiceImpl ssc2 = new StudentServiceImpl();
			ssc2.viewCatalog();
			studentMenu();
			break;

		case 4:
			StudentServiceImpl ssc3 = new StudentServiceImpl();
			ssc3.course();
			break;

		case 5:
			StudentServiceImpl ssc4 = new StudentServiceImpl();
			ssc4.payFee();
			break;

		}

	
	}
	}
