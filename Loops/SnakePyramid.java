class SnakePyramid 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int a = 1;
		int b=1;
		int c=1;
		for (int i = 0; i < n; i++) 
			{

			for (int j = 0; j < n; j++)
				{
				if (i + j >= n - 1)
					{
					System.out.print(a++ + " ");
				} 
				else
					System.out.print("  ");
			}

			for (int j = 0; j < n; j++)
				{
				if (i + j >= n - 1)
					{
					System.out.print(b + " ");
					b--;
				}
			
			}
			b=b+(2*c+1);
			c++;
	System.out.println();
		}
	}
}