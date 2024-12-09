class CarDriver
{
	public static void main(String[] args)
	{
		System.out.println("main method=================");
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		System.out.println("Car1 Object address is: "+c1);
		System.out.println("Car2 Object address is: "+c2);
		System.out.println("Car3 Object address is: "+c3);

		c1.name="TATA";
		c1.price=353563.45;
		c1.color="RED";
		c2.name="Porsche";
		c2.price=45754788.67;
		c2.color="Yellow";
		c3.name="Maruti800";
		c3.price=34647.67;
		c3.color="Silver";

		System.out.println("Car1 details=====================");
		System.out.println("Car1 Name is: "+c1.name);
		System.out.println("Car1 Price is: "+c1.price);
		System.out.println("Car1 Color is: "+c1.color);
		System.out.println("Car2 details=====================");
		System.out.println("Car2 Name is: "+c2.name);
		System.out.println("Car2 Price is: "+c2.price);
		System.out.println("Car2 Color is: "+c2.color);
		System.out.println("Car3 details=====================");
		System.out.println("Car3 Name is: "+c3.name);
		System.out.println("Car3 Price is: "+c3.price);
		System.out.println("Car3 Color is: "+c3.color);
		
	}
}






