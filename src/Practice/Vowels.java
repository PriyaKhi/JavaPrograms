package Practice;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello Universe";
		s=s.toUpperCase();
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				count++;
			}
		}
		System.out.println("Vowels are : " + count);

	}

}
