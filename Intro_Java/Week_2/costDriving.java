//Author: Ana Victoria Gomes Mantovani
//Date: 09/01/2022
//Purpose: Calculate the cost and efficiency of gas

import java.util.Scanner;
public class costDriving {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance:");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon:");
		double milesGallon = input.nextDouble();
		
		System.out.println("Enter price per gallon:");
		double priceGallon = input.nextDouble();

		double totalCost = distance / milesGallon * priceGallon;
		double rounded = Math.round(totalCost * 100) / 100.0;
		
		System.out.println("The cost of driving is $" + rounded);
		
	}

}
