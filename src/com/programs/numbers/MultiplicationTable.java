package com.programs.numbers;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which table you want : ");
		int a = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(a + "*" + i + "=" + a * i);

		}

	}

}
