import java.util.*;

class StringUpperAndLower
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String Bro");
		String s1=sc.nextLine();

		String Upper= s1.toUpperCase();
		String Lower=s1.toLowerCase();

		System.out.println("The given String is  "+    s1+ "  and it's Upper is   "+Upper+ "   and its Lower is    "+ Lower);
	}
}