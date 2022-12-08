package typecasting;

class Father1 
{
	int x=10;

}
class Son1 extends Father
{
	int y=20;
}
class Daughter extends Father
{
	int z=30;
}
public class Generalization 
{

	public static void main(String[] args) 
	{
		//Upcasting 
		// storing objects of diffrent sublass to same superclass
		Father f =new Son1();
		Father f1 = new Daughter();
		System.out.println(f.x);
		System.out.println(f1.x);
		//downcasting
		Son1 s= (Son1)f;
		Daughter d = (Daughter)f1;
		System.out.println(s.y);
		System.out.println(d.z);
	}
}
