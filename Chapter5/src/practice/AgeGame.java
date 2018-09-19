package practice;

import java.util.Scanner;

public class AgeGame 
{

	public static void main(String[] args) 
	{
		int usersAge;
		String result = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age to be insulted");
		usersAge = input.nextInt();
		
		if(usersAge <= 12) 
		{
			result = "Why are you here? Your a child.";	
		}
		else if (usersAge >= 13 && usersAge <=18) 
		{
			result = "You a teen now...great.";
		}
		else if (usersAge >= 19 && usersAge <= 25) 
		{
			result = "Get a job lazy.";
		}
		else if (usersAge >= 26 && usersAge <= 30) 
		{
			result = "your getting old.";
		}
		else if (usersAge >= 31 && usersAge <= 40) 
		{
			result = "Did time fly by?";
		}
		else if (usersAge >= 41 && usersAge <= 50) 
		{
		result = "Hows life been going for you.";	
		}
		else if (usersAge >= 51 && usersAge <= 60) 
		{
		result = "Your still here well i guess thats nice";	
		}
		else if (usersAge >= 61) 
		{
			result = "your not dead???";
		}
		displayMessage(result);
	}
	public static void displayMessage(String result) {
		System.out.println(result);
	}

}
