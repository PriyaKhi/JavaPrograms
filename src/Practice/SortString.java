package Practice;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "RUBIYA PARVEEN";
		char c[] = a.toCharArray();
		char temp;

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length() - 1; j++) {
				if (c[j] >= c[j + 1]) {
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted String : " + new String(c));

	}

}
