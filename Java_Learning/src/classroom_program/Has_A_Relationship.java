package classroom_program;

// Below code is the example of has a relationship concept of java 
// We can create the object of class in another class within same package or different package------this concept is call as "has a relationship" in java 
// Created the class named as "Has_A_Relationship"
// created just one method named as "auto" in "Has_A_Relationship" class
// it is observed that in method there is two object is been created one is belong to current class and another one is belong the "Arithmetic" class 
// so in has a relation concept you can call another class method or variable by creating the object of that class...this is called "has a relationship" concept 
// and inheritance is the example of "is a relationship"

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
	  Arithmetic ar = new Arithmetic(); // Example of has a relation concept of jave
	  ar.sub(15, 10);
  }
}
