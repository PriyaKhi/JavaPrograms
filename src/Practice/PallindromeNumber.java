package Practice;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		int rem = 0, rev = 0;
		int num2 = num;

		while (num != 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		if (rev == num2) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}

	}

}
