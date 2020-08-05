package org.looping;

import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the num :");
		int a = s.nextInt();
		int b =1;
		for(int i=1; i<=a;i++)
		{ 
			b=b*i;
		}
		System.out.println(b);
	}
	

}
