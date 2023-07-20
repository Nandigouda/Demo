import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Sentence :");
		String sentence=s.nextLine();
	String sWithoutSpace="";
	for (int i=0;i<sentence.length() ;i++ )
	{
		char ch=sentence.charAt(i);
		if (ch!=' ')
		{
sWithoutSpace=sWithoutSpace+ch;
		}
	}
	System.out.println("sWithoutSpace :"+sWithoutSpace);
	}

}
