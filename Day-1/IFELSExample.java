import java.util.*;
class IFELSExample
{

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");

		int a = sc.nextInt();

		if(a>18)
		{
			System.out.println("Bro you can drive a vehicle");
		}
		else
		{
			System.out.println("Bro pls don't drive vehicle");
		}
	}
}