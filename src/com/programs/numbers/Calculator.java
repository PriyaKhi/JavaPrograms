package com.programs.numbers;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res;
		String yn;
		do {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number : ");
		int a = sc.nextInt();

		System.out.println("Enter second number : ");
		int b = sc.nextInt();

		System.out.println("Enter operation to be performed :");
		String sym = sc.next();

		switch (sym) {
		case "+":
			res = a + b;
			System.out.println(res);
			break;
		case "-":
			res = a - b;
			System.out.println(res);
			break;
		case "*":
			res = a * b;
			System.out.println(res);
			break;
		case "/":
			res = a / b;
			System.out.println(res);
			break;
		case "%":
			res = a % b;
			System.out.println(res);
			break;

		default:
			System.out.println("Enter proper symbol");
			break;

		}
		System.out.println("Do you want to continue: Y or N");
		yn=sc.next();
		}while(yn.equals("y")||yn.equals("Y"));

	}

}
