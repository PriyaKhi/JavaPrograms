package com.programs.numbers;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int count = 0;

		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				count = count + 1;
			}
		}

		if (count > 0) {
			System.out.println(n + " is not a Prime Number.");
		} else {
			System.out.println(n + " is  a Prime Number.");
		}

	}

}
