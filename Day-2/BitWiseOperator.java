class BitWiseOperator
{
	public static void main(String [] args)
	{															
		//Bitwise left is calulated using formula the formula is  a*2        rest to b
		// Bitwise operator works only on binaary data...
		int a =12;
		int b= 3;
		System.out.println(a<<b);
		

		// Bitwise right is calculated using formula a/2 rest to b
		int c=44;
		int d=2;
		System.out.println(c>>d);

		//bitwise complementary -n+1)
		int num=12;
		int result=~num;
		System.out.println(result);

		//BitWise & if we use this we have yo convert values in binary format and the the final answer have to convert into binary using 8	4	2	1
		//if & comes perform multiplication on the Binary values
		
		int e =6;
		int f=7;
		System.out.println(e&7);
	}
}