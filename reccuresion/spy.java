class Spy 
{
	public static void main(String[] args) 
	{
		int n=1124;
		int temp=n;
		int prod=1;
		int sum=0;
	SpyNum(n,sum,prod,temp);
	}
	public static void SpyNum(int n,int sum,int prod,int temp)
	{
		int rem=n%10;
		sum=sum+rem;
		prod=prod*rem;
		n=n/10;
		if (n==0)
		 {
			if (sum==prod)
				{
				System.out.println(temp+" is a Spy Num");
				}
                 else 
				 {
				    System.out.println(temp+" is not an  not Spy Num");
                 }
				   return;
	             }
	                 SpyNum(n,sum,prod,temp);
	}
}
	