package org.phone;

public class Phone {
public void phoneInfo() {
System.out.println("Samsung Galaxy S10");
}
public void phoneInfo(String a) { 
	System.out.println(a);
}
public static void main(String[] args) {
	Phone a = new Phone();
	a.phoneInfo();
}
}
