/*
A B C D
A B C D
A B C D
A B C D
*/
class P6
{
	public static void main(String[] args) 
	{
		for(char row='A';row<='D';row++)
		{
			char ch='A';
			for(char col='A';col<='D';col++)
			{
				System.out.print(ch+" ");
				ch++;
			}
             		System.out.println();
		}
	}}
