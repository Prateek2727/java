package typecasting;
//for upcasting IS-A relationship is compulsory
class Father{
	int x=100;
}
class Son extends Father{
	int y =200;
}
public class Upcasting 
{
public static void main(String[] args) 
{
 Father f =new Son();
    System.out.println(f.x);
 
    
}
}
