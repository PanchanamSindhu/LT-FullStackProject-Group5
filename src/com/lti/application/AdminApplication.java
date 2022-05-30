/**
 * 
 */
package com.lti.application;

import java.util.Scanner;

import com.lti.bean.Admin;
import com.lti.service.AdminService;
import com.lti.service.impl.AdminServiceImpl;

/**
 * @author user211
 *
 */
public class AdminApplication {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Welocme to CRS Application \n");

		System.out.println("1. New Registartion :");
		System.out.println("2. Login :");
		System.out.println("3. Update Password :");
		System.out.println("4. Exit :\n");

		System.out.println("Pleace Select Your Choice :\n");

		int input = sc.nextInt();
		menu(input);

	}

	public static void menu(int input) {
		Admin admin = new Admin();

		AdminServiceImpl adminService = new AdminServiceImpl();

		Scanner sc = new Scanner(System.in);
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

}
