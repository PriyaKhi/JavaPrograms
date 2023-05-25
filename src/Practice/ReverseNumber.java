package Practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		int rev = 0, rem = 0;

		while (num != 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		System.out.println("Reverse of the number is : " + rev);

	}

}
