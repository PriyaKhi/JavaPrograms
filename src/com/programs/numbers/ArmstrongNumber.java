package com.programs.numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int t1 = num;
		int length = 0;

		while (t1 != 0) {

			length = length + 1;
			t1 = t1 / 10;
		}

		int t2 = num;
		int arm = 0;
		int rem;
		while (t2 != 0) {
			int mul = 1;
			rem = t2 % 10;
			for (int i = 1; i <= length; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;

		}
		if (num == arm) {
			System.out.println(num + " is a Armstrong number ");
		} else {
			System.out.println(num + " is not a Armstrong number ");
		}

	}

}
