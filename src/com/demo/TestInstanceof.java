package com.demo;

class Printable {
}

class A extends Printable {
	void a() {
		System.err.println("a method");
	}
}

class D extends Printable {
	void d() {
		System.out.println("d method");
	}
}

class Call {
	void invoke(Printable p) {
		if (p instanceof A) {
			A a = (A) p;
			a.a();
		}
		if (p instanceof D) {
			D d = (D) p;
			d.d();
		}
	}
}

public class TestInstanceof {
	public static void main(String[] args) {
		Printable p = new A();
		Call c = new Call();
		c.invoke(p);

	}
}
