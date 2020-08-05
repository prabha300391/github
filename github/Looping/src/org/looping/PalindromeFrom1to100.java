package org.looping;

public class PalindromeFrom1to100 {
	public static void main(String[] args) {
		int i , t , rem;
		for(i=11;i<=100;i++)
		{
			rem=0;
			t=i;
			while(t>0) 
			{
			rem=(rem*10)+t%10;
			t=t/10;
			
			}
		
		if(i==rem)
			System.out.println(i);
	}

}
}
