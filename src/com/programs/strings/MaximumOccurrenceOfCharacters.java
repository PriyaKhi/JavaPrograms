package com.programs.strings;

public class MaximumOccurrenceOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "HEY HI";

		int[] arr = new int[256];

		for (int i = 0; i <= s.length() - 1; i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
		}

		int max = 0;
		char c = ' ';

		for (int i = 0; i <= s.length() - 1; i++) {
			if (max < arr[s.charAt(i)]) {
				max = arr[s.charAt(i)];
				c = s.charAt(i);

			}
		}

		System.out.println("Maximum  occured character is : " + c + " : with " + max + " number of times");

	}

}
