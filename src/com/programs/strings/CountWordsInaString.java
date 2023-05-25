package com.programs.strings;

public class CountWordsInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Shaik Rubiya Parveen";
		char c[] = s.toCharArray();
		int count = 1;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ' && c[i + 1] != ' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
