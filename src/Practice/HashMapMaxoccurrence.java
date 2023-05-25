package Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapMaxoccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Thank yoou so much";
		s = s.replaceAll("\\s", "");
		char a[] = s.toCharArray();

		HashMap<Character, Integer> hm = new HashMap();

		for (Character c : a) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		int max = 0;
		char ch = ' ';

		for (Map.Entry<Character, Integer> me : hm.entrySet()) {
			if (max < me.getValue()) {
				max = me.getValue();
				ch = me.getKey();

			}
		}
		System.out.println(ch + "  " + max);

	}

}
