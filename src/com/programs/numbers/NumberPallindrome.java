package com.programs.numbers;

import java.util.Scanner;

public class NumberPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int num1 = num;
		int rev = 0, rem;
		while (num != 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		if (num1 == rev) {
			System.out.println(num1 + " is  Pallindrome");
		} else {
			System.out.println(num1 + " is not  Pallindrome");
		}

	}

}
