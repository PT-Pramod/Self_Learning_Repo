package classroom_program;

import java.util.Scanner;

// Scanner class is used to take the input from the user
// this is java inbuilt class

public class User_Input 
{
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner s = new Scanner (System.in);
		int UI = s.nextInt();
		System.out.println("User input is = "+UI);
	}
}
