package Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapMinOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hellooo Hii";
		s = s.replaceAll("\\s", "");
		char a[] = s.toCharArray();

		HashMap<Character, Integer> hm = new HashMap();

		for (Character ch : a) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}

		int min = s.length();
		char c = ' ';

		for (Map.Entry<Character, Integer> me : hm.entrySet()) {
			if (min > me.getValue()) {
				min = me.getValue();
				c = me.getKey();
			}
		}
		System.out.println(c + "  " + min);

	}

}
