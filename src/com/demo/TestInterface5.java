package com.demo;

interface TestA {
	void a();

	void b();

	void c();

	void d();
}

abstract class TestB implements TestA {
	public void c() {
		System.out.println("I am C");
	}
}

class TestM extends TestB {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
}

public class TestInterface5 {
	public static void main(String[] args) {
		TestM m = new TestM();
		m.a();
		m.b();
		m.c();
		m.d();
	}
}
