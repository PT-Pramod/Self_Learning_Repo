package classroom_program;

//Constructor is like method
//Constructor name and class name will be the same
//no return type
//no need to be call it will be called by itself as we create object of the class.like for calling the method we use reference _variable.methodname()
//in case of constructor will be called automatically 
//use of constructor is for assigning the value and it will reduce the number of calls

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
