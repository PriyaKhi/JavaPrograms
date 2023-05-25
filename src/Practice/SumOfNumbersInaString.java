package Practice;

public class SumOfNumbersInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Rub143iya786";
		char temp;
		int b, sum = 0;

		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			if (Character.isDigit(temp)) {
				b = Integer.parseInt((String.valueOf(temp)));
				sum = sum + b;
			}
		}

		System.out.println("Sum Value : " + sum);

	}

}
