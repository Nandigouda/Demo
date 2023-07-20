class Perfect  //find given num is Perfect or not 
{
	public static void main(String[] args) 
	{

		int n=496;
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
		
		if (sum==n)
		{
		System.out.println(n+" is a Perfect num");
		}
		else 
			{
		System.out.println("Enter an Perfect num");
	}
  }
}
