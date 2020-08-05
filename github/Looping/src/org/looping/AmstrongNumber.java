package org.looping;

import java.util.Scanner;

public class AmstrongNumber {
public static void main(String[] args) {
	int t , rem=0;
	int arm=0;
	Scanner s = new Scanner(System.in);
	int i =s.nextInt();
	t=i;
	while(t>0)
	{
		rem=t%10;
		arm =arm+(rem*rem*rem);
		t=t/10;
	}
	if(i==arm)
		System.out.println("armstrong number");
	else
		System.out.println("not an armstrong number");
}
}
