package org.employee;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String empName = sc.nextLine();
		int empId = sc.nextInt();
		long empPhone = sc.nextLong();
		int empSalary = sc.nextInt();
		char empGender = sc.next().charAt(0);
		String empCity = sc.next();
		System.out.println("Employee Name :" + empName);
		System.out.println("Employee Id :" + empId);
		System.out.println("Employee Phone :" + empPhone);
		System.out.println("Employee Salary :" + empSalary);
		System.out.println("Employee Gender :" + empGender);
		System.out.println("Employee City :" + empCity);
	}	
}