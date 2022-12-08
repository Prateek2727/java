package typecasting;


class father2 
{
	int n=55790;
	int r1=0;
	int c=0;
	void duck(){
		while(n!=0)
		{
			r1=n%10;
			if(r1==0)
			{
				c++;
				
			}
			n=n/2;

		}
		if(c>0) {
			System.out.println("duck number");
		}
		else
		{
			System.out.println("not duck number");
		}

	}
}
class Digit extends father2{

	int r=0;
	int sum=0;

	void SumOfDigit()
	{
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
public class instanceOf {
	static void selectObj(father2 f)
	{
		if(f instanceof Digit) {
			Digit d=(Digit)f;
			System.out.println(d.n);
			d.SumOfDigit();
			d.duck();
		}

	}
	public static void main(String[] args) 
	{
		selectObj(new Digit());
	
	}


}













