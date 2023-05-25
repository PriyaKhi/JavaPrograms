package Practice;

public class LowerCaseToUppercase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "hello UNIVERSE";
		String s = " ";
		char b;

		for (int i = 0; i < a.length(); i++) {
			b = a.charAt(i);
			if (b >= 65 && b <= 90) {
				s += (char) (b + 32);
			} else if (b >= 97 && b <= 122) {
				s += (char) (b - 32);
			} else
				s += b;
		}

		System.out.println("New String : " + s);
	}

}
