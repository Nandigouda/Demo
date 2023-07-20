/*
A 1 B 2
A 1 B 2
A 1 B 2
A 1 B 2
*/

class forloop1 
{
	public static void main(String[] args)
		{
		int n=4;
		
		for(int row=1;row<=n;row++)
		{
			char ch='A';
	    int a=1;
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
