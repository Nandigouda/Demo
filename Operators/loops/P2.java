class P2 //sum of odd num between 20 to 30
{
	public static void main(String[] args) 
	{
		int a=20;
		int sum=0;
		while (a<30)
		{
			if (a%2==1)
			sum=sum+a;
			a++;
		}
		System.out.println(sum);
	}}
