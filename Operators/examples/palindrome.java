class Palindrome 
{
	public static void main(String[] args) 
	{
		int a=1;
		int rev=0;
int b=a;
		while (a<=100)
		{ 
			
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if (rev==a)
		{
		System.out.println(rev);
	}
	a++;
}}	
