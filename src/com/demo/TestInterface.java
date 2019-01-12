package com.demo;

interface printables {
	void print();
}

class A6 implements printables {
	public void print() {
		System.out.println("hello interface");
	}

}

public class TestInterface {
	public static void main(String[] args) {
		A6 a6 = new A6();
		a6.print();
	}
}
