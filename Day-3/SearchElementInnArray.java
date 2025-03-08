import java.util.*;
class SearchElementInnArray
{
	int FindElement(int [] arr1,int n)
	{
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==n)
			{
				return arr1[i];
			}
		}
		return -1;
	}
	public static void main(String [] args)
	{
		SearchElementInnArray sea= new SearchElementInnArray();
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter a size");
		int size= sc.nextInt();
		int [] arr=new int[size];
		int l=arr.length;
		
		for(int i=0; i<l;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("enter a number you want to find");
		int c=sc.nextInt();
		int index = sea.FindElement(arr,c);
		 if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
	}
}