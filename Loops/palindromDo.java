class PalindromDo   //check given num is palindrom or not  
{
	public static void main(String[] args) 
	{
		int a=121;
		int b;
		int rem=0;
		int d=a;
		do
		{
			b=a%10;
			rem=rem*10+b;
			a=a/10;

		}

		while (a>0);
		{
			if (rem==d)
			{
System.out.println(d +" is a aplindrom");
			}
			else
		System.out.println(d +" is not a palindrome");
	}
}}
