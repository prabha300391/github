package org.looping;

public class AmstrongNumberFrom1to1000 {
public static void main(String[] args) {
	int i,t,arm,rem;
	for(i=1;i<1000;i++)
		{
		t=i;
		rem=0;
		arm=0;
		while(t>0)
		{
			rem=t%10;
			arm =arm+(rem*rem*rem);
			t=t/10;
		}
		
	if(i==arm)
		System.out.println(i);
}
}
}
