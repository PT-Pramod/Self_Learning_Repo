package assignments;

import java.util.Scanner;

// Write program for below equation with scanner class
// equation is .....(((((X1+X2)+X3)-X4)*X5)/X6)

public class Assignment_4 
{
  public int sum (int a, int b)
  {
	 int c ;
	 c= a+b ;
	 return c ;
  }
  public int sub (int a, int b)
  {
	 int c ;
	 c= a-b ;
	 return c ;
  }
  public int multi (int a, int b)
  {
	 int c ;
	 c= a*b ;
	 return c ;
  }
  public int div (int a, int b)
  {
	 int c ;
	 c= a/b ;
	 return c ;
  }
  public static void main(String[] args) 
  {
	  Assignment_4 as = new Assignment_4 ();
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the value for a ");
	  int a = s.nextInt();
	  
	  System.out.println("Enter the value for b ");
	  int b = s.nextInt();
	  int sumresult = as.sum(a,b);
	  System.out.println("Sum result is = "+sumresult);
	  
	  System.out.println("enter the vlaue for a1");
	  int a1 =s.nextInt();
	  int sumresult1 = as.sum(sumresult, a1);
	  System.out.println("new Sum result is = "+sumresult1);
	  
	  System.out.println("enter the vlaue for a2");
	  int a2 =s.nextInt();
	  int subresult = as.sub(sumresult1, a2);
	  System.out.println("Sub result is = "+subresult);
	  
	  System.out.println("enter the vlaue for a3");
	  int a3 =s.nextInt();
	  int multiresult = as.multi(subresult, a3);
	  System.out.println("Multiplication result is = "+multiresult);
	  
	  System.out.println("enter the vlaue for a4");
	  int a4 =s.nextInt();
	  int divresult = as.div(multiresult,a4);
	  System.out.println("Division result is = "+divresult);
  }  
}
