class Dowhile 
{
	public static void main(String[] args) 
	{
		int a=0;
			int b=1;
			int c;
			int n=50;
			 System.out.println(a);
			 			 System.out.println(b);
						 do
						 {
							 c=a+b;
							 a=b;
							 b=c;
							 			 System.out.println(c);
						 }
						 while (a<=n);
	}
}
