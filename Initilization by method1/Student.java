class Student
{
	String name;
	int rollno;
	String address;

	public void setValue(String name, int rollno, String address)
	{
		this.name=name;
		this.rollno=rollno;
		this.address=address;
	}
	public void getDetails()
	{
		System.out.println("Name is: "+name);
		System.out.println("Roll Number is: "+rollno);
		System.out.println("Address is: "+address);
		System.out.println("=================");
	}
}






