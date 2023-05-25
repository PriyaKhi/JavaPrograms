package com.programs.strings;

public class LoweToUppercaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String r = "RuBIya PaRVEen";
		String s="";
		char ch;

		for (int i = 0; i < r.length(); i++) {
			ch = r.charAt(i);
			if (ch >= 65 && ch <= 90) {
				s+= (char) (ch + 32);
			} else if (ch >= 97 && ch <= 122) {
				s+= (char) (ch - 32);
			} else
			 	s+= ch;
		}

		System.out.println(s);
	}

}
