class PrimeG //find given num id=s prime or not 
{
	public static void main(String[] args) 
	{
		int n=3;
		int a=2;
		int count=0;
		do
		{
			if (n%a==0)
			{
				count=1;
				break;
			}
			a++;
		}
		while (a<=n/2);
		if (count==0)
		{
		System.out.println(n +" prime num");
	}
	else
		{
		System.out.println(n +"is not  prime num");

}}}
