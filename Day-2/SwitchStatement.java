import java.util.*;
class SwitchStatement
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter day count");
		int day=sc.nextInt();

		switch(day)
		{
			case 1:
				System.out.println("Monday");
			break;
			
			case 2:
				System.out.println("Tuesday");
			break;

			case 3:
				System.out.println("Wenesday");
			break;


			case 4:
				System.out.println("Thurusday");
			break;


			case 5:
				System.out.println("Friday");
			break;


			case 6:
				System.out.println("Saturday");
			break;


			case 7:
				System.out.println("Sunday");
			break;

			default : System.out.println("its Invalid day");
		}
	}
}