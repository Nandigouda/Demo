class P8 //sum of digits of givrn num
{
	public static void main(String[] args) 
	{

		int a=4221;
		int sum=0;
		while (a>0)
		{
		sum=sum+a%10;
		a=a/10;
	}
			System.out.println(sum);
}}
