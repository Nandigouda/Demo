class  Prime1   prime num between 1 to 100
{
	public static void main(String[] args) 
	{
	int i=1;
	while (i<100)
	{
		int n=i;
		int count=0;
		int a=2;
		while (a<=n/2)
		{
			if(n%a==0)
			{
				count=1;
		}
a++;
	}
	if(count==0)
		{
		System.out.println(i);
	}
	i++;
}}}
