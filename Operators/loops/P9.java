class P9   // find the product of digits of given num
{
	public static void main(String[] args) 
	{
int a=4221;
int pro=1;
		{
while (a>0)
		{
	int rem=a%10;
      pro=pro*rem;
		a=a/10;
		}
			System.out.println(pro);
	}}}
