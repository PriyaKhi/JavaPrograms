package com.programs.search;

public class MinimumElementInaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 67, 909, 55, 356, 777, 2345 };

		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Minimum element in Array is :" + min);

	}

}
