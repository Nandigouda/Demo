class  PrintNum
{
	public static void main(String[] args) 
	{
		printNum(1);
	}
	public static void printNum(int n){
		System.out.println(n);
		n++;
		if (n==11)
		{
			return;
		}
		printNum(n);

	}
}
