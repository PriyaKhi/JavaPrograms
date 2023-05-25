package com.programs.strings;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Malayalam";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}

		if (s.equalsIgnoreCase(rev)) {
			System.out.println(s + " is Pallindrome");
		} else {
			System.out.println(s + " is  not Pallindrome");
		}

	}

}
