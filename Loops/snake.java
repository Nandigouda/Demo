class snake 
{
	public static void main(String[] args) 
	{int n=4;
		int a=1;
		int b=6;
		for (int row=0;row<n;row++)
		{
			for (int col=0;col<n;col++)
			{
				if (row>=col)
				{
					if (row==2)
					{
		System.out.print(b);
		b--;
		a++;
					}
					else
					{
								System.out.print(a);
							a++;

				}}
				else
					{
							System.out.print("  ");
			}}
			
		System.out.println();
	}
}}
