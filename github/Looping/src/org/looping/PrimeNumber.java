package org.looping;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the num");
		int a = s.nextInt();
int i; int c=0;
		for( i=2; i<=a/2 ; i++)
		{
			if(a%i==0)
			{
			c=1;
			break;
			
		}
		}
		
		if(c==0)
		{
			System.out.println(" prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
	}



