import java.util.*;


class IsPrime
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int a =sc.nextInt();
		while(a>1)
		{
			if(a%1==0 && a%a==0)
			{
				System.out.println("Its Prime Number");
			}
			else
			{
				System.out.println("It's Not Prime number");
			}
		}
	}
}