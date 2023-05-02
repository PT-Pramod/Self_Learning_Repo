/*For Printing Use Sysout and Ctrl + Space*/

package classroom_program; //Package created

public class Student //Class created
{
	int a; //Declaring the variable
	public void Pramod() //Creating the method 
	{
		System.out.println("Hi Welcome to java world");
	}
public static void main (String[]args) // main method 
	{
	
	Student abc=new Student(); //creating the object
	abc.Pramod(); // Calling a method
	abc.a = 150 ; //called the variable and assigned the value
	System.out.println(abc.a);
	}	
}

