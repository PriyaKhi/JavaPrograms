package com.programs.strings;

import java.util.HashMap;
import java.util.Map;

public class HashMapMinOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World How are you";
		char[] a = s.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<>();

		for (char c : a) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		int min = a.length;
		char c = ' ';
		for (Map.Entry<Character, Integer> me : hm.entrySet()) {
			if (min > me.getValue()) {
				min = me.getValue();
				c = me.getKey();
			}
		}

		System.out.println("Min occurence of element is : " + c + " occurrs " + min + " "
				+ "times");

	}

}
