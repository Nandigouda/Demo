class SpyNum   // given num is spy or not
{
	public static void main(String[] args) 
	{
		int n=132; int b=n;
		int prod=1;
		int sum=0;
		while (n>0)
		{
			int rem=n%10; //4,2,1,1
			sum=sum+rem;    //0+4,4+2,6+1,7+1=8
			prod=prod*rem;   //1*4,4*2,8*1,8*1=8
			n=n/10;

		}
		if (sum==prod)
		{
		System.out.println(b+" is a Spy number");
		}
		else 
		{
		System.out.println("Enter a Spy num");
	}
}
}