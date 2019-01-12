package com.demo;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入分数");
		
		String[] demoStrings = {"5", "4"};
		int score = input.nextInt();
		int count = 0;
		
		while(score < 60) {
			score++;
			count++;
		}
		
		System.out.println("score=" + score);
		System.out.println("count=" + count);
		System.out.println(demoStrings);
		
		for (int i = 0; i < demoStrings.length; i++) {
			System.out.println(demoStrings[i]);
		}
		
		
		
	}
	

}


