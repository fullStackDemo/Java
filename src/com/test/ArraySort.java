package com.test;

import java.util.Arrays;

public class ArraySort {

	private static void printArray(String msg, int[] array) {
		System.out.println(msg + ": [length = " + array.length + "]");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("****" + (n - i));
			for (int j = 1; j < n - i; j++) {
				System.out.println(j);
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	private static int[] insertElement(int[] original, int element, int index) {
		int len = original.length;
		int[] copys = new int[len + 1];
		System.arraycopy(original, 0, copys, 0, index);
		copys[index] = element;
		System.arraycopy(original, index, copys, index + 1, len - index);
		return copys;
	}

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 6, -9, -4 };
//		Arrays.sort(array);
		bubbleSort(array);
		array = insertElement(array, 80, 6);
		System.out.println(array);
		printArray("Sorted array", array);
		int index = Arrays.binarySearch(array, 6);
		System.out.println(index);
	}
}
