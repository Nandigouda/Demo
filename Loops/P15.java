/*
A B C D
E 1 2 F
G 3 4 H
I J K L
*/



class P15 
{
	public static void main(String[] args) 
	{
		int n=4;
	char ch='A';
	int a=1;
	for (int row=0;row<n;row++)
	{
		for (int col=0;col<n;col++)

		{
			if (row==0||row==n-1||col==0||col==n-1)
			{
				System.out.print(ch+" ");
					ch++;
			}
			else
			{
								System.out.print(a+" ");
a++;
		}
	}
					System.out.println();
	}}}

