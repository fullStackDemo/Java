package com.demo;

import com.demo.Account;

public class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.insert(888, "wz", 9000);
		a1.display();
		a1.deposit(8000);
		a1.checkBalance();
		a1.withdraw(100000);
		a1.checkBalance();
	}
}
