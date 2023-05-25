package Practice;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "MADAM";
		String b = a;
		String rev = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}

		System.out.println("New String : " + rev);
		if (rev.equals(b)) {
			System.out.println("String " + rev + " is a Pallindrome");
		} else {
			System.out.println("String " + rev + " is not a Pallindrome");
		}
	}

}
