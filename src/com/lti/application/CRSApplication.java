/**
 * 
 */
package com.lti.application;

import java.util.Scanner;

import com.lti.bean.Admin;
import com.lti.bean.Student;
import com.lti.service.impl.AdminServiceImpl;
import com.lti.service.impl.StudentServiceImpl;

/**
 * @author user211
 *
 */
public class CRSApplication {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Welocme to CRS Application \n");

		System.out.println("Enter the the way in which you want to login");
		System.out.println(" Admin ");
		System.out.println(" Student");
		System.out.println(" Professor ");

		String user = sc.next();

		if (user.equalsIgnoreCase("Admin")) {
			AdminMenu();
		} else if (user.equalsIgnoreCase("Student")) {
			studentMenu();
		} else if (user.equalsIgnoreCase("Professor")) {

		}

	}

	public static void AdminMenu() {
		Admin admin = new Admin();

		AdminServiceImpl adminService = new AdminServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. New Registartion :");
		System.out.println("2. Login :");
		System.out.println("3. Update Password :");
		// System.out.println("4. Exit :\n");

		System.out.println("Pleace Select Your Choice :\n");

		int input = sc.nextInt();
		switch (input) {
		case 1:
			adminService.addUser();
			break;

		case 2:
			adminService.login();
			break;

		case 3:
			System.out.println("Enter New  Password :");
			String ps = sc.next();
			admin.setPassWord(ps);
			System.out.println("Password Upadted succesfully ");
			break;

		}

	}

	public static void studentMenu() {
		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. New Registartion :");
		System.out.println("2. Login :");
		System.out.println("3. Update Password :");
		// System.out.println("4. Exit :\n");

		System.out.println("Pleace Select Your Choice :\n");

		int input = sc.nextInt();
		switch (input) {
		case 1:
			studentServiceImpl.addStudent();
			break;

		case 2:
			studentServiceImpl.studentLogin();
			break;

		case 3:
			System.out.println("Enter New  Password :");
			String ps = sc.next();
			student.setPassWord(ps);
			System.out.println("Password Upadted succesfully ");
			break;
		}
	}

}
