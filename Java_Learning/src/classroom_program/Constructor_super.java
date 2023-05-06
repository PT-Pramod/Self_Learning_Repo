package classroom_program;
// What is "super" keyword ?
// with the help of super keyword we can call parent parameterized constructor. 
// so it means super keyword will comes in to the picture in case of inheritance
// As we create object of the class, corresponding constructor will be called
// there are two types of calls 
// implicit call ....if we are not writing super keyword in the child class constructor, it will automatically call the parent default constructor.
// explicit call ....if we want to call parameterized constructor then with the help of 'super" keyword we can call the parent parameterized constructor


public class Constructor_super extends Constructor_this
{
	public Constructor_super()
	{
		System.out.println("Child default constructor");
	}
	
	public Constructor_super(int a)
	{
		super(20,30);
		System.out.println("Child 1 Parameterized constructor");
	}

	public Constructor_super(int a, int b)
	{
		System.out.println("Child 2 Parameterized constructor");
	}
	public Constructor_super(int a, int b, int c)
	{
		System.out.println("Child 3 Parameterized constructor");
	}
	public static void main(String[] args) {
		Constructor_super cu=new Constructor_super(10);
	}
}
