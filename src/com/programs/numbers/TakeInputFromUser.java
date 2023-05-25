package com.programs.numbers;

import java.util.Scanner;

public class TakeInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter interger  value :");
		int a = sc.nextInt();

		System.out.println("Enter String value:");
		String s = sc.next();

		System.out.println("Enter character value : ");
		char a1 = sc.next().charAt(0);

		System.out.println("Enter long value : ");
		long b = sc.nextLong();

		System.out.println(a + s + a1 + b);

	}

}
