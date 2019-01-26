package com.test;

import java.util.*;

public class Array2 {

	public static void main(String[] args) {
		ArrayList<Object> a2 = new ArrayList<Object>(5);
//		a2.add("55");
//		a2.add("999e");
//		System.out.println(a2);

//		Iterator<String> aIterator = a2.iterator();
//		System.out.println(aIterator);
//		while (aIterator.hasNext()) {
//			String nameString = aIterator.next();
//			
//			System.out.println(nameString);
//
//		}
		Map<String, String> m = new HashMap<String, String>();
		m.put("name", "999");
		a2.add(m);
		System.out.println(a2);
		System.out.println(a2.isEmpty());
		System.out.println(a2.size());
		

		ListIterator<Object> list = a2.listIterator();
		System.out.println(list.hasNext());

		while (list.hasNext()) {
			Object b1 = list.next();
			System.out.println(b1.hashCode());
			System.out.println(b1.toString());
			list.set(b1);
		}

		System.out.println(a2);
	

		

	}
}
