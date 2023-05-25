package com.programs.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 44, 23, 12, 77, 39, 50, 8, 63, 77, 54, 29, 10, 75, 88, 99, 33, 22, 11 };
		int temp = 0;
		int n = 588;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;

		while (li <= hi) {
			if (a[mi] == n) {
				System.out.println("Element found at index position :  " + mi);
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
