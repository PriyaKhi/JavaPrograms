package com.programs.search;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 45, 12, 67, 89, 20 };

		int n = 367;
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				System.out.println("Element is found at : " + i);
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("Element not found");
		}

	}

}
