class Car1
{
	String brand;
	int model;
	double price;
	Car1()
	{
		
	}
	Car1(String brand)
	{ this();
		this.brand=brand;
	}
	Car1(String brand,int model)
	{
		this(brand);
		this.model=model;
	}
	Car1(String brand,int model,double price)
	{

		this(brand,model);
		this.price=price;
	}
	public void display()
	{
		System.out.println("Car Details ");
		System.out.println("Car Brand: "+brand);
		System.out.println("Car Model: "+model);
		System.out.println("Car Price: "+price);
		System.out.println("------------------------");
	}
}
