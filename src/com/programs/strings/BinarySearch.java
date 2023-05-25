package com.programs.strings;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 34, 2, 67, 898, 454, 222, 333, 777, 444, 111 };
		int temp;
		int n = 7777;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;

		while (li <= hi) {
			if (a[mi] == n) {
				System.out.println("Elment found at position : " + mi);
				break;
			} else if (a[mi] > n) {
				hi = mi - 1;
			} else {
				li = mi + 1;
			}
			mi = (li + hi) / 2;

		}
		if (li > hi) {
			System.out.println("Element not found");
		}

	}

}
