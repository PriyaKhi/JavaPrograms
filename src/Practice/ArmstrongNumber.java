package Practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();

		int t1 = n;
		int length = 0;
		while (t1 != 0) {
			length = length + 1;
			t1 = t1 / 10;

		}
		int t2 = n;
		int arm = 0, rem, mul;
		while (t2 != 0) {
			mul = 1;
			rem = t2 % 10;
			for (int i = 1; i <= length; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;
		}

		if (arm == n) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

	}

}
