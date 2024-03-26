//Author: Ana Victoria Gomes Mantovani
//Date: 09/09/2022
//Purpose: Display how many days are in a month

import java.util.Scanner;
public class NumberDays {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a month number(1-12): ");
		int month = keyboard.nextInt();
		System.out.println("Enter a year: ");
		int year = keyboard.nextInt();
		int numOfDays = 0;
		String monthName = "None";
		
		switch(month)
		{
		case 1:
			monthName = "January";
			numOfDays = 31;
			break;
		case 2:
			monthName = "February";
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				numOfDays = 29;
			else
				numOfDays = 28;
			break;
		case 3:
			monthName = "March";
			numOfDays = 31;
			break;
		case 4:
			monthName = "April";
			numOfDays = 30;
			break;
		case 5:
			monthName = "May";
			numOfDays = 31;
			break;
		case 6:
			monthName = "June";
			numOfDays = 30;
			break;
		case 7:
			monthName = "July";
			numOfDays = 31;
			break;
		case 8:
			monthName = "August";
			numOfDays = 31;
			break;
		case 9:
			monthName = "September";
			numOfDays = 30;
			break;
		case 10:
			monthName = "October";
			numOfDays = 31;
			break;
		case 11:
			monthName = "November";
			numOfDays = 30;
			break;
		case 12:
			monthName = "December";
			numOfDays = 31;
			break;
		}

		System.out.println("There are " + numOfDays + " days in " + monthName + " " + year + ".");
	}

}
