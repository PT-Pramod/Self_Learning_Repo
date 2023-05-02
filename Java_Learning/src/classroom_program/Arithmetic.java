package classroom_program;

public class Arithmetic 
{
	public int sum (int a,int b)
	{
		int c;
		c= a+b;
		System.out.println("The Sum result is "+c);
		return c;	
	}
	
	public int sub (int a1, int b1)
	
	{
		int d;
		d=a1-b1;
		System.out.println("The Subtraction result is "+d);
		return d;
	}
	public void multi (int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("The Multiplication result is "+z);
	}
	
	public static void main(String[] args)
	{
		Arithmetic ar= new Arithmetic();
		int sumresult = ar.sum(40, 40);
		int subresult = ar.sub(45,40);
		ar.multi(sumresult,subresult);
	}
}
