class StrongNum  // given num is strong or not 
{
	public static void main(String[] args) 
	{
		int a=145;
		int n=a;
		int sum=0;
					
		while (a>0)
		{ 
		int prod=1;
		int count=1;
			int rem=a%10;
			while (count<=rem)
			{
			prod=prod*count;
			count++;
			}
		sum=sum+prod;
			
            a=a/10;
		}

if (sum==n)
{
		System.out.println(n+" is a Strong num");
}
else 
		{

		System.out.println("Enter a Strong num");
	}
}
}