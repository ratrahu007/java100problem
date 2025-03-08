import java.util.*;

class LargestAmong3

{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a first number");
		int a = sc.nextInt();

		System.out.println("Enter a Second number");
		int b = sc.nextInt();
		
		System.out.println("Enter a Third  number");
		int c = sc.nextInt();

		if(a>b && a>c)
		{
			System.out.println( a+"  A is large among them");
		}
		else if(b>a && b>c)
		{
			System.out.println( b + " B is larger than all");
		}
		else if(c>a && c>b)
		{
			System.out.println( c+ " c is larger than all");
		}
	}
}