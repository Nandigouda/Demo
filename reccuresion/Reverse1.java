class Reverse1 
{
	public static void main(String[] args) 
	{
		reve(1234,0);

	}
	public static void reve(int n,int rev)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	
	if(n==0)
		{
		System.out.println(rev);
		return;
	}
	reve(n,rev);
}
}
