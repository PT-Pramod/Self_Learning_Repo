package classroom_program;

public class Constructor //class created named as Constructor
{
	public Constructor () 
	{
		System.out.println("Default Constructor");
	}
	
	public Constructor (int a) 
	{
		System.out.println("One parameterized Constructor");
	}
	
	public Constructor (int a, int b)
	{
		System.out.println("Two parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		Constructor co = new Constructor ();
		//Constructor con = new Constructor (10);
		//Constructor cons = new Constructor (10,5);
	}
	
	
	

}
