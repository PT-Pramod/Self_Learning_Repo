package assignments;

import java.util.Scanner;

public class Assignment_7 

{
public void SwapNumber ()
//Assignment_7_Part1 Swapping two number using third variable
   {
	  int x; int y; int z; int a; int b;
	 
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the value of X ");
	  a=s.nextInt();
	 

	  System.out.println("Enter the value of Y ");
	  b=s.nextInt();
	  
	  z=x=a;
	  y=x=b;
	  z=y=a;
	  
	  System.out.println("X value is " +x);
	  System.out.println("y value is " +y);
	  
   }
public void SwapNumber1 ()
//Assignment_7_Part2 Swapping two number without third variable
 {
	  int a; int b; int c; int d; int e;
	 
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the value of A ");
	  a=s.nextInt();
	 

	  System.out.println("Enter the value of B ");
	  b=s.nextInt();
	  
    	a=a+b;
    	b=a-b;
    	a=a-b;
    			
	  System.out.println("a value is " +a);
	  System.out.println("b value is " +b);
	  
 }

	  public static void main(String[] args) 
	  {
		  Assignment_7 SN= new Assignment_7();
		  SN.SwapNumber();
		  System.out.println("**************************");
		  SN.SwapNumber1();
	  
	  
	}

	
}
