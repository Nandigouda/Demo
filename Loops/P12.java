/*
1 A B C
2 3 D E
4 5 6 F
7 8 9 10

*/
class  P12
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
				if (row>=col)
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
