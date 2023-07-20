import java.util.Scanner;
class A1 
{
	public static void main(String[] args) 
	{  

		Object o=10;
		o=10.5;  //double--->Double(Boxing)--->Object(Upcasting)
		System.out.println(o);
		o='A';
         System.out.println(o);  //char--->Character(boxing)-->Object

		 o=true;//
		 System.out.println(o);

		 o=new Scanner(System.in); 
		 System.out.println(o);

	}}
