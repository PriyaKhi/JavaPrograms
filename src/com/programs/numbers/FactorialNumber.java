package com.programs.numbers;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int fact = 1;

		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial Value : " + fact);

	}

}
