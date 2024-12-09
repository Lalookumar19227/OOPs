class Car
{
	int p=50;
	
	public  void demo()
	{
		System.out.println("This is demo method");
		int p=99;
		System.out.println(p);	
		System.out.println(this.p);	
	}
	
	public static void main(String[] args)
	{
		System.out.println("main method=================");
		Car c1=new Car();
		c1.demo();
	}
}






