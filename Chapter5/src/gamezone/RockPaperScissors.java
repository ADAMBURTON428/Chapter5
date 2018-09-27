package gamezone;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) 
	{
		int computerChoice;
		int userChoice;
		computerChoice = (1 + (int)(Math.random() *3));
		Scanner input = new Scanner(System.in);
		
		System.out.print("1-Rock \n2-Paper \n3-Scissor");
		userChoice = input.nextInt();
		
		if(computerChoice == 1) 
		{
			if(userChoice == 1) 
			{
				System.out.print("Tie");
			}
			else if(userChoice == 2) 
			{
				System.out.print("You win");
			}
			else
			{
				System.out.print("You lose");
			}
			
			
		}
		else if(computerChoice == 2) 
		{
			if(userChoice == 1) 
			{
				System.out.print("You lose");
			}
			else if(userChoice == 2) 
			{
				System.out.print("Tie");
			}
			else
			{
				System.out.print("You win");
			}
		}
		else if(computerChoice == 3) 
		{
			if(userChoice == 1) 
			{
				System.out.print("You win");
			}
			else if(userChoice == 2) 
			{
				System.out.print("You lose");
			}
			else
			{
				System.out.print("Tie");
			}
			
		}
	
		
	}
}
