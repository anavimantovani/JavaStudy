//Author: Ana Victoria Gomes Mantovani
//Date: 09/09/2022
//Purpose: Display how many days are in a month

import java.util.Scanner;
public class palindromeInteger {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a three-digit integer: ");
		int number = keyboard.nextInt();
		
		int num = number;
		int sum = 0, r;
		int temp = number;
		
		while(num > 0)
		{
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		
		if(temp == sum)
			System.out.println("The number " + number + " is a Palindrome.");
		else
			System.out.println("The number " + number + " isn't a Palindrome.");
	}

}

