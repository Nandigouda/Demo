class Prime 
{
	public static void main(String[] args) 
	{
		boolean res=Prime(10);
		if (res)
	
          		System.out.println("is a prime number");
		
		else
		System.out.println("is not a prime number");
	}
	
	
	public static boolean Prime(int n)
	{
		int a=2;
		int count=0;
		{
		while (n%a==0)
		{
			count=1;
			break;
		}
		
		a++;
	}
	if (count==0)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	}
