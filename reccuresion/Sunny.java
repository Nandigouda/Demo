class Sunny 
{
	public static void main(String[] args) 
	{
	int n=80;
	int a=n+1;
    int b=1;
	int count=0;

	Sunny(n,a,b,count);
	}
	public static void Sunny(int n,int a,int b,int count)
	{
	int sq=b*b;
	if (sq==a)
	{
        count=1;
	}
			
	b++;
	if (b==a)
	{
	if (count==1)
	{
	System.out.println(n+" is a Sunny num");
	}
	else
	{
	System.out.println(n+" is not a Sunny num");

	}
    return;
	}
            
     Sunny(n,a,b,count);
	}
}
