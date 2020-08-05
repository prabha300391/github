package org.looping;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
	int t,rem=0;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number");
	int i = s.nextInt();
	t=i;
	while(t>0) 
	{
	rem=(rem*10)+t%10;
	t=t/10;
	
	}
	if(i==rem)
		System.out.println("palindrome");
	else
		System.out.println("not a palindrome");

}
}