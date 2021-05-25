package com.capgemini;

public class StringIndex {

	public static void main(String[] args) {
		String s="My name is Likhith and I am from bangalore";
		System.out.println(s.indexOf("L"));
		System.out.println(s.lastIndexOf("r"));
		System.out.println(s.indexOf("L",9));
		System.out.println(s.contains("L"));
		System.out.println(s.contains("c"));
		System.out.println(s.isEmpty());
		String s2="";
		System.out.println(s2.isEmpty());

	}

}
