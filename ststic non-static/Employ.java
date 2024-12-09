class Employ
{
	static int x=12;
	int y=20;

	public static void test()
	{
		System.out.println("This is static test method");
		System.out.println(x);
		demo();
		Employ e1=new Employ();
		System.out.println(e1.y);
		e1.start();
		
	}
	public static void demo()
	{
		System.out.println("This is static demo method");
	}
	public  void start()
	{
		System.out.println("This is non-static start method");
	}
	public  void run()
	{
		System.out.println("This is non-static run method");
		System.out.println(y);
		start();
		System.out.println(x);
		demo();
	}
	
	public static void main(String[] args)
	{
		System.out.println("main method=================");
		test();	
		System.out.println("===========================");
		Employ e1=new Employ();
		e1.run();
		
		
	}
}






