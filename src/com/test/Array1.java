package com.test;

import java.util.*;

public class Array1 {
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		aList.add("66");
		aList.add("88");
		System.out.println(aList);
		System.out.println(aList.get(1));
		System.out.println(aList.indexOf("88"));
		System.out.println(aList.listIterator());
		System.out.println(aList.set(1, "6699"));
		System.out.println(aList);
		
		List<Integer> blistIntegers = new LinkedList<Integer>();
		
		blistIntegers.add(99);
		
		System.out.println(blistIntegers);
	}
}
