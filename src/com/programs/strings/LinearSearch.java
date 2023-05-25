package com.programs.strings;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 67, 44, 12, 99, 67, 555, 9898 };
		int n = 99;
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				System.out.println("Element found at position: " + i);
				temp++;
			}
		}
		if (temp == 0) {
			System.out.println("Element not found");
		}

	}

}
