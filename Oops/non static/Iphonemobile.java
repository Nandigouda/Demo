class IphoneMobile {

     String modle;
	String battery;
	double price;

	public static void main(String[] args) 
	{
		IphoneMobile ip1=new IphoneMobile();
		ip1.modle="Iphone 12";
		ip1.battery="2815 mah";
		ip1.price=61000;
		System.out.println("Iphone 12 Details");
		System.out.println("Iphone Modle: "+ip1.modle);
		System.out.println("Iphone battery: "+ip1.battery);
		System.out.println("Iphone price: "+ip1.price);
		System.out.println("----------------------");

		IphoneMobile ip2=new IphoneMobile();
		ip2.modle="Iphone 13";
		ip2.battery="3227 mah";
		ip2.price=79000;		
		System.out.println("Iphone 13 Details");
		System.out.println("Iphone Modle: "+ip2.modle);
		System.out.println("Iphone battery: "+ip2.battery);
		System.out.println("Iphone price: "+ip2.price);
		System.out.println("------------------------");

		IphoneMobile ip3=new IphoneMobile();
		ip3.modle="Iphone 14";
		ip3.battery="4324 mah";
		ip3.price=120000;
		System.out.println("Iphone 14 Details");
        System.out.println("Iphone Modle: "+ip3.modle);
         System.out.println("Iphone battery: "+ip3.battery);
         System.out.println("Iphone price: "+ip3.price);
		 System.out.println("------------------------");

	}
}
