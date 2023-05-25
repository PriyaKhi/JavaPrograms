package com.program.arrays;

import java.util.HashSet;

public class RemoveDuplicateElementInaUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 4, 5, 1, 2, 7, 3, 2, 7, 1, 2 };
		HashSet<Integer> hs = new HashSet();

		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}

		for (Integer i : hs) {
			System.out.print(" " +i);
		}

	}

}
