package excercises;

import java.util.Scanner;

public class AscendingAndDescending 
{

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int num3;
		Scanner input = new Scanner(System.in);
		int low;
		int medium;
		int high;
		
		System.out.print("Enter a Number");
		num1 = input.nextInt();
		System.out.print("Enter another Number");
		num2 = input.nextInt();
		System.out.print("Enter another Number");
		num3 = input.nextInt();
		
		if(num1 <= num2 && num1 <= num3) 
		{
			low = num1;
			if(num2 <= num3)
			{
				medium = num2;
				high = num3;
			}
			else 
			{
				medium = num3;
				high = num2;
			}
		}
		else if (num1 >= num2 && num1 <= num3 ) 
		{
			low = num2;
			if (num1 <= num3) 
			{
				medium = num1;
				high = num3;
				
			}
			else 
			{
			medium = num3;
			high = num1;
			}
		
		}
		else if (num1 >= num2 && num1 >= num3) 
		{
			low = num3;
			if (num1 <= num2) 
			{
			medium = num1;
			high = num2;
			}
			else 
			{
				medium = num2;
				high = num1;
			}
		}
			
			
		System.out.println(low + " " + medium + " " + high);
	}

}
