package com.programs.strings;

public class DuplicateCharactersInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "HELLLOOOOO UNIVERSSSEEE HAAPPPPPPYYYYYY";
		char a[] = s.toCharArray();
		int count;
		System.out.println("Duplicate Characters are :");

		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && a[i] != ' ') {
					count = count + 1;
					a[j] = '0';
				}
			}
			if (count > 1 && a[i] != '0') {
				System.out.println(a[i]);
			}
		}

	}

}
