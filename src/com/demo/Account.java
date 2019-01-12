package com.demo;

public class Account {

	int acc_no;
	String name;
	float amount;

	void insert(int a, String n, float m) {
		acc_no = a;
		name = n;
		amount = m;
	}

	void deposit(float amt) {
		amount += amt;
		System.out.println(amt + " deposit");
	}

	void withdraw(float amt) {
		if (amt <= amount) {
			amount -= amt;
			System.out.println(amt + " withdraw");
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	void checkBalance() {
		System.out.println("Balance is " + amount);
	}

	void display() {
		System.out.println(acc_no + " " + name + " " + amount);
	}
	

}
