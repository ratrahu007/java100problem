import java.util.Arrays;
import java.util.*;
class ArrayEg
{

	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size");
		
		int  a= sc.nextInt();

		int [] arr= new int[a] ;

		for(int i=0;i<arr.length;i++)
		{

			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}