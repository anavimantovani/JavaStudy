//Author: Ana Victoria Gomes Mantovani
//Date: 11/11/2022
//Purpose: Practice catch statement

import java.util.*;
public class NegativeArray {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		int size;
		int[] array;

		System.out.println("Enter array size");
		size = scan.nextInt();

		try {
			array = new int[size];
			} 
		
		catch (NegativeArraySizeException e) {

			System.out.println("Negative size of array");

			System.out.println("The array was't created");

			return;
			} 
		
		catch (NumberFormatException e) {

			System.out.println("Error number format");

			System.out.println("The array was't created");

			return;
			}
		System.out.println("The array was created.");
	}
}