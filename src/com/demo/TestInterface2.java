package com.demo;

interface Printable2 {
	void print();
}

interface Drawable2 extends Printable2 {
	void show();
}

public class TestInterface2 implements Drawable2 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}

	public static void main(String[] args) {
		TestInterface2 testInterface2 = new TestInterface2();
		testInterface2.print();
		testInterface2.show();
	}

}
