//Author: Ana Victoria Gomes Mantovani
//Date: 10/06/2022
//Purpose: Enter 10 double numbers

import java.util.Scanner;
public class Lab7 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		final int NUMBERS = 10;           
	    double[] enteredNumbers = new double[NUMBERS];
	   

	    System.out.println("Enter up to any " + NUMBERS + " numbers:");
	    for (int index = 0; index < NUMBERS; index++)
	    {
	       System.out.print("Number #" + (index + 1) + ": ");
	       enteredNumbers[index] = input.nextDouble();
	    }

	    double sum = 0;
        for (int i = 0; i < NUMBERS; i++) 
        {
            sum += enteredNumbers[i];
        }
 
        double average = sum / NUMBERS;
        double difference = 0;
	    
        System.out.println();
        System.out.println("The average is: " + average);
	    System.out.println("The numbers you entered are:");
	    for (int index = 0; index < NUMBERS; index++)
	    {	
	    	if (index < average)
	    	{
	    		difference = average - index;
	    		System.out.println(enteredNumbers[index] + " and it is " + difference  + " distant from the average.");
	    	}
	    	else
	    	{
	    		difference = index - average;
	    		System.out.println(enteredNumbers[index] + " and it is " + difference  + " distant from the average.");
	    	}
	    	
	    }
        
	}

}
