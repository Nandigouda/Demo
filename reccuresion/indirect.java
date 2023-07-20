class Indirect 
{
	public static void main(String[] args) 
	{
		System.out.println("MB");
		test();
				System.out.println("ME");
	}
	public static void print ()
	{
				System.out.println("PB");
				test();


}
public static void test()
	{

			System.out.println("TB");
			print();
					System.out.println("TE");
	}}