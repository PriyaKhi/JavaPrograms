package com.programs.starandnumberpyramids;

public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
