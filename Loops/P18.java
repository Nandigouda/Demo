/*
1 2 3 4 5
A B C D E
A B C D E
1 2 3 4 5
*/

class P18 
{
	public static void main(String[] args) 
	{
		int n=4; int m=5;
		for (int row=0;row<n;row++)
		{
			int a=1; char ch='A';
			for (int col=0;col<m;col++)
			{
				if (row==1||row==2)
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
