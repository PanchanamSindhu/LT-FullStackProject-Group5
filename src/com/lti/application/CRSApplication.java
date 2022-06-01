/**
 * 
 */
package com.lti.application;

import java.util.List;
import java.util.Scanner;

import com.lti.bean.Login;
import com.lti.dao.LoginRegDao;
import com.lti.service.impl.AdminServiceImpl;
import com.lti.service.impl.ProfessorServiceImpl;
import com.lti.service.impl.StudentServiceImpl;

/**
 * The CRS program implements an application that simply allows the user to
 * perform Specific actions by taking Input from console.
 *
 * @author group5
 * @since 2022-05-31
 */
public class CRSApplication {

	/**
	 * This is the main method which makes use of option select method.
	 * 
	 * @param args Unused.
	 * @return Nothing.
	 * 
	 */

	public static void main(String[] args) {

		System.out.println("********* Welocme to CRS Application *************\n");
		optionSelect();

	}

	/**
	 * This method is used display menu 
	 * @param unused
	 * @return nothing.
	 */
	public static void optionSelect() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Login :");
		System.out.println("2. New Registartion :");
		System.out.println("3. Forget Password :");
		System.out.println("4. Exit :");
		System.out.println("Pleace Select Your Choice :\n");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			login();
			break;

		case 2:
			registration();
			break;

		case 3:
			updatePassword();
			break;

		case 4:
			Exit();
			break;

		}
	}

	/**
	 * This method is used to display login page. 
	 * @param unused
	 * @return nothing.
	 */
	public static void login() {
		
		AdminServiceImpl adminApplication = new AdminServiceImpl();
		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
		ProfessorServiceImpl professorServiceImpl = new ProfessorServiceImpl();
		LoginRegDao loginRegDao = new LoginRegDao();
		
		System.out.println("--Login Page---\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName :");
		String userName = sc.next();
		System.out.println("Enter Password :");
		String password = sc.next();
		List<Login> loginList = loginRegDao.verifyLogin();
		for (Login login : loginList) {
			if (login.getUserName().equalsIgnoreCase(userName) && (password.equals(login.getPassword()))) {
				System.out.println("Login Successfull\n");
				if (login.getType().equalsIgnoreCase("Admin")) {
					adminApplication.loginList();
				} else if (login.getType().equalsIgnoreCase("student")) {
					studentServiceImpl.studentMenu();
				} else if (login.getType().equalsIgnoreCase("Professor")) {
					professorServiceImpl.professorMenu();
				}

			}
		}

	}

	public static void registration() {

		System.out.println(" Please enter you information ");
		LoginRegDao loginRegDao = new LoginRegDao();
		loginRegDao.registration();

		login();
	}

	/**
	 * This method allows user to update password.
	 * @param unused
	 * @return nothing.
	 */
	public static void updatePassword() {

		System.out.println(" Enter you Id ");
		Scanner sc = new Scanner(System.in);
		double id = sc.nextDouble();
		LoginRegDao loginRegDao = new LoginRegDao();
		loginRegDao.updatePassword(id);

	}
	
	/**
	 * This method is used to close application.
	 * @param unused
	 * @return nothing.
	 */
	private static void Exit() {
		System.out.println("Application Closed");

	}

}
