package typecasting;

class Teacher
{
	int x=100;
	int y=150;
	void add()
	{
		System.out.println("sum of number :"+(x+y));
	}
}
class Student extends Teacher
{
	int a=10;
	void sqr()
	{
		System.out.println("squre of number is :"+(a*a));
	}
}
public class DownCasting 
{
	public static void main(String[] args) {
		Teacher t=new Student();
		System.out.println(t.x);
		Student s=(Student)t;
		System.out.println(t.y);
		t.add();// super class can access only add function due to upcasting
		s.sqr();// student(subclass) can acess both subclass and super class member by downcasting
		s.add();

	}
}
