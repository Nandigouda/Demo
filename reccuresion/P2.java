class P2 
{
	public static void main(String[] args) 
	{
		System.out.println("MB");
		test(5);
		System.out.println("ME");
	}
	public static void test(int n){
		System.out.println("Hi");
		n--;
		if (n==0)
		{
			return;
		}
test(n);
	System.out.println("BYE");
	}
}
