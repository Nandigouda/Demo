/*
1 2 3 4
A B C D
E F G H
5 6 7 8
*/




class P11 
{
	public static void main(String[] args)
	{
int n=4;
		char ch='A';
		int a=1;
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n;col++)
			    {
				if (row==0||row==n-1)
				{
				System.out.print(a+" ");
				a++;
				}
				else
				{
				System.out.print(ch+" ");
				ch++;

				}}
             	System.out.println();
		}
	}
}
