package com.demo;

class B {
	A4 obj;

	B(A4 obj) {
		this.obj = obj;
		System.out.println(obj);
	}

	void display() {
		System.out.println(obj.data);
	}

}

public class A4 {
	int data = 99;

	A4() {
		B b = new B(this);
		b.display();
		System.out.println(this);
	}

	A4 getA() {
		return this;
	}

	public static void main(String[] args) {
		A4 a4 = new A4();
		a4.getA();
		System.out.println(a4 == a4.getA());
	}
}
