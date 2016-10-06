import java.util.*;
interface Student
{
	void display();
}
interface Department
{
	void eligible();
}
class Enrollment implements Department,Student
{
	static int roll;
	static double att;
	static String name;
	publuc void display()
	{
		System.out.println("Roll No: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Attendence: "+att);
	}
	public void eligible()
	{
		if(att>=0.75)
			System.out.println("Eligible");
		else
			System.out.println("Not Eligible");
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the roll no: ");
		roll=sc.nextInt();
		System.out.println("Enter the Name: ");
		name=sc.next();
		System.out.println("Enter the Attendence: ");
		att=sc.nextDouble();
		Enrollment e=new Enrollment();
		e.display();
		e.eligible();
	}
}