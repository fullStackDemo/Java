package com.demo;

interface aa {
	void showA();
}

interface bb {
	void showB();
}

class C implements aa, bb {
	public void showA() {
		System.out.println("a");
	}

	public void showB() {
		System.out.println("b");
	}
}

public class MultiInterface {
	public static void main(String[] args) {
		C c = new C();
		c.showA();
		c.showB();
	}

}
