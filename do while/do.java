class  Palindrome
{
	public static void main(String[] args) 
	{

		int n=121;
        int a=n;
        int rev=0;

		do
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		while (n>0);
		if (rev==a)
		{
		System.out.println(a+" is a Palindrome num");
		}
		else
		{
		System.out.println(" enter an Palindrome num");
		
	}
}
}