class Employ
{
	static String comp_name="ABC PVT. LTD";
	String emp_name;
	int id;
	public static void giveBiometric()
	{
		System.out.println("Employ should give biometric");
	}
	public void work()
	{
		System.out.println("Employ is working");
	}
	public static void main(String[] args)
	{
		System.out.println("main starts");
		System.out.println("Company Name is: "+Employ.comp_name);
		Employ.giveBiometric();
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();
		e1.emp_name="mohan";
		e1.id=234;
		e2.emp_name="sohan";
		e2.id=534;
		e3.emp_name="rohan";
		e3.id=134;

		
		e2.emp_name="Jethalal";
		e2.comp_name="TMKOC Original";

		System.out.println("Employ1 details==============================");
		System.out.println("EMploy Company Name is: "+e1.comp_name);
		System.out.println("EMploy Name is: "+e1.emp_name);
		System.out.println("EMploy ID is: "+e1.id);
		e1.giveBiometric();
		e1.work();
		System.out.println("Employ2 details==============================");
		System.out.println("EMploy Company Name is: "+e2.comp_name);
		System.out.println("EMploy Name is: "+e2.emp_name);
		System.out.println("EMploy ID is: "+e2.id);
		e2.giveBiometric();
		e2.work();
		System.out.println("Employ3 details==============================");
		System.out.println("EMploy Company Name is: "+e3.comp_name);
		System.out.println("EMploy Name is: "+e3.emp_name);
		System.out.println("EMploy ID is: "+e3.id);
		e3.giveBiometric();
		e3.work();
		
	}
}






