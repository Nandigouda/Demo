
/*
1
A B
2 3 4
C D E F
*/
class  P17
{
	public static void main(String[] args) 
	{
		int n=4;
	char ch='A';
	int a=1;
		{
	for (int row=0;row<n;row++)
	{
		for (int col=0;col<n;col++)
		{
			if(row>=col)
			{
			if (row%2==0)
				{
				System.out.print(a+" ");
					a++;
			}
			else
				{
								System.out.print(ch+" ");
ch++;
		}
	}
}
					System.out.println();
	   }
      }
     }
   }