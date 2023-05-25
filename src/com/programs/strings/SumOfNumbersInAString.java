package com.programs.strings;

public class SumOfNumbersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		String s = "3jklmn489pjro6351ops";
		for(int i=0; i<s.length(); i++) {
		    char temp = s.charAt(i);
		    if (Character.isDigit(temp)) {
		        int b = Integer.parseInt(String.valueOf(temp));
		        sum=sum+b;
		    }
		}
		System.out.println(sum);

	}

}
