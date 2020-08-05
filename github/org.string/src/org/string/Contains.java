package org.string;



public class Contains {
public static void main(String[] args) {
 String a = "velmurugank451@gmail.com";
 String b = "5-35-2a,venkatesh nivas,Aruppukottai";
 String c =  "Nishakerala24@gmail.com";
 String d = "89034256972365";
 if(a.contains("@"))
 {
	 System.out.println("valid mail id");
 }
 else
	 System.out.println("invalid mail id");
	
	
	if(b.contains("pincode"))
	{ 
		System.out.println("Valid address");
	}
	else
		System.out.println("invalid address");
	boolean e = c.contains("@");
	System.out.println(e);

}
}
