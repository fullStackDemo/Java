package com.test;

public class TestMin {

	static void main(int a[]) {

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5 };
		main(a);
	}
}
