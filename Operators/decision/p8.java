class  p8
{
	public static void main(String[] args) 
	{
		char a='&';
		if(!(a>='a'&&a<='z' || a>='A'&&a<='Z' || a>=0&&a<=9))
		{
		System.out.println(a+ " it is special charatcer");
		}
		else
		{
			System.out.println(a+ " it is not special character");
		}
	}
}
