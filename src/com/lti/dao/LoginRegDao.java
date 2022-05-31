package com.lti.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.bean.Login;

public class LoginRegDao implements LoginRegDaoInterface {

	@Override
	public List<Login> verifyLogin() {
		
		List<Login> loginList=new ArrayList<Login>();
		Login  login=new Login();
		
		login.setId(101);
		login.setType("Admin");
		login.setUserName("Admin");
		login.setPassword("admin");
		loginList.add(login);
		
		Login  login1=new Login();
		login1.setId(102);
		login1.setType("Student");
		login1.setUserName("STU1234");
		login1.setPassword("student");
		loginList.add(login1);
		
		Login  login2=new Login();
		login2.setId(103);
		login2.setType("Professor");
		login2.setUserName("PR234");
		login2.setPassword("professor");
		loginList.add(login2);
		
		return loginList;
	}

	@Override
	public void registration() {
		
		List<Login> loginList=new ArrayList<Login>();
		Login  login=new Login();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Id ");
		double id=sc.nextDouble();
		login.setId(id);
		
		System.out.println(" Enter type ");
		String type=sc.next();
		login.setType(type);
		
		System.out.println(" Enter UserName ");
		String userName=sc.next();
		login.setUserName(userName);
		
		System.out.println(" Enter password ");
		String password=sc.next();
		login.setPassword(password);
		
		System.out.println(" Registration Sucessfull !! ");
		loginList.add(login);
		
	}

	@Override
	public void updatePassword(double id) {
	
			
	List<Login> loginList=new ArrayList<Login>();
	Scanner sc=new Scanner(System.in);
	for(Login login:loginList) {
		if(login.getId()==id)
		{
			System.out.println(" Enter new Password ");
			String password=sc.nextLine();
			login.setPassword(password);
			System.out.println(" Password Update ");
		}
		else {
			System.out.println(" Id doesn't match ");
			
		}
	}
		
	}
	
	

}
