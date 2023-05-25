package com.programs.strings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Open Text";
		s = s.replaceAll("\\s", "");
		char[] a = s.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<>();

		for (char c : a) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
