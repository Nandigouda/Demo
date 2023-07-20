class  Largest
{
	public static void main(String[] args) 
	{
				System.out.println("Main begin");


		int lar=largest(10,20,30);
				System.out.println(lar);
		System.out.println("Main end");
	}
     public static int largest(int a,int b,int c)
	{
		 if (a>b && a>c)
	     return a;
        else if (b>c)
	     return b;
         else
      	return c;
    }


}
