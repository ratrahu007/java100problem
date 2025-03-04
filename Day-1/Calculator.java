import java.util.*;

class Calculator
{

	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 1st number");
		int a=sc.nextInt();

		System.out.println("Enter a 2nd number");
		int b=sc.nextInt();

		System.out.println("The Addition is   " +( a+b));
		System.out.println("the substarction is  " + (a-b));
		System.out.println("The Product is    "  + (a*b));
		System.out.println("The division is   " +(a/b));
		System.out.println("The modulo is   " +(a%b));;
	}
}