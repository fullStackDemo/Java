package com.demo;

public class array {

	public static void main(String[] args) {
		String[] arr1 = new String[4];
		arr1[3] = "9";
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		String arrString = arr1.toString();
		System.out.println( arrString);
	}
}
