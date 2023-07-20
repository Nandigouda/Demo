class  P9   //given char is special or not
{
	public static void main(String[] args) 
	{
char ch='#';
if(!(ch>=0&&ch<=9 || ch>='A'&&ch<='Z'|| ch>='a'&&ch<='z'))
		System.out.println(ch + " is special character");

	else 
	{
		System.out.println(ch + " is not a speial character");
}}}
