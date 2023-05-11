package assignments;

import java.util.Scanner;

public class Assignment_9 
{
    public void rev() 
    {	
    	 int rem ; int rev=0 ;
    	Scanner s= new Scanner (System.in);
    	System.out.println("Enter te Number");
    	int num = s.nextInt();
    			
    	while (num!=0) 
    	{
    		 rem = num % 10 ;
    	     rev = rev*10 + rem;
    	     num = num/10;
    	}
    	
    	System.out.println( "The Reversal of the number is = " +rev);
    } 
    public static void main(String[] args) {
    	Assignment_9 as=new Assignment_9();
    	as.rev();
    	
	}
}
