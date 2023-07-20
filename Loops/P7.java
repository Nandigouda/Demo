/*
A B C D
E F G H
I J K L
M N O P
*/
class p7 
{
	public static void main(String[] args) 
	{
		int n=4;
	char ch='A';
	int b=1;
		for(char row=1;row<=n;row++)
		{
			for(char col=1;col<=n;col++)
				{
				System.out.print(ch+" ");
				ch++;
				}
             		System.out.println();
		}
	}}