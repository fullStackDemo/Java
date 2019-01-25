package com.test;

public class Operation {

	int data = 60;

	void change(int data) {
		data = data + 100;
	}

	void change2(Operation operation) {
		operation.data += 100;
	}

	public static void main(String[] args) {
		
		Operation aOperation = new Operation();

		System.out.println(aOperation.data);

		aOperation.change(80);

		System.out.println(aOperation.data);

		aOperation.change2(aOperation);

		System.out.println(aOperation.data);

	}
}
