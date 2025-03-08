class   SwapWithoutThird
{
	public static void main(String [] args)
	{
		int a=8;
		int b=5;

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" Value aftwer swap of a:  " + a);
		System.out.println("values after swap of b:  "+ b);
	}
}
