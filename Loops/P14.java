/*
A B C D
1 2 3 E
4 5 6 F
7 8 9 G
*/
class P14 
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
			if (row==0||col==n-1)
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
	}
	}
	}
