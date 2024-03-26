//Author: Ana Victoria Gomes Mantovani
//Date: 09/26/22
//Purpose: Calculate the retail price of products

import java.util.Scanner;
public class CalculateRetail {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an item's wholesalecost cost: ");
		double wholeSale = input.nextDouble();
		System.out.println("Enter an item's markup percentage: ");
		double markupPerc = input.nextDouble();
		
		System.out.println("The retail price of that item is: $" + String.format("%.2f", calculateRetail(wholeSale, markupPerc)));
	}
	
	public static double calculateRetail(double whole, double markup)
	{ 
		double add, retail = 0;
		add = whole * markup / 100;
		retail = whole + add;
	    return retail;
	}
		

}
