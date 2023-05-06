package classroom_program;
/* Use of this keyword
 * with the help of this keyword we can call from one constructor to another constructor and "this" will be the first statement inside a constructor 
 * and we can't write more than one this statement in the constructor */

public class Constructor_this
{
	public Constructor_this()
	{
	
		System.out.println("Parent Default Constructor");
	}
	
	public Constructor_this(int a)
	{
		this();
		System.out.println("Parent one parameterized Constructor");
	}
	public Constructor_this (int a, int b)
	{
		this(34,20,10);
		System.out.println("Parent Two parameterized Constructor");
	}
	
	public Constructor_this (int a, int b, int c)
	{
		this(34);
		System.out.println("Parent Three parameterized Constructor");
	}
	public static void main(String[] args) {
		Constructor_this ct= new Constructor_this(60,80);

	}

}
