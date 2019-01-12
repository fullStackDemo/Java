package com.demo;


class Animals {
	String nameString = "john";

	void eat() {
		System.out.println(nameString + " eating");
	}
}

class Dog extends Animals {
	void eat() {		
		nameString = "888";
		System.out.println(nameString + " eating bond");
	}
}

class BabyDog extends Dog {
	void eat() {
		System.out.println(nameString + " eating milk");
	}
}

public class TestPolymorphs {

	public static void main(String[] args) {
		Animals a1, a2, a3;
		a1 = new Animals();
		a2 = new Dog();
		a3 = new BabyDog();
		a2.eat();
		a1.eat();
		a3.eat();
		System.out.println(a1 instanceof Animals);
		
	}
}
