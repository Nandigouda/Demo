class Prefect1
{
	public static void main(String[] args) 
	{
		int n=496;
		int sum=0;
         int a=1;
		sum=Prefect(n,sum,a);
		if (sum==n)
		{
		System.out.println("Prefect Number");
		}
		else
		{

		System.out.println("not an prefect num");
	    }
	}
	public static int Prefect(int n,int sum,int a)
	{
		if (n%a==0)
		{
			sum=sum+a;

		}
		a++;
		if (a==n)
		{
			return sum;
		}
		sum=Prefect(n,sum,a);
			return sum;
    }
}
