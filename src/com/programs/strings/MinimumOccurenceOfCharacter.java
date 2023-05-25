package com.programs.strings;

public class MinimumOccurenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AAbbaag";

		int[] a = new int[256];

		for (int i = 0; i <= s.length() - 1; i++) {
			a[s.charAt(i)] = a[s.charAt(i)] + 1;
		}

		int min = s.length() + 1;
		char c = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (min > a[s.charAt(i)]) {
				min = a[s.charAt(i)];
				c = s.charAt(i);
			}

		}

		System.out.println("Minimum occured character is " + c + " : with " + min + " number of times ");

	}

}
