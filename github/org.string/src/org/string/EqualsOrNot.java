package org.string;

public class EqualsOrNot {
	public static void main(String[] args) {
		String a = "Java";
		String b = "Java";
		String c = "Java";
		String d = "java";
		String f = "Green Technology";
		String g = "GreenTechnology";
		String h = "Java";
		String i = "java";
		String j = "Nisha";
		String k = "nisha";
		boolean l = a.equals(b);
		boolean m = c.equals(d);
		boolean n = f.equals(g);
		boolean o = h.equalsIgnoreCase(i);
		boolean p = j.equalsIgnoreCase(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
	}

}
