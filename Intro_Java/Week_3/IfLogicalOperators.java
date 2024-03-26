package class3;

import java.util.Scanner;
public class IfLogicalOperators {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the temperature:");
		double temp = keyboard.nextDouble();
		
		if((temp < 20) || (temp > 100))
			System.out.println("DANGER!");
		else
			System.out.println("You are ok.");
		
	}

}
