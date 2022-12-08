package typecasting;

import java.util.Scanner;

public class Custumer {
public static void main(String[] args) {
	Scanner Scan = new Scanner(System.in);
	System.out.println("enter choice : ");
	int choice=Scan.nextInt();
	Hotel h = new Hotel();
	Food f=h.ordreFood(choice);
	if(f instanceof Idly)
	{
		System.out.println("eating Idly");
	}
	else if(f instanceof Dosa)
	{
		System.out.println("eating Dosa");
	}
	else if(f instanceof Poori)
	{
		System.out.println("eating Poori");
	}
	else
	{
		System.out.println("nothing Ordered");
	}
	
	
}
}
