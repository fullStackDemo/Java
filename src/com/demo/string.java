package com.demo;

class Student {
	int id;
	String name;

	void insertRecord(int i, String n) {
		id = i;
		name = n;
	}

	void displayInfo() {
		System.out.println(id + " " + name);
	}
}

class Caluation {
	void fact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f* i;
		}
		System.out.println(f);
	}
}

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
//		student.id = 1;
//		student.name = "88";
//		System.out.println(student.id);
//		System.out.println(student.name);
		student1.insertRecord(1, "88");
		student2.insertRecord(2, "98");
		student1.displayInfo();
		student2.displayInfo();
		new Caluation().fact(5);;
	}

}
