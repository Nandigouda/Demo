class Int 
{
	
	int age;
	Int (){}
	Int(int age)
	{
		this.age=age;
	}

	//to convert int to String
	public String toString()
	{
		return age+"";
	}

	public void display(){

    System.out.println("the age is in the form of String :"+age);
	}

    //to convert int to Integer
	public static  Int  Npt(int x){

    return new  Int(x);

	}
        //to convert non primitive type
         public int intvalue(){

          return age;

         }}
