import java.util.*;
class StringIsPalinidrome

{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a String ");

		String s1= sc.nextLine();
		String s2="";

		for(int i=s1.length()-1;i>=0;i--)
		{
			char res = s1.charAt(i);
			s2=s2+res;
		}
		if(s1.equals(s2))
		{
			System.out.println("String is palindrome");

		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}