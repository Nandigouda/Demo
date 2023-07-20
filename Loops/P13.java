/*
1 2 3 A
4 5 B 6
7 C 8 9
D 10 11 12
*/
class  P13
{
	public static void main(String[] args) 
	{ int n=4;
	char ch='A';
	int a=1;
	for (int row=0;row<n;row++)
	{
		for (int col=0;col<n;col++)

		{
			if (row+col==(n-1))
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
