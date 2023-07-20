/*
      *
    * *
  * * *
* * * *
*/

class P8 
{
	public static void main(String[] args) 
	{
		int n=4;
		char a='*';
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n;col++)
			    {
				if (row+col>=n-1)
				{
				System.out.print(a+" ");
				}
				else
				{
				System.out.print("  ");

				}}
             	System.out.println();
		}
	}
}
