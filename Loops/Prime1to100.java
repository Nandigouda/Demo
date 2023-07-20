class Prime1to100 
{
	public static void main(String[] args) 
	{
		int  n=2;
		int a=2;
		int count=0;
		{
			do
			{
				a=2;
				count=0;
				do
				{
					if (n%a==0)
					{
						count=1;
						break;
				}
				a++;
				}
				while (a<n);
				if(count==0)
					{
System.out.println(n);
			}
			n++;}
			while (n<=100);
			}
}}
