class Sqrt  // find the sqrt of given num 
{
	public static void main(String[] args) 
	{
		int count=0;
		int n=81;
		int sq=0;
		int a=1;
		while (sq<n)
		{
			sq=a*a;
		
		if (sq==n)
			{
			count=1;
			break;
			}
		a++;
		}
		if (count==1)
		{
		System.out.println(a + " is a sq root of "+ n);
		}
		else
		System.out.println(a + " is not a sq root of "+ n);
	}
}
