class  P1
{
	public static void main(String[] args) 
	{
		System.out.println("MB");
		test(5);
		System.out.println("ME");
	}
	public static void test(int n)
	{
		System.out.println("Hello World!");
		n--;
		if (n<=0)
		{
			return;
		}
		test(n);
}
}
