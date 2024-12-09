class Fruit
{
	static int x=40;
	
	public static void test()
	{
		System.out.println("This is test method");
		int x=75;
		System.out.println(x);
		System.out.println(Fruit.x);
	}
	
	public static void main(String[] args)
	{
		System.out.println("main method=================");
		test();	
	}
}






