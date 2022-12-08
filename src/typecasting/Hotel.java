package typecasting;

public class Hotel {
	Food ordreFood(int choice)
	{
		if(choice==1) {
			return new Idly();
		}
		else if(choice==2) {
			return new Dosa();
		}
		else if(choice==3) {
			return new Poori();
		}
		else {
		return null;
		}
		}
}
