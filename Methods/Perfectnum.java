class PerfectNum
{
	public static void main(String[] args) 
	{
	boolean res=Perfect(6);   // 28,6
		if (res)
		 {
		  System.out.println("is a perfect");
		 }
		else
			{
		      System.out.println("is not a perfect");

	        }
	}
	public static boolean Perfect(int n) 
	{
		int temp=n;
		int a=1;
		int sum=0;
		while (a<=n/2)
		{
			if (n%a==0)
			{
				sum=sum+a;
            
			}
			a++;
			}
		
		if (sum==temp)
		
			 {
		      return true;
		  }
		    else
		    {
			return false;
		    }
}
}
