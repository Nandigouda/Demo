class Employee 
{
	String name;
	String role;
	String dept;
	int salary;

public void display()
	{
		System.out.println("Employee details");
		System.out.println("Employee name: "+ name);
		System.out.println("Employee name: "+ role);
		System.out.println("Employee name: "+ dept);
		System.out.println("Employee name: "+ salary);
	    System.out.println("========================");

	}
	public static void main(String[] args)
		{
		Employee Emp1=new Employee();
		Emp1.name="nikhil";
		Emp1.role="SDET";
		Emp1.salary=100000;
		Emp1.dept="A";
		Emp1.display();

		Employee Emp2=new Employee();
		Emp2.name="Nandi";
		Emp2.role="SDET";
		Emp2.salary=100000000;
		Emp2.dept="B";
		Emp2.display();


	}}
