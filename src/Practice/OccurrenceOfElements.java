package Practice;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello Rubiya";
		s = s.replaceAll("\\s", "");
		System.out.println(s);

		char a[] = s.toCharArray();

		HashMap<Character, Integer> hm = new HashMap();

		for (Character ch : a) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> me : hm.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
		}

	}

}
