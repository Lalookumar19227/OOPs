class StudentDriver
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		s1.setValue("Mohan", 234, "NOIDA");
		s2.setValue("Sohan", 534, "Delhi");
		s3.setValue("ManMohan", 134, "Kanpur");
		s4.setValue("ChandraMohan", 500, "Rampur");
		s1.getDetails();
		s2.getDetails();
		s3.getDetails();
		s4.getDetails();
	}
}






