//Author: Ana Victoria Gomes Mantovani
//Date: 09/22/2022
// Purpose: Display a bar chart for the sales of stores

import java.util.Scanner;
public class BarChart {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter today's sales for store 1:");
		int store1 = input.nextInt();
		int store1Hundred = store1 / 100;
		
		System.out.println("Enter today's sales for store 2:");
		int store2 = input.nextInt();
		int store2Hundred = store2 / 100;
		
		System.out.println("Enter today's sales for store 3:");
		int store3 = input.nextInt();
		int store3Hundred = store3 / 100;

		System.out.println("Enter today's sales for store 4:");
		int store4 = input.nextInt();
		int store4Hundred = store4 / 100;

		System.out.println("Enter today's sales for store 5:");
		int store5 = input.nextInt();
		int store5Hundred = store5 / 100;
		
		System.out.println();
		System.out.println("SALES BAR CHART");

		for(int symbol = 0; symbol < store1Hundred; symbol++)
			System.out.print("*");
		System.out.println();
		
		for(int symbol = 0; symbol < store2Hundred; symbol++)
			System.out.print("*");
		System.out.println();

		for(int symbol = 0; symbol < store3Hundred; symbol++)
			System.out.print("*");
		System.out.println();
		
		for(int symbol = 0; symbol < store4Hundred; symbol++)
			System.out.print("*");
		System.out.println();
		
		for(int symbol = 0; symbol < store5Hundred; symbol++)
			System.out.print("*");
	}

}
