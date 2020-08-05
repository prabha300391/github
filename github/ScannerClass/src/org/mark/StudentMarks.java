package org.mark;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);
		String a = aa.nextLine();
		int b = aa.nextInt();
		int c = aa.nextInt();
		int d = aa.nextInt();
		int e = aa.nextInt();
		int f = aa.nextInt();
		int g = aa.nextInt();
		int h = c + d + e + f + g ;
		float i = h/5;
		System.out.println("Student Name :" + a);
		System.out.println("Student Id :" + b);
		System.out.println("Mark 1 :" + c);
		System.out.println("Mark 2 :" + d);
		System.out.println("Mark 3 :" + e);
		System.out.println("Mark 4 :" + f);
		System.out.println("Mark 5 :" + g);
		System.out.println("Total :" + h);
		System.out.println("Average :" + i);
		
		
	}

}
