class P4 
{
	public static void main(String[] args) 
	{
		Even(10);
	}
	public static void Even(int n){
		if (n%2==0)
		{
System.out.println(n);
		}
		n++;
		if (n==21)
		{
			return;
		}
		Even(n);
	}
}
