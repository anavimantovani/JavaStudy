//Author: Ana Victoria Gomes Mantovani
//Date: 10/15/2022
//Purpose: Display the number of days in a month

import java.util.Scanner;
public class MonthDaysDemo {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a month (1-12): ");
		int inputMonth = input.nextInt();
		
		while (inputMonth < 1 || inputMonth > 12)
		{
			System.out.println("ERROR - Invalid month");
			System.out.println("Enter a month (1-12): ");
			inputMonth = input.nextInt();
		}
		
		System.out.println("Enter a year: ");
		int inputYear = input.nextInt();
		
		MonthDays example = new MonthDays(inputMonth, inputYear);
		
		System.out.println(example.numberOfDays() + " days");

	}

}
