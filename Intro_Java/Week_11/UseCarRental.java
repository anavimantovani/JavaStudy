//Author: Ana Victoria Gomes Mantovani
//Date: 11/05/2022
//Purpose: Calculate and display car rentals 

import java.util.Scanner;
public class UseCarRental {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//Prompt user for their name
		System.out.println("Enter renter's name: ");
		String name = input.nextLine();
		
		//Prompt user for their zip
		System.out.println("Enter renter's ZIP: ");
		String zip = input.nextLine();
		
		//Prompt user for the amount of days to be rent
		System.out.println("Enter the amount of days rented: ");
		int days = input.nextInt();
		
		//Prompt user for the size of the car they wish to rent
		System.out.println("Enter renter's car size: \n1 - Economy \n2 - Midsize \n3 - Fullsize \n4 - Luxury ");
		int size = input.nextInt();
		
		//If user pick Luxury car, ask if they want a chauffeur
		if (size == 4)
		{
			System.out.println("Include chauffeur? \n1 - Yes \n2 - No");
			int chauff = input.nextInt();
			
			//Call class to calculate fee for the Luxury car
			LuxuryCarRental lux1 = new LuxuryCarRental(name, zip, size, days, chauff);
			
			System.out.println();
			System.out.println(lux1.display()); //Display the results
		}
		else
		{
			//Call class to calculate the car rent
			CarRental car1 = new CarRental(name, zip, size, days);
			
			System.out.println();
			System.out.println(car1.display()); //Display the results
		}
	}
}
