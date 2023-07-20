class Prime   //sum of prime num between 1 to 100 
{
	public static void main(String[] args) 
	{
		int n=2;
		int a=2;
		int count=0;
		int sum=0;
		while (n<=100)
		{
			a=2;
			count=0;
			while (a<n)
			{
				if (n%a==0)
				{
					count=1;
					break;
				}
				a++;
			}
			if (count==0)
			{
				sum=sum+n;
			}
			n++;
		}
		System.out.println(sum);
	}}