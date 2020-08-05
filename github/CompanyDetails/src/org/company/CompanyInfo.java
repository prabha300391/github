package org.company;

public class CompanyInfo {
public void companyName() {
System.out.println("abc company");
}
public void companyName(String a) {
	System.out.println(a);
}
public static void main(String[] args) {
	CompanyInfo a = new CompanyInfo();
	a.companyName("mnc company");
}
}