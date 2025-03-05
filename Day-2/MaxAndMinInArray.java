import java.util.Arrays;

class MaxAndMinInArray
{

	public static void main(String [] args)
	{
		int [] arr={5,6,7,1,9,8};

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("It si minimum value in arra	" + arr[0]);
		System.out.println("it is the MAx in array   "  + arr[arr.length-1]);



	}
}