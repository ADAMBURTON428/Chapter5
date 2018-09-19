package practice;

import java.util.Scanner;

public class DoorGame 
{

	public static void main(String[] args) 
	{
		int chestChoice;
		int doorChoice;
		int bookChoice;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door. \n1- for door One\n2- for door Two\n3- for door Three");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1) 
		{
			System.out.println("Door 1 good choice choose amoung the following chests.");
			System.out.println("1- For Chest One\n2-For Chest Two");
			chestChoice = input.nextInt();
			if(chestChoice == 1) 
			{
				result = "a Pile of Gold";
			}
			else if(chestChoice == 2) 
			{
				result = "just kidding, its empty...nice";
			}
			else
				result = "just kidding, I said 1 or 2";
			
		}
		else if(doorChoice == 2) 
		{
			result = "a Donkey have fun with that.";
		}
		else if(doorChoice == 3) 
		{
			result = "a million dollars in monopoly money";
		}
		else if(doorChoice == 999) 
		{
			System.out.println("You enter a special room with 3 books on the table, there are no "
					+ "words on the cover. Do you choose Book 1, Book 2, or Book 3?");
			bookChoice = input.nextInt();
			if (bookChoice == 1) 
			{
				result = "a chicken leg";	
			}
			else if(bookChoice == 2) 
			{
				result ="this book good for you";
			}
			else if(bookChoice == 3) 
			{
				result ="air, that nice I guess"; 
			}
			else if(bookChoice == 123) 
			{
				result = "...wait you were only to take one";
			}
			else
				result = "just kidding, there is only 3 books, where did you get " + bookChoice +"th book";
			
		}
		else
			result = "nothing because that was not a choice";
		displayMessage(result);
	}
		

		public static void displayMessage(String result) 
		{
		System.out.println("You won " + result);
			
	}

}
