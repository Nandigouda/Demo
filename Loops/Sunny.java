class Sunny    //given num is sunny num or not
{
	public static void main(String[] args) 
	{
		int a=8;
		int n=a+1;
		int b=1;
        int count=0;
		int sq;
		while (b<n)
		{
			sq=b*b;
			if (sq==n)
		    {
				count=1;
					break;

			}
			b++;
		}
			if (count==1)
			{
		System.out.println(a+" is a Sunny Number");
			}
			else 
			{
						System.out.println("Enter a Sunny number");
		     } 
		}
		
	}