package assignments;

/* Assignment 1 for constructor output should be in below sequence ----
 * 3 parameterized constructor
 * Default constructor
 * 2 parameterized constructor
 * 1 parameterized constructor */

public class Assignment_3 
{
	public Assignment_3() 
	{
		this(50,60,70);
		System.out.println("Default Constructor");
	}
	public Assignment_3(int a) 
	{
		this(10,20);
		System.out.println("1 parameterized Constructor");
	}
	public Assignment_3 (int a, int b) 
	{
		this();
		System.out.println("2 parameterized Constructor");
	}
	public Assignment_3 (int a, int b, int c) 
	{
		System.out.println("3 parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		Assignment_3 as = new Assignment_3(10);
	}
}
