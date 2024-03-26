//Author: Ana Victoria Gomes Mantovani
//Date: 09/16/2022
//Purpose: Display a string information

import java.util.Scanner;
public class FavoriteCity {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of your favorite city: ");
		String city = input.nextLine();
		
		System.out.println("City name: " + city);
		System.out.println("Number of characters: " + city.length() );
		System.out.println("Uppercase: " + city.toUpperCase());
		System.out.println("Lowercase: " + city.toLowerCase());
		System.out.println("First character in the name of the city: " + city.charAt(0));

	}

}
