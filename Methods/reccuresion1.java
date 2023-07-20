class Reccuresion1 
{
	public static void main(String[] args)
	{
		printNum(1,5,0);

	}
	public static void printNum(int i,int n,int sum){
		if (i==n)
		{
			sum=sum+i;
		System.out.print(sum);
			return;
		}
sum=sum+i;
i++;
		printNum(i,n,sum);

}
}
