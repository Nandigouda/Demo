class Palin 
{
	public static void main(String[] args) 
	{
		int n =121;
		int rev=0;
		rev=Palin(n,rev);
		if (n==rev)
		{
            System.out.println("palindrome");
		}
             else
			{
	           System.out.println(" not an palindrome");
		     }
	 }
	public static int Palin(int n,int rev)
		{
		int rem=n%10;
		rev =rev*10+rem;
		n=n/10;
		if (n==0)
		{
			return rev;
		}
		rev=Palin(n,rev);
		return rev;
	    }
}
