class ArmStrong 
{
	public static void main(String[] args) 
	{
		boolean res=Armstrong(153);   // 1,2,145
		if (res)
		 {
		  System.out.println("is a Armstrong ");
		 }
		else
			{
		      System.out.println("is not a ArmStorng");

	        }
	}
	public static boolean Armstrong(int n)
	{
	int count=0;
		int sum=0;
		int temp=n;
		int rem;
		while (temp>0)
		{
			count++;
			temp=temp/10;

		}
		while (temp>0)
		{
			int a=count;
		
			rem=temp%10;
			int prod=1;
			while (a>0)
			{
				prod=prod*rem;
				a--;
			}
			sum=sum+prod;
			temp=temp/10;
		}
		{
		if (temp==sum)
         {
		      return true;
		  }
		    else
		    {
			return false;
		    }
}
}
}

