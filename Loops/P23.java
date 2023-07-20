/*

  *   *
* * * * * 
  *   *
* * * * *
  *   *

*/

class P23 
{
	public static void main(String[] args) 
	{
	int n=5;
		for (int row=0;row<n;row++)
		{
			for (int col=0;col<n;col++)
			{
				if (row%2==1||col%2==1)
				{
		System.out.print("* ");
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