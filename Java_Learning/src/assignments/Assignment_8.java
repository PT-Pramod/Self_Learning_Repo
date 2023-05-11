package assignments;

import java.util.Scanner;

public class Assignment_8
{
	//Example 1: Program to Check Prime Number using a for loop
	public static void main(String[] args) 
	{
		Assignment_8 as= new Assignment_8();
		 as.PrimeNumberCheck();
		 System.out.println("**************************");
		 as.PrimeNumberCheck1();
	}
	public void PrimeNumberCheck() 
	{
	    //int num = 0;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Number");
	    int num = s.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	
	 public void PrimeNumberCheck1() 
	 {
		 int  i = 2;
		 Scanner s=new Scanner(System.in);
		    System.out.println("Enter the Number");
		    int num = s.nextInt();
		    boolean flag = false;
		    while (i <= num / 2) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }

		      ++i;
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
	 }
		
	}

//Example 2: Program to Check Prime Number using a while loop

