package com.test;
import java.lang.Object;


public class Student implements Cloneable {
	int rollno;
	String name;

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			Student student1 = new Student(101, "amit");
			Student student2 = (Student) student1.clone();
			System.out.println(student1.rollno + " " + student1.name);
			System.out.println(student2.rollno + " " + student2.name);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
