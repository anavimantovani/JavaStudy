//Author: Ana Victoria Gomes Mantovani
//Date: 09/01/2022
//Purpose: Convert feet into meters

import java.util.Scanner;
public class feetMeterConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value in feet: ");
		double feet = input.nextDouble();
		
		double meters = feet * 0.305;
		
		System.out.println(feet + " feet is " + meters + " meters");

	}

}
