class P3
{
	static int a=test()+print();
	static
	{
		System.out.println("SIB-2");
	}
	public static int test()
	{
				System.out.println("Test Begin");
				System.out.println(a);
				print();
				System.out.println(b);		
			    System.out.println("Test End");
				return 60;
	}
	public int Demo()
	{
			System.out.println("Demo Begin");
			System.out.println(a);
		  System.out.println(b);
		 System.out.println(c);
		 test();
		 System.out.println("Demo End");
	     return 30;
	}
	public static int print()
	{
		System.out.println("Print Begin");
			System.out.println(a);
		  System.out.println(b);
		 System.out.println("Print End");
	     return 30;
	}
	static int b=30+test();
	{
		System.out.println("IIb-1");
	}
	int c=Demo();
	static 
	{
				 System.out.println("SIB-1");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		P3 Obj=new P3();
		Obj.a=45;
		Obj.c=35;
		System.out.println(Obj.a);
			System.out.println(Obj.b);
		  System.out.println(Obj.c);

		  P3 Obj1=new P3();
		  System.out.println(Obj1.a);
			System.out.println(Obj1.b);
		  System.out.println(Obj1.c);
		  		  System.out.println("Main End");
	}
	{
				  System.out.println("IIB-2");
	}
}

