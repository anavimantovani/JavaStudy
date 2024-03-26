//Author: Ana Victoria Gomes Mantovani
//Date: 10/20/2022
//Purpose: Calculate the factorial of a number

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		// Ask user for his choice on the menu
		System.out.println("Menu:");
		System.out.println("1. Run the factorial calculator");
		System.out.println("2. Quit the program");
		System.out.println("Please, enter your choice: ");
		int firstChoice = input.nextInt();
		System.out.println();
		
		// If the user chooses option 1, perform the program
		if (firstChoice == 1)
		{
			int choice; //initialize variable
			do 
			{
				//Prompt user for a number greater than 2
				System.out.println();
				System.out.println("Enter a number greater than 2:  ");
				int factor = input.nextInt();
				
				//If user enter a number less or equal to 2, the program prompts the user again
				while (factor <= 2)
				{
					System.out.println();
					System.out.println("ERROR - Invalid Number");
					System.out.println("Please, enter a number greater than 2:  ");
					factor = input.nextInt();
				}

				//Calculate the factorial of the entered number
				int total = 1;
				for (int counter = 1; counter <= factor; counter++)
				{ total *= counter; }
				
				//Print the results of the program
				System.out.println("The factorial of " + factor + " is " + total);
				
				//Prompt the user if they wish to continue of exit the program
				System.out.println();
				System.out.println("Menu:");
				System.out.println("1. Run the factorial calculator");
				System.out.println("2. Quit the program");
				System.out.println("Please, enter your choice: ");
				choice = input.nextInt();
				System.out.println();
				
			} while (choice == 1); //Run the program until users chooses otherwise
		}
		//If the user chooses option 2, end the program
		else
		{System.out.println();}
		
	}

}
