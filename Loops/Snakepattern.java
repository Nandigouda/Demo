class SnakePattern 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int a = 1;
		int b = 1;
		int c=1;
		for (int i=0; i<n;i++) {

			for (int j=0;j<n;j++)
				{
				if (i + j >= n - 1) {
					
					if(i%2==0) {
						System.out.print(b+ " ");
						b--;
					}
					else
						{
						System.out.print(b+ " ");
						b++;
					}
				}
				
			}
			if(i%2==1)
				{
			b=b+(2*c);
			c++;
			}
			else if(i%2==0) {
				b=b+(2*c);
				//b=b++;
			}
			
			System.out.println();
		}
	}
}