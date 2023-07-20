class Sunny 
{
	public static void main(String[] args) 
	{
		boolean res=Sunny(80);
		if (res)
		 {
		  System.out.println("is a Sunny");
		 }
		else
			{
		      System.out.println("is not a Sunny");

	        }
	}
    public static boolean Sunny(int a)
	{
		int n=a+1;
		int b=1;
        int count=0;
		int sq;
		while (b<n)
		{
			sq=b*b;
			if (sq==n)
		    {
				count=1;
				break;

			}
			b++;
		}
			if (count==1)
	        {
		      return true;
		    }
		    else
		    {
			return false;
		    }
	   }
}
