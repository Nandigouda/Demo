import java.util.Scanner;
class A1 
{
	public static void main(String[] args) 
	{

	Scanner s=new Scanner(System.in);
	System.out.println("Enter An String");
	String s1=s.next();
	String s2="";
		for ( int i=0;i<s1.length() ;i++ )
		{
            s2=s1.charAt(i)+s2;
		}

        if (s1.equalsIgnoreCase(s2)){
         System.out.println("Given String is Plaindrome");
		}
         else{
		System.out.println("Given String is not a Plindrome");
		 }
	
       }
    }
