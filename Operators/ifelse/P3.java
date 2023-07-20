class P3  //else if ladder 
//find given character is alphabet or digit or special
{
	public static void main(String[] args) 
	{
		char ch='4';
		if(ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z')
		{
		System.out.println(ch+" is a alphabet");
		}
		

	       else if(ch>='0' && ch<='9')
        {
	System.out.println(ch+" is a digit");
		}
		else
					System.out.println(ch+" is a special character");


	}
}
