class Reccuresion2
{
	public static void main(String[] args) 
	{		
		int res=calcFact(5);
		System.out.println(res);
	}
	public static int calcFact(int n){
		if (n==1||n==0)
		{
			return 1;
		}
		int fact=calcFact(n-1);
		int facto=n*fact;
		return facto;

}}
