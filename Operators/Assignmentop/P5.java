class P5 
{
	public static void main(String[] args) 
	{
		int a=15;
		int b=(a++)+(++a)+30;
		int c=(++b)-(--a)-(a--);
		int d=(a++)+(++b)+(--c)-(--c);
		System.out.println(++a);
	System.out.println(++b);
			System.out.println(--c);
			System.out.println(d--);
	}
}
