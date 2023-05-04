package inheritance;

/* Maruti is Grandfather class
 * Swift is father class
 * Swift can access the method created in Maruti class
 * this is example of Single level inheritance*/

public class Swift extends Maruti
{
  public void m2 () 
  {
	  System.out.println("i am child of Maruti with name m2");
  }
  public static void main(String[] args) {
	Swift s=new Swift();
	s.m2();
	s.m1();
	int a = 15;
	System.out.println("Variable declared in Maruti class but accessed in Swift class = "+a);
}
}