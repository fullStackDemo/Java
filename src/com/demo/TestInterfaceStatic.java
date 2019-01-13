package com.demo;

interface Drawable3{
	void draw();
	
	static int cude(int x) {
		return x * x * x;
	}
}

class Rectang implements Drawable3{
	public void draw() {
		System.out.println("draw");
	}
}

public class TestInterfaceStatic {
	public static void main(String[] args) {
		Rectang rectang = new Rectang();
		rectang.draw();
		System.out.println(Drawable3.cude(5));
	}
}
