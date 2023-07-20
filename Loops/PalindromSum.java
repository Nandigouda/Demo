class PalindromSum    //sum of palindrom num from 1 to 100 using while 
{
	public static void main(String[] args) 
	{
		int rem;
		int rev=0;
		int a=1;
		int b;
		int sum=0;
		while (a<=100)
		{
			b=a;
			rev=0;
			while (a>0)
			{
				rem=a%10;
				rev=rev*10+rem;
				a=a/10;
			}
			if (rev==b)
			{
				sum=sum+rev;}
				a=b;
				a++;
				}
				System.out.println(sum);
				}
}
