package Practice;

public class DuplicateCharactersInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "PAAAAAAAAAAARRRRRRRRRRRRRRRRRRRRRRVIN";
		char b[] = a.toCharArray();
		int count;
		System.out.println("Duplicate Characters : ");

		for (int i = 0; i < b.length; i++) {
			count = 1;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j] && b[i] != ' ') {
					count++;
					b[j] = '0';
				}
			}
			if (count > 1 && b[i] != '0') {
				System.out.println(b[i]);
			}
		}

	}

}
