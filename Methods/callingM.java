class callingM 
{
	public static void main(String[] args) 
	{

		System.out.println("Main began");
		test();
		System.out.println("Main end");
	}
	public static void print()
	{
		System.out.println("print began");   //mb,tb,pb,pe,te,me
		System.out.println("print end");
	}
	public static void test()
	{
	   System.out.println("test begin");
	   print();
	   System.out.println("test end");
    }

    }
