package excercises;

import java.util.Scanner;

public class Pay 
{

	public static void main(String[] args) 
	{
		int Hours;
		String Skill;
		int Insurance;
		double hourlyPay;
		double Pay;
		double overTime;
		double netPay;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter Your Skill Level(1-3)");
		Skill = input.nextLine();
		System.out.print("Enter your Hours worked");
		Hours = input.nextInt();
		System.out.print("Enter your Insurance \n1-Medical \n2-Dental \n3-Long term disability ");
		Insurance = input.nextInt();
		
		switch(Skill) 
		{
		case "1":
			if(Hours>40) 
			{
			hourlyPay = Hours * 17;
			overTime = (Hours - 40) * 17 * 1.5;
			
			System.out.println("Your pay is "+ hourlyPay);
			System.out.println("Your overtime pay is " + overTime );
				
			}
			else
				hourlyPay = Hours * 17;
				System.out.print("Your pay is " + hourlyPay);
				break;
			
		case "2":
			
			
		
		
		
		
		
		}

	
		

	}

}
