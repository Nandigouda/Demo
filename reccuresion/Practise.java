class Happy
{
	public static void main(String[] args)
	{
		int n=25;
		int temp=n;
		int sum=0;
		sum=Happy(n,sum);
        if (sum==1 || sum==7)
        {
		System.out.println(temp+" is a Happy Num");
     	}
	    else
		{
		System.out.println(temp+" is not an Happy Num");
		}
		}
	    public static int Happy(int n,int sum)
		{
		int rem=n%10;
		int sq=rem*rem;
		sum=sum+sq;
		n=n/10;
		if (n==0)
		{
		if (sum<9)
		{
		return sum;
		}
		else 
		{
			n=sum;
			sum=0;
		}}
	    sum=Happy(n,sum);
		return sum;
	}

}
