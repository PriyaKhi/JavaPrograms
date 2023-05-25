package com.programs.search;

public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = { "Rubiya", "Parveen", "Shaik" };

		String var = "ParVEEN";
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i].equalsIgnoreCase(var)) {
				System.out.println("String is found at index value :  " + i);
				temp = temp + 1;
			}

		}
		if (temp == 0) {
			System.out.println("String not found");
		}

	}

}
