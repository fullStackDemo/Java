package com.test;

class A{
	@SuppressWarnings("unused")
	private int data = 80;
	@SuppressWarnings("unused")
	private void msg() {
		System.out.println("hello java");
	}
}

public class TestPrivate {
	public static void main(String[] args) {
		A a = new A();
	}
}
