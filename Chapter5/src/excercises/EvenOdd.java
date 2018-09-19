package excercises;

import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		int x;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		x = input.nextInt();
		
		if(x % 2 == 0) 
		{
			System.out.print("Its even");
		}
		else 
			System.out.print("Its odd");
		
		
		
	}

}
