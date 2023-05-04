/*For Printing Use Sysout and Ctrl + Space*/

package classroom_program; //Package created
import inheritance.Maruti;
/* import the inheritance package to use the Maruti class as example of inheritance in different package 
 * so that i can use variable and method of that class in this class */

public class Student extends Maruti //Class created
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
	abc.m1();
	System.out.println(abc.a);
	}
}