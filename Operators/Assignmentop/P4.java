class P4 
{
	public static void main(String[] args) 
	{
		int a=30;
		int b=(++a)+(a++);
		int c=(--b)+(b--)+(++a);

		System.out.println(a++);
		System.out.println(--b);
		System.out.println(c--);
	}
}
