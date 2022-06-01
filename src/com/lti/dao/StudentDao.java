package com.lti.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.lti.exception.CourseNotFoundException;
import com.lti.exception.PaymentDeclineException;
import com.lti.service.impl.StudentServiceImpl;

public class StudentDao implements StudentDaoInterface {

	@Override
	public void registerCourse(String inp) {
		if (inp.equals("Java")) {
			System.out.println("Successfully Registered for Java Course\n");
		} else if (inp.equals("Python")) {
			System.out.println("Successfully Registered for Python Course\n");
		} else if (inp.equals("Big Data")) {
			System.out.println("Successfully Registered for Big data Course\n");
		} else if (inp.equals("Cloud")) {
			System.out.println("Successfully Registered for Cloud Course\n");
		} else {
			try {
				throw new CourseNotFoundException("InValid Option Chosen. Choose the valid option.\n");
			} catch (CourseNotFoundException e) {
				System.out.println(e);
			}
		}
		StudentServiceImpl st = new StudentServiceImpl();
		st.studentMenu();
	}

	@Override
	public ArrayList viewreportcard(int i) {
		ArrayList<String> datalist = new ArrayList<String>();
		if (i == 1) {
			System.out.println("Report Card Generated fro ID :" + i);
			datalist.add("Java - A");
			datalist.add("Python - B");
			datalist.add("Big data - A+");
			datalist.add("Cloud - A");
		}
		if (i == 2) {
			System.out.println("Report Card Generated fro ID :" + i);
			datalist.add("Java - B");
			datalist.add("Python - A");
			datalist.add("Big data - A+");
			datalist.add("Cloud - C");
		}
		if (i == 3) {
			System.out.println("Report Card Generated fro ID :" + i);
			datalist.add("Java - A+");
			datalist.add("Python - B");
			datalist.add("Big data - A+");
			datalist.add("Cloud - B");
		}
		if (i == 4) {
			System.out.println("Report Card Generated fro ID :" + i);
			datalist.add("Java - C");
			datalist.add("Python - A+");
			datalist.add("Big data - B");
			datalist.add("Cloud - B");
		}

		return datalist;

	}

	@Override
	public ArrayList viewCatalog() {

		Stream<String> stream = Stream.of("Java", "Python", "Big Data", "Cloud");

		List<String> list = stream.collect(Collectors.toList());

		ArrayList<String> arrayList = new ArrayList<String>(list);

		return arrayList;

	}

	@Override
	public void payFee(int i) {
		// TODO Auto-generated method stub
		System.out.println("inside DAO fee");
		if (i == 1) {
			System.out.println("Fee which has been payed: Rs.0");
			System.out.println("Total Fee to be payed : Rs.1,00,000");

		}

		else if (i == 2)

		{

			System.out.println("Fee which has been payed: Rs.80,000");
			System.out.println("Total Fee to be payed : Rs.20,000");
		} else if (i == 3)

		{

			System.out.println("Fee which has been payed: Rs.65,000");
			System.out.println("Total Fee to be payed : Rs.35,000");
		}

		System.out.println("Press One to pay the Fee");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		if (input == 1) {

			System.out.println("Select the payment methods:\n1.Credit/Debit Card\n2.UPI\n3.Bank Transfer");
			int paymentMethod = sc.nextInt();
			if (paymentMethod == 1) {
				System.out.println("Enter Card Details");
				System.out.println("Enter Card Number: ");
				String cardDetails = sc.next();
				if (cardDetails.length() < 12) {
					System.out.println("Please Enter the valid card number ");

				}
				String cn1 = sc.next();
				System.out.println("Enter the expiry in mmyy format: ");
				int cm = sc.nextInt();
				System.out.println("Enter CVV: ");
				int cv = sc.nextInt();

			}
			if (paymentMethod == 2) {
				System.out.println("Enter UPI ID");
				String upi = sc.next();
			}

			if (paymentMethod == 3) {
				System.out.println("Enter the bank account details:");
				int b = sc.nextInt();
				
			}

			else if (paymentMethod < 1 || paymentMethod > 3) {
				try {
					throw new PaymentDeclineException("Please choose a right payment method");

				} catch (PaymentDeclineException e) {
					System.out.println(e);
				}
			}
			viewFee();
		}

	}

