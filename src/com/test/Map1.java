package com.test;

import java.util.*;
import java.util.Map.Entry;

public class Map1 {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("name", "999");
		m1.put("key", "88");
		System.out.println(m1);
		System.out.println(m1.containsKey("key"));
		System.out.println(m1.containsKey("key1"));
		System.out.println(m1.containsValue("88"));
		System.out.println(m1.hashCode());
		System.out.println(m1.keySet());

		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("key4", "value");
		m1.putAll(m2);
//		m1.clear();
		System.out.println(m1);
		System.out.println(m2.size());
		System.out.println(m1.values());
		System.out.println("-----");
		System.out.println(m1.entrySet());
		m2.clear();
		m2.remove("key");
		Set<Entry<String, String>> aLinkedList = m1.entrySet();
		System.out.println(aLinkedList);
		System.out.println(aLinkedList.equals(aLinkedList));
		System.out.println(m1.isEmpty());

	}
}
