/*
A 1 B 2
C 3 D E
F 5 G 6
G 7 H 8
*/
class  foorloop
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch='A';
	    int a=1;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			    {
				if (col%2==0)
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
