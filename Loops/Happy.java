class Happy 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int row=0;row<n;row++)
		{
          for (int col=0;col<n;col++)
			{
			  if (col==0||col==n-1||row==n/2)
			 {
				
					System.out.print("* ");
			}
			else 
				{
						System.out.print("  ");
		}}
		for (int col=0;col<n;col++)
			{ 
				if (row==0||col==0||col==n-1||row==n/2)
				{
				
					System.out.print("* ");
			}
			else 
				{
						System.out.print("  ");
		}}
		for (int col=0;col<n;col++)
			{
				if (col==0||row==0||row==n/2||row==1&&col==n-1)
				{
				
					System.out.print("* ");
			}
			else 
				{
						System.out.print("  ");
		}}
		for (int col=0;col<n;col++)
			{
				if (col==0||row==0||row==n/2||row==1&&col==n-1)
				{
				
					System.out.print("* ");
			}
			else 
				{
						System.out.print("  ");
		}}
for (int col=0;col<n;col++)
			{
				if (row==n-3&&col==n-3||row==n-2&&col==n-3||row==n-1&&col==n-3||row==0&&col==0||row==0&&col==n-1||col==3&&row==1||row==n-4&&col==1)
				{
				
					System.out.print("* ");
			}
			else 
				{
						System.out.print("  ");
		}}
		for (int col=0;col<n;col++)
			{
				if (row==n-3&&col==n-3||row==n-2&&col==n-3||row==n-1&&col==n-3||row==0&&col==0||row==0&&col==n-1||col==3&&row==1||row==n-4&&col==1)
				{
				
					System.out.print("* ");
			}
			else 
				{
						System.out.print("  ");
		}}
		System.out.println();
	}
}}
