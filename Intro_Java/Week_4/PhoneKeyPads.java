//Author: Ana Victoria Gomes Mantovani
//Date: 09/16/2022
//Purpose: Display a letter's corresponding phone keypad number

import java.util.Scanner;
public class PhoneKeyPads {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = input.nextLine().charAt(0);
		
		if (Character.toUpperCase(letter) == 'A' || Character.toUpperCase(letter) == 'B' || Character.toUpperCase(letter) == 'C')
			System.out.println("The corresponding number is 2");
	
		else if (Character.toUpperCase(letter) == 'D' || Character.toUpperCase(letter) == 'E' || Character.toUpperCase(letter) == 'F')
			System.out.println("The corresponding number is 3");
		
		else if (Character.toUpperCase(letter) == 'G' || Character.toUpperCase(letter) == 'H' || Character.toUpperCase(letter) == 'I')
			System.out.println("The corresponding number is 4");
		
		else if (Character.toUpperCase(letter) == 'J' || Character.toUpperCase(letter) == 'K' || Character.toUpperCase(letter) == 'L')
			System.out.println("The corresponding number is 5");
		
		else if (Character.toUpperCase(letter) == 'M' || Character.toUpperCase(letter) == 'N' || Character.toUpperCase(letter) == 'O')
			System.out.println("The corresponding number is 6");
		
		else if (Character.toUpperCase(letter) == 'P' || Character.toUpperCase(letter) == 'Q' || Character.toUpperCase(letter) == 'R' || Character.toUpperCase(letter) == 'S')
			System.out.println("The corresponding number is 7");
		
		else if (Character.toUpperCase(letter) == 'T' || Character.toUpperCase(letter) == 'U' || Character.toUpperCase(letter) == 'V')
			System.out.println("The corresponding number is 8");
		
		else if (Character.toUpperCase(letter) == 'W' || Character.toUpperCase(letter) == 'X' || Character.toUpperCase(letter) == 'Y' || Character.toUpperCase(letter) == 'Z')
			System.out.println("The corresponding number is 9");
		else
			System.out.println("Invalid Input.");
	}

}
