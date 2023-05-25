package Practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int f1 = 0;
		int f2 = 1;
		int f3;
		System.out.print(f1 + " " + f2);

		for (int i = 2; i <n; i++) {
			f3 = f1 + f2;
			System.out.print(" " + f3);
			f1=f2;
			f2=f3;
		}

	}

}
