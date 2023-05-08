package assignments;

//Using "this" keyword and "super" keyword output should be in the below sequence
/* Parent 3 parameterized constructor
 * Parent default constructor
 * Parent 2 parameterized constructor 
 * Parent 1 parameterized constructor
 * child 2 parameterized constructor
 * child default constructor
 * child 1 parameterized constructor
 * child 3 parameterized constructor */

public class Assignment_6 extends Assignment_3
{
 public Assignment_6 () 
 {
	 System.out.println("Child default constructor");
 }
 public Assignment_6 (int a) 
 {
	 this (10,20);
	 System.out.println("Child 1 parameterized constructor");
 }
 public Assignment_6 (int a, int b) 
 {
	 super (10);
	 System.out.println("Child 2 parameterized constructor");
 }
 public Assignment_6 (int a, int b, int c) 
 {
	 this ();
	 System.out.println("Child 3 parameterized constructor");
 }
 
 public static void main(String[] args) 
 {
	 Assignment_6 as=new Assignment_6(10);
	 
 }
 
}
