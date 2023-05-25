package com.programs.numbers;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year :");

		int a = sc.nextInt();

		if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
			System.out.println("a is leap year");
		} else {
			System.out.println("a is not leap year");
		}

	}

}
