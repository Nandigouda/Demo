class  Neon
{
	public static void main(String[] args) 
	{
		boolean res=Neon(9);
		if (res)
		 {
		  System.out.println("is a Neon");
		 }
		else
			{
		      System.out.println("is not a Neon");

	        }
	} 
	public static boolean Neon(int n)
	{
		int sq=n*n;
		int sum=0;
		while (sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
				sq=sq/10;
		}
			if (sum==n)
				{
		          return true;
		        }
		    else
		    {
			return false;
		    }
	   }
}
