class Emp
{
		int id;
		String name;
		double sal;

		Emp(int id,String name,double sal)
		{
			this.id=id;
			this.name=name;
			this.sal=sal;
		}
		public void display()
		{
		System.out.println("Employee Details");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee id: "+id);
		System.out.println("Employee Salary "+sal);
		System.out.println("-----------------------------");


	}
}
