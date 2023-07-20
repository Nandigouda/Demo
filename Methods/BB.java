

import java.util.Scanner;

public class BB{
	Scanner s=new Scanner(System.in);
		
		 static int size=s.nextInt();
		static int []a=new int[size];
public static void main(String[] args) {
	
		System.out.println("enter elements to be Stored ");
	for (int i=0;i<a.length;i++)
	{
		a=Prime(a[i]);
		{
			System.out.println(a[i]);
		}
	}}
	public static int[] Prime(int n)
	{
		
		System.out.println("enter elements to be Stored ");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
	
	System.out.println("==============");
	for (int i=0;i<size ;i++ )
	{


			System.out.println(a[i]);
		}
		return null;
		
	}
}