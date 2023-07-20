class Prime 
{
	public static void main(String[] args)
	{
		int count=0;
		int a=2;
		int b=1;
		while (a<=100)
		{
		count=0;
		b=1;
		while (b<=a)
		{
		if (a%b==0)
		count++;
		b++;
		}
		if (count==2)
		
		System.out.println(a);
		}
		a++;
		}}






