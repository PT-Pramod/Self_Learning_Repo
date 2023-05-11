package assignments;

public class assignment_10 
{

	public void ReverseString() 
	{
		String Name = "Pramod";
		int leng = Name.length();
		String Rev = null ;
		for (int i= leng -1; i > 0; i++)
		{
			Rev = Rev + Name.charAt(i);
		
		}
			
		System.out.println("The Reverse of String is" +Rev);		
	}
	
	public static void main(String[] args) 
	{
		assignment_10 as = new assignment_10();
		as.ReverseString();
	}
}
