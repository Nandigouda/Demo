class P1 
{
	P1()
	{
		System.out.println("IIB-1");
	}
	int a=10;
	int b=50+a;
	static int c =test();
	{
	System.out.println("IIB-1");
	System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("main Begin");
		test();
		new P1();
				System.out.println("Main End");
	}
	static
	{
				System.out.println("SIB-1");
				System.out.println(c);
	}
	public static int test()
	{
			System.out.println("Test Begin");
			System.out.println("Hi....!");
							System.out.println("Test End");
							return 50;
	}
}
