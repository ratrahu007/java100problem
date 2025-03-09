import java.util.*;

class CheckNumispnorzero
{

	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int a=sc.nextInt();

		if(a>0)
		{
			System.out.println(a+"    Number is positive");
		}
		else if(a<0)
		{
			System.out.println(a+ "  Numer is negative");
		}
		else
		{
			System.out.println(a+ "  Number is 0");
		}
	}
}