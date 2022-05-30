package com.lti.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	public void addCourse() {
		// TODO Auto-generated method stub

	}

}
