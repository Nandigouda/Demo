import java.util.*;
class Devision

{
	public static void main(String[] args) 
	{

		Scanner s=new Scanner(System.in);

		try{
			System.out.println("=====================well come to Division Application====================");
			System.out.println("Enter the elements");
			int num=s.nextInt();
			int deno=s.nextInt();
			int res =num/deno;
			
		}
		/*catch(ArithmeticException e){
			System.out.println("Exception is Handled");
			System.out.println(e);
			e.printStackTrace(); 
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the integer type data");
		}*/
		finally
		{
			System.out.println("Thank you for using the application");
		}
	}
}
