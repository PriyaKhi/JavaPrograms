package Practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		int count = 1;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 1) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}

	}

}
