//Author: Ana Victoria Gomes Mantovani
//Date: 09/22/2022
// Purpose: Calculate Pennies for Pay

import java.util.Scanner;
public class Pennies {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("For how many days will you work?");
		int days = input.nextInt();
		
		while (days < 1)
		{
			System.out.println("The number of days must be at least 1.");
			System.out.println("Enter the number of days:");
			 days = input.nextInt();
		}
	
		int count = 1;
		int pennies = 1;
		double total = 0;
		
		System.out.println();
		System.out.println("Day     Pennies Earned");
		System.out.println("----------------------");
		
		while (count <= days)
		{
			System.out.println(count + "             " + pennies);
			total += pennies;
			pennies = pennies * 2;
			count++;
		}
		
		System.out.println();
		System.out.println("Total pay: $" + total/100);
		
	}

}
