package com.programs.search;

public class MaximumElementInaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 23, 45, 67, 89, 12 };
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);

	}

}
