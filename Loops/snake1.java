class snake1 
{
	public static void main(String[] args) 
	{
		{int n=4;
		int a=1;
		int m=1;
		int b=6;
		for (int row=0;row<n;row++)
		{
			for (int col=0;col<n;col++)
			{
				if (row+col>=n-1)
				{
					
		System.out.print(a+" ");
		a++;
					}
					
				else
					{
							System.out.print("  ");
			}}
for (int col=0;col<n;col++)
			{
				if (row>=col)
				{
					if (row==2)
					{
		System.out.print(b+" ");
		b++;
		m--;
					}
					
				else
					{
							System.out.print(m+" ");
							m++;
			}}
					System.out.print("  ");
			}
		System.out.println();
	}

}}}
