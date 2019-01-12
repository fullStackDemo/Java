package com.demo;

class Employee {
	float salary = 8000;
}

public class Programmer extends Employee {
	int bonus = 6000;

	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println(p.bonus);
		System.out.println(p.salary);
		System.out.println(p.bonus + p.salary);
	}

}
