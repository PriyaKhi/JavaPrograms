package com.programs.strings;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Rubiya";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println("Reverse of String : " + rev);

	}

}
