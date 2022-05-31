/**
 * 
 */
package com.lti.application;

import java.util.List;
import java.util.Scanner;

import com.lti.bean.Admin;
import com.lti.bean.Login;
import com.lti.bean.Student;
import com.lti.dao.LoginRegDao;
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

		
		System.out.println("********* Welocme to CRS Application *************\n");
		optionSelect();
		
	}
	
	public static void optionSelect() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. New Registartion :");
		System.out.println("2. Login :");
		System.out.println("3. Forget Password :");
		System.out.println("Pleace Select Your Choice :\n");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			registration();
			break;

		case 2:
			login();
			break;

		case 3:
			updatePassword();
			break;

		}
	}

	public static void login() {
		AdminServiceImpl adminApplication = new AdminServiceImpl();
		LoginRegDao loginRegDao = new LoginRegDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName :");
		String userName = sc.next();
		System.out.println("Enter Password :");
		String password = sc.next();
		List<Login> loginList = loginRegDao.verifyLogin();
		for (Login login : loginList) {
			System.out.println(login.getUserName());
			if (login.getUserName().equalsIgnoreCase(userName) && (password.equals(login.getPassword()))) {
				System.out.println("Login Successfull");
				if (login.getType().equalsIgnoreCase("Admin")) {
					adminApplication.loginList();
				} else if (login.getType().equalsIgnoreCase("student")) {
					System.out.println("Student");
				} else if (login.getType().equalsIgnoreCase("Professor")) {
					System.out.println("professor");
				}

			}} 
		
		}

	
	public static void registration() {
		
		System.out.println(" Please enter you information ");
		LoginRegDao loginRegDao = new LoginRegDao();
		loginRegDao.registration();
		login();
	}
	
	public static void updatePassword(){
		
		System.out.println(" Enter you Id ");
		Scanner sc=new Scanner(System.in);
		double id=sc.nextDouble();
		LoginRegDao loginRegDao = new LoginRegDao();
		loginRegDao.updatePassword(id);
		optionSelect();
	}
}
