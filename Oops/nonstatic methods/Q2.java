class Q2 
{
	int a=10;
	public static void main(String[] args) 
	{
System.out.println("Hello World!");

		Q2 Obj=new Q2();
		Obj.a=20;
		Obj.test();
		Q2 Obj1=new Q2();
		Obj1.test();
	}
	public void test(){
		int a=10;
				System.out.println(this.a);
	}
}
