class Dimond 
{
	public static void main(String[] args) 
	{
		int n=4;
		int a=0;
        int b=7;
		for (int row=0;row<n;row++)
		{ 
			for (int i=0;i<a;i++)
			{
         		System.out.print(" ");
		    }
			for (int j=0;j<b;j++)
			{
			  System.out.print("* ");
			}
              a=a+2;
			  b=b-2;
		         System.out.println();
	}
	int space=2;
		int star=3;
		for (int row=1;row<n;row++)
		{
			for (int i=0;i<space;i++)
		    {
		        System.out.print("  ");
		    }
		     for (int j=0;j<star;j++)
		     {
		         System.out.print("* ");
		      }
		             space--;
		             star=star+2;
	
			         System.out.println();
		      }
	  }
}