package assignments;

// assignment 1 Create methods to calculate equation (((((10+2)+2)-2)*2)/2)


public class Assignment_1 
{
	public int sum(int a ,int b) 
	{
		int c;
		c=a+b;
		System.out.println("The Sum of number is = " +c);
		return c;
	}
	public int sub(int a1, int b1) 
	{
		int c1;
		c1 = a1-b1;
		System.out.println("The Subtraction of number is = " +c1);
		return	c1;
		
	}
	public int multi(int a2, int b2) 
	{
		int c2;
		c2=a2*b2;
		System.out.println("The Mulitplication of number is = "+c2);
		return c2;
	}
	public void div(int a3,int b3)
	{
		int c3;
		c3=a3/b3;
		System.out.println("The divison of the number is = "+c3);
			
	}
	public static void main(String[] args)
	{
		Assignment_1 as=new Assignment_1();
		int sumresult = as.sum(10, 2);
		int sumresult1 = as.sum(sumresult,2);
		int subresult = as.sub(sumresult1, 2);
		int multiresult = as.multi(subresult, 2);
		as.div(multiresult, 2);
		
	}
}
