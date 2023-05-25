package com.programs.strings;

public class SortAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "rubiya";
		char c[] = s.toCharArray();
		char temp;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length-1; j++) {
				if (c[j] > c[j + 1]) {
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		System.out.println(new String(c));

	}

}
