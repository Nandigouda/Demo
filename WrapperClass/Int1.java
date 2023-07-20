class Int1 
{
	public static void main(String[] args) 
	{
		Int a=new Int (25);
		a.toString();
		a.display();
          Int age=Int.Npt(25);//calling static method with the help of class (this is one method)
		                        //convertion of any primitive to string type
		System.out.println("This age is in the form of Integer :"+age);
		
		int age1=age.intvalue(); //calling non-static method with the help of obj reference(this is 2nd method) 
		                          //convertion of any non primitive to respective premitive data type
          System.out.println("This age is in the form of int  :"+age1);

	}
}
