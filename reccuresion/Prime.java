class  Prime
{
	public static void main(String[] args) 
	{
		int n=10;
		int a=2;
		int count=0;
		Prime(n,a,count);
		
	}
	public static void Prime(int n,int a,int count)
	{
		if (n%a==0)
		{
			count=1;
		}
			a++;
			if (n==a)
			{
				
			if (count==0)
			{
				System.out.println(n+" is a Prime Num");
			}
			else
				{
				System.out.println(n+" is not a Prime Num");
				}
				return;
			}
			Prime(n,a,count);


}
}