	@Override
	public void viewFee() {
		// TODO Auto-generated method stub
		System.out.println("Fee Paied Succesfully!!");

	}
	@Override
	public void StudentDetails() {
		// TODO Auto-generated method stub
		HashMap<Integer, String> studentDetails = new HashMap<Integer, String>();
		System.out.println("--StudentId--"+"--StudentName--");
		studentDetails.put(1, "Ram");
		studentDetails.put(2, "Sita");
		studentDetails.put(3, "Laxman");
		studentDetails.put(4, "Krishna");
		studentDetails.put(5, "Bheema\n");
		
		for (Map.Entry sDetails : studentDetails.entrySet()) {
			System.out.println(sDetails.getKey() + "-" + sDetails.getValue());
		}
	}

	@Override
	public ArrayList course() {

		ArrayList<String> courselist = new ArrayList<String>(Arrays.asList("Java", "Python", "Big Data", "Cloud"));
		ArrayList courses = new ArrayList();
		viewCatalog();

		System.out.println("If you want to add course, press 1");

		System.out.println("If you want to  delete course, press 2");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		while (choice == 1) {
			System.out.println("1. Enter 1 to add Java");
			System.out.println("2. Enter 2 to add Python");
			System.out.println("3. Enter 3 to add Big Data");
			System.out.println("4. Enter 4 to add Cloud");
			System.out.println("5. Enter 5 to see the list of Courses added");
			System.out.println("6. Enter 6 to View StudentMenu");

			int course = sc.nextInt();
			int i = 0;

			switch (course) {
			case 1:
				courses.add("Java");
				System.out.println("Java added successfully ");

				break;
			case 2:
				courses.add("Python");
				System.out.println("Python added successfully ");

				break;
			case 3:
				courses.add("Big Data");
				System.out.println("Big Data added successfully ");

				break;
			case 4:
				courses.add("Cloud");
				System.out.println("Cloud added successfully ");

				break;

			case 5:
				// c.forEach(a -> System.out.println(a));
				courses.forEach(System.out::println);
				break;
			case 6:
				i = 1;
				break;
			}

			if (i == 1) {
				break;
			}

		}
		// System.out.println("1.Register a Course\n2.View GradeCard\n3.View
		// Catalog\n4.Add/Delete Course \n5.Pay Fee");

		while (choice == 2) {

			int i = 0;
			System.out.println("If you want to remove Java course, press 1");
			System.out.println("If you want to remove Python course, press 2");
			System.out.println("If you want to remove Big Data course, press 3");
			System.out.println("If you want to remove Cloud course, press 4");
			System.out.println("If you want to see the current courses, press 5");
			System.out.println("If you want to exit, press 6");

			int course = sc.nextInt();

			switch (course) {
			case 1:
				courses.remove("Java");
				System.out.println("Java Removed successfully ");

				break;
			case 2:
				courses.remove("Python");
				System.out.println("Python Removed successfully ");

				break;
			case 3:
				courses.remove("Big Data");
				System.out.println("Big Data Removed successfully ");

				break;
			case 4:
				courses.remove("Cloud");
				System.out.println("Cloud Removed successfully ");

				break;

			case 5:
				// System.out.println(c);
				courses.forEach(b -> System.out.println(b));
				break;
			case 6:
				i = 1;
				break;

			}
			if (i == 1) {
				break;
			}

		}

		// System.out.println("1.Register a Course\n2.View GradeCard\n3.View
		// Catalog\n4.Add/Delete Course \n5.Pay Fee");

		return courses;

	}

}
