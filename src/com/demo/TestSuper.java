package com.demo;

class Animal {
	String color = "black";

	void eating() {
		System.out.println("eating...");
	}
}

public class TestSuper extends Animal {
	String color = "white";

	void eating() {
		System.out.println("eating again....");
	}

	void display() {
		eating();
		super.eating();
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		TestSuper aSuper = new TestSuper();
		aSuper.display();
	}
	
	
}
