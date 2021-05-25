package com.capgemini;

public class Equals {

	public static void main(String[] args) {
		String s1=new String("Welcome");
		String s2=new String("Welcome");
		String s3=new String("Wel");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println("--------------------------------------------------------------------");
        
		String m1="Welcome";
		String m2="Welcome";
		String m3="Wel";
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(s2));
		System.out.println(m1==m2);
		System.out.println(m1==m3);
		
	}

}
