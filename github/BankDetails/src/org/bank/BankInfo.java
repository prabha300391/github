package org.bank;

public class BankInfo extends AxisBank{
public void saving() {
System.out.println("5000");
}
public void fixed() {
System.out.println("3000");
}
public void deposit() {
System.out.println("2000");
}
public static void main(String[] args) {
	BankInfo a = new BankInfo();
	AxisBank b = new AxisBank();
	a.fixed();
	a.saving();
	a.deposit();
	b.deposit();

	
	

}
}
