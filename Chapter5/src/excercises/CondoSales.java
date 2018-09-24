package excercises;

import java.util.Scanner;

public class CondoSales 
{

	public static void main(String[] args) 
	{
		int userChoice;
		int finalChoice;
		Scanner input = new Scanner(System.in);

	
		do {
		System.out.print("Select the view you would like.\n1-Park View \n2-Golf Course View \n3-Lake View\n");
		 userChoice = input.nextInt();
		
		if(userChoice == 1) 
		{
			System.out.print("The park view is $150,000\n");
		}
		else if(userChoice == 2) 
		{
			System.out.print("The golf course view is $170,00\n0");
		}
		else if(userChoice == 3) 
		{
			System.out.print("The lake view is $210,000\n");
		}
		else 
		{
			System.out.print("The invalid condo is 0");
		}
		System.out.print(" Are you sure of your choice.\n1-Yes \n2-No \n");
		finalChoice = input.nextInt();
		}while(1 != finalChoice);
	}
	
}
