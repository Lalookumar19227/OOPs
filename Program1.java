class Program1
{
	public static void main(String[] args)
	{
		String s1="This is Program1";
		System.out.println(s1);	
		int x=34;
		System.out.println(x);	
		Student y=new Student();
		System.out.println("Student Name is: "+y.name);
		System.out.println("Student Age is: "+y.age);
		System.out.println("Student Roll Number is: "+y.rollno);
		System.out.println("Student Address is: "+y.address);	
		y.read();
		y.write();
		y.name="mohan";
		y.age=17;
		y.rollno=231;
		y.address="NOIDA";
		System.out.println("Updated Students details are Below: ");
		System.out.println("Student Name is: "+y.name);
		System.out.println("Student Age is: "+y.age);
		System.out.println("Student Roll Number is: "+y.rollno);
		System.out.println("Student Address is: "+y.address);

		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
				
	}
}









