/*

* * * *
$ $ $ $
$ $ $ $
* * * *

*/
class forloop5 
{
	public static void main(String[] args) 
	
		{
		int n=4;
		char a='$';
		char b='*';
		for(int row=0;row<4;row++)
		{
			for(int col=0;col<4;col++)
			    {
				if (row==0||row==n-1)
				{
				System.out.print(b+" ");
				}
				else
				{
				System.out.print(a+" ");

				}}
             	System.out.println();
		}
	}
}
