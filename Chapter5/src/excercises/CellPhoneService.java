package excercises;

import java.util.Scanner;

public class CellPhoneService 
{

	public static void main(String[] args) 
	{
		int Talk;
		int Text;
		int Data;
		 Scanner input = new Scanner(System.in); 
		 System.out.print("Input the minutes of talk needed: ");
		 Talk = input.nextInt();
		 System.out.print("Input the amount of gigabytes needed: ");
		 Data = input.nextInt();
		 System.out.print("Input the amount of text messages: ");
		 Text = input.nextInt();
		 
		 if(Talk <=500 && Data == 1 && Text <=100 ) 
		 {
			 System.out.print("You should do Plan A for $49");
		 }
		 else if(Talk <=500 && Data == 1 && Text ==100) 
		 {
			 System.out.print("You should do Plan B for $55");
		 }
		 else if(Talk >=500 && Data == 1 && Text ==100) 
		 {
			 System.out.print("You should do Plan C for $61");
		 }
		 else if(Talk >=500 && Data == 1 && Text >=100) 
		 {
			 System.out.print("You should do Plan D for $70");
		 }
		 else if(Talk >=500 && Data == 2 && Text >=100) 
		 {
			 System.out.print("You should do plan E for $79");
		 }
		 else if(Talk >=500 && Data <= 2 && Text ==100) 
		 {
			 System.out.print("You should do Plan F for $87");
		 }

	}

}
