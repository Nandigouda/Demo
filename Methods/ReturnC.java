class  ReturnC
{
	public static void main(String[] args) 
	{
				System.out.println("Main begin");
		int res=(int)add(10,20);
				System.out.println(res);

		System.out.println("Main end");

	}
	public static double add(int a,int b)
	{
		int c=a+b;

		return c;
	}

}
