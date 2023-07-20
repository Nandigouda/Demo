class Reccuresion 
{
	public static void main(String[] args) 
	{
		printNum(1);

	}
	public static void printNum(int n){
		System.out.print(n);
		n++;
		if (n>=6)
		{
			return;
		}
		printNum(n);
}
}