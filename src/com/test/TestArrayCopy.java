package com.test;

public class TestArrayCopy {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4 };
		System.out.println(a);
		int[] b = new int[3];
		System.arraycopy(a, 1, b, 0, 2);
		System.out.println(b);

		a[1] = 99;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("------");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
