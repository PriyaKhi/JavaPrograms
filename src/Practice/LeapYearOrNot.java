package Practice;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  year :");
		int n = sc.nextInt();

		if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a Leap year");
		}

	}

}
