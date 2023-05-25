package Practice;

public class CountWordsInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Hello Universe Grateful to you";
		char b[] = a.toCharArray();
		int count = 1;

		for (int i = 0; i < b.length; i++) {
			if (b[i] == ' ' && b[i + 1] != ' ') {
				count++;
			}
		}

		System.out.println("Number of Words in a String : " + count);

	}

}
