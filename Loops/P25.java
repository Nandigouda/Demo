class P25 
{
	public static void main(String[] args) 
	{
		int n=5;
		int a=1;
		for (int row=0;row<n;row++)
		{
			for (int col=0;col<n;col++)
			{
				if (row==col||row+col==n-1)
				{
		System.out.print(a);
		a++;
				}
				else
				{
							System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}