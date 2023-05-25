package Practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharactersInaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";

		Set<Character> s1 = new HashSet();

		for (int i = 0; i < s.length(); i++) {
			s1.add(s.charAt(i));
		}

		for (Character c : s1) {
			System.out.print(c);
		}

	}

}
