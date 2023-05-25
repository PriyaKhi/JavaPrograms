package Practice;

import java.util.Scanner;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int count = 0;

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			} else {
				count = 0;
			}
		}

	}

}
