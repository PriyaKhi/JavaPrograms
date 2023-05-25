package com.programs.numbers;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
		int b = 40;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a values is : " + a + " b value is : " + b);

		int p = 25, q = 12;
		int r;

		r = p;
		p = q;
		q = r;

		System.out.println("p values is : " + p + " q value is : " + q);
	}

}
