package com.program.arrays;

public class RemoveDuplicateElementInaSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 2, 3, 3, 4, 5, 5, 5, 6, 7, 8 };
		int b[] = new int[a.length];

		int j = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[j] = a[i];
				j++;
			}
		}
		b[j] = a[a.length - 1];

		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0) {
				System.out.print(" " + b[i]);
			}
		}

	}

}
