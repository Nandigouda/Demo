/*

    *
   ***
  *****
 *******

*/
class Pyramid
{
	public static void main(String[] args) 
	{

		int n=6;
		int space=7;
		int star=1;
		for (int row=0;row<n;row++)
		{ 
	
			        
			for (int i=0;i<space;i++)
		    {
		        System.out.print("  ");
		    }
		     for (int j=0;j<star;j++)
		     {
		         System.out.print("* ");
		      }
			  space-=1;
		             star=star+2;
		         System.out.println();    
		      }
	  }
}
