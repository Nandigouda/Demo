class Student 
{
	String name;
	int rollNo;
	Student(String name,int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
	void StudentDetails()
	{
				System.out.println("Student Details");
				System.out.println("Student Name: "+name);
				System.out.println("Student RollNo: "+rollNo);
				System.out.println("----------------------------");
				
}
}