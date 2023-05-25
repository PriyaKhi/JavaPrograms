package com.programs.strings;

import java.util.HashMap;
import java.util.Map;

public class HashMapMaxOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello Universe";
		s = s.replaceAll("\\s", "");
		System.out.println(s);

		char[] a = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();

		for (char ch : a) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}

		int max = 0;
		char c = ' ';

		for (Map.Entry<Character, Integer> me : hm.entrySet()) {
			if (max < me.getValue()) {
				max = me.getValue();
				c = me.getKey();
			}
		}
		System.out.println("Maximum Character are : " + max + " and the character is " + c);
	}

}
