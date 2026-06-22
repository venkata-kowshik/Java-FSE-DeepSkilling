package kowshik;
class Student
{
	String name;
	Student(String name)
	{
		this.name=name;
	}
}

class StudentRepo
{
	void saveDetails()
	{
		System.out.println("saving details");
	}
}
class ReportCard

{
	void printDetails(Student s)
	{
		System.out.println("saving details"+" "+s.name);
	}
}
public class SingleResponsibilityPrinciple {

	public static void main(String []args)
	{
	
		Student st=new Student("hara krishna");
		ReportCard rp=new ReportCard();
		rp.printDetails(st);
	}
}





