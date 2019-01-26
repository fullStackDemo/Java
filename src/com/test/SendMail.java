package com.test;


public class SendMail {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "Hello";
		Object s3 = s1;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareTo((String) s3));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
	}

}
