class  p1
{
	public static void main(String[] args) 
	{
		char a='9';
		if(!(a>='a'&&a<='z' && a>='A'&&a<='Z' && a>=0&&a<=9))
		{
		System.out.println(a+ " it is special charatcer");
		}
		else
		{
			System.out.println(a+ " it is not special character");
		}
	}
}
