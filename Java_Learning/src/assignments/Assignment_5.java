package assignments;

import java.util.Scanner;

//Write program for below equation with scanner class
//equation is .....(((((X1*X2)-X3)-X4)+X5)/X6)

public class Assignment_5 

{
	public int Multi(int a ,int b) 
	{
		int c = a*b;
		return c;
				
	}
	public int sub (int a ,int b) 
	{
		int c = a-b;
		return c;
				
	}
	public int sum (int a ,int b) 
	{
		int c = a+b;
		return c;	
	}
	public int div (int a ,int b) 
	{
		int c = a/b;
		return c;	
	}
	public static void main(String[] args) 
	{
		Assignment_5 as = new Assignment_5();
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the number for multiplication");
		int a = s.nextInt();
		System.out.println("Enter next number for multiplication");
		int b = s.nextInt();
		int MiltiResult= as.Multi(a, b);
		System.out.println("Multiplication result = "+MiltiResult);
		
		System.out.println("Enter the number for Subtraction");
		int a1 = s.nextInt();
		int SubResult= as.sub(MiltiResult, a1);
		System.out.println("Subtraction result = "+SubResult);
		
		System.out.println("Enter the number for Subtraction");
		int a2 = s.nextInt();
		int SubResult1= as.sub(SubResult, a2);
		System.out.println("next Subtraction result = "+SubResult1);
		
		System.out.println("Enter the number for Addition");
		int a3 = s.nextInt();
		int SumResult= as.sum(SubResult1, a3);
		System.out.println("Adding result = "+SumResult);
		
		System.out.println("Enter the number for division");
		int a4 = s.nextInt();
		int DivResult= as.div(SumResult, a4);
		System.out.println("division result = "+DivResult);
	}
	
	

}
