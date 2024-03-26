//Author: Ana Victoria Gomes Mantovani
//Date: 10/18/2022
//Purpose: Calculate a package cost to ship

import java.util.Scanner;
public class ShippingCharges {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		char choice;
		
		do
		{
			System.out.println("Enter your package weight in pounds: ");
			double weight = input.nextDouble();
			
			System.out.println("Your cost is: $" + String.format("%.2f", getCost(weight)));
			System.out.println();
			
			System.out.println("Would you like to ship another package? (y/n): ");
			choice = input.next().charAt(0);
			
			System.out.println();
			
		} while ((choice == 'y') || (choice == 'Y'));
		

	}
	
	public static double getCost(double pounds) 
	{
		double total;
		
		if (pounds <= 2)
		{ total = pounds*1.1;}
		
		else if ((pounds > 2) && (pounds <= 6))
		{ total = pounds*2.2;}
		
		else if ((pounds > 6) && (pounds <= 10))
		{ total = pounds*3.7;}
		
		else
		{total = pounds*3.8;}
		
		return total;
	}

}
