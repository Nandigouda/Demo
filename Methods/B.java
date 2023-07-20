

import java.util.Scanner;

public class BB{
public static void main(String[] args) {
	int a[]= {10,20,30,7,13};
	for (int i=0;i<a.length;i++)
	{
		a=Prime(a[i]);
		{
			System.out.println(a[i]);
		}
	}}
	public static int[] Prime(int n)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of element ");
		int size=s.nextInt();
		int []a=new int[size];
		System.out.println("enter elements to be Stored ");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
	
	System.out.println("==============");
	for (int i=0;i<size ;i++ )
	{


			System.out.println(a[i]);
		}
		return a;
		
	}
}