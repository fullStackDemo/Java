package com.demo;

public class Emp {

	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.province);
	}

	public static void main(String[] args) {
		Address address1 = new Address("广州", "广东");
		Address address2 = new Address("海口", "海南");

		Emp e1 = new Emp(11, "wang", address1);
		Emp e2 = new Emp(12, "zhang", address2);

		e1.display();
		e2.display();

	}
}
