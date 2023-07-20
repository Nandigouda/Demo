class Emp
{
	Emp(int i)
	{
		this(1,"nikhil",100.0);
				System.out.println("int");
	}
	Emp(int i,String name,Double sal)
	{
		this(1,"nikhil",100.0,11);
					System.out.println("int,name,double");
	}
		Emp(int i,String name,Double sal,int id)
	{
			this();
			System.out.println("int,name,double,id");
	}
			Emp()
	{
			System.out.println("No Arg Constructor");
}
	public static void main(String[] args) 
	{
       Emp e1=new Emp(1);
	}
	}
