package classroom_program;

import inheritance.Swift;

// Below code is the example of has a relationship concept of java 
// We can create the object of class in another class within same package or different package------this concept is called as "has a relationship" in java 
// and inheritance is the example of "is a relationship" concept of java

public class Has_A_Relationship 
{
  public void auto() 
  {
	  System.out.println("Auto Method with return type void");
  }
  public static void main(String[] args) 
  {
	  Has_A_Relationship har= new Has_A_Relationship();
	  har.auto();
	  Arithmetic ar = new Arithmetic(); // Example of has a relation concept within same package 
	  ar.sub(15, 10);
	  Swift S=new Swift (); // Example of has a relation concept from different package in this need to import the package
	  S.m2();
	  S.m1();
  }
}
