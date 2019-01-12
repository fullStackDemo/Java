package com.demo;

public class Bike {

	int id;
	String name;
	static String number = "99";
	float price;

	Bike(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Bike() {
	}

	static void changeName() {
		number = "fenghuang";
	}

	Bike(Bike b) {
		id = b.id;
		name = b.name;
	}

	Bike(int id, String name, float price) {
		this(id, name);
		this.price = price;
	}

	Bike(Bike b, float price) {
		this(b);
		this.price = price;
	}

	void display() {
		System.out.println(id + " " + name + " " + number + " " + price);
	}

	static {
		System.out.println("static block is invoked");
	}

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Bike b2 = new Bike(1, "88", 900);
		Bike b3 = new Bike(b2, 600);
		b1.id = 88;
		b1.name = "bb";
		b3.name = "99".substring(1);
		Bike.changeName();
		b1.display();
		b2.display();
		b3.display();
	}
}
