package classroom_program;
/* Use of this keyword
 * with the help of this keyword we can call from one constructor to another constructor and "this" will be the first statement inside a constructor 
 * and we can't write more than one this statement in the constructor */

public class Constructor_this
{
	public Constructor_this()
	{
		this(34);
		System.out.println("Default Constructor");
	}
	
	public Constructor_this(int a)
	{
	
		System.out.println("one parameterized Constructor");
	}
	public Constructor_this (int a, int b)
	{
		this();
		System.out.println("Two parameterized Constructor");
	}
	public static void main(String[] args) {
		Constructor_this ct= new Constructor_this(60,80);
		
	}

}
