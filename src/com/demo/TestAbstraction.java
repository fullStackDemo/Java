package com.demo;

abstract class Car {
	public Car() {
		System.out.println("Car is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear change");
	}
}

class Honda extends Car {
	void run() {
		System.out.println("running safely");
	}
}

public class TestAbstraction {
	public static void main(String[] args) {
		Car c;
		c = new Honda();
		c.run();
		c.changeGear();
	}
}
