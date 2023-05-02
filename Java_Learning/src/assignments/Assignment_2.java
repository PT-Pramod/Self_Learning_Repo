package assignments;

//assignment 2 Create methods to calculate equation  (((((10*2)-2)+2)-2)/2)

public class Assignment_2 
{
   public int multi(int a,int b) 
   {
	int c ;
	c=a*b;
	System.out.println("The Multiplicaton of the number = "+c);
	return c;		
   }
	public int sub (int a1, int b1) 
	{
		int c1;
		c1=a1-b1;
		System.out.println("The Subtraction of number = "+c1);
		return c1;
	}
	public int sum(int a2,int b2) 
	{
		int c2;
		c2=a2+b2;
		System.out.println("The sum of the number = "+ c2);
		return c2;	
	}
	public void div(int a3, int b3)
	{
		int c3;
		c3=a3/b3;
		System.out.println("the divison of the number = "+c3);
	}
	public static void main(String[] args)
	{
		Assignment_2 as=new Assignment_2();
		int multiresult = as.multi(10,2);
		int subresult = as.sub(multiresult, 2);
		int sumresult = as.sum(subresult, 2);
		int subresult1 = as.sub(sumresult, 2);
		as.div(subresult1, 2);
		
	}
}
