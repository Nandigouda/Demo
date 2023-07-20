/*
A B C D
5 6 7 8
I J K L
13 14 15 16
*/



class forloop4 
{
	public static void main(String[] args)	
{
		int n=4;
		char b='$';
		char a='*';
		int c;
		int d;
		for(int row=1;row<=n;row++)
		{ c=b;
			for(int col=1;col<=n;col++)
			    {
				if (row%2==0)
				{
				System.out.print(a+"  ");
				}
				else
				{
				System.out.print(b+"  ");
				}}
             	System.out.println();
		}
}}