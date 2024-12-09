class Student
{
	String name;
	int rollno;
	String address;

	public void setValue(String n, int r, String a)
	{
		name=n;
		rollno=r;
		address=a;
	}
	public void getDetails()
	{
		System.out.println("Name is: "+name);
		System.out.println("Roll Number is: "+rollno);
		System.out.println("Address is: "+address);
		System.out.println("=================");
	}
}






