class Plain // of num 1 to 100 
{
	public static void main(String[] args) 
	{
		int a=0;
		int rem=0;
		int b;
		int rev=0;
		do
		{
			a++;
		}
		while (a/10==0);

			do
			{
				b=a;
				rev=0;
				do
				{
				rem=a%10;
				rev=rev*10+rem;
				a=a/10;
			}
			while (a>0);
			if (rev==b)
			{
System.out.println(rev);
			}
			a=b;
			a++;
		}while (a<=100);
	}}