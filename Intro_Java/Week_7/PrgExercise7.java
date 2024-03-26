//Author: Ana Victoria Gomes Mantovani
//Date: 10/06/2022
//Purpose: Store the rainfall of 12 months

import java.util.Scanner;
public class PrgExercise7 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		final int MONTHS = 12;           
	    double[] monthlyRainfall = new double[MONTHS];
	   

	    System.out.println("Enter the rainfall of " + MONTHS + ".");
	    for (int index = 0; index < MONTHS; index++)
	    {
	       System.out.print("Month #" + (index + 1) + ": ");
	       monthlyRainfall[index] = input.nextDouble();
	    }
		
		double totalRainfall = getTotalRainfall(monthlyRainfall, MONTHS);
		double averageRainfall = averageMonthlyrainfall(monthlyRainfall, MONTHS);
		double mostRain = getMostRain(monthlyRainfall, MONTHS);
		double leastRain = getLeastRain(monthlyRainfall, MONTHS);
		
		System.out.println();
		System.out.println("The total reainfall of the year was " + String.format("%.2f", totalRainfall) + " inches.");
		System.out.println("The average reainfall of the year was " + String.format("%.2f", averageRainfall) + " inches.");
		System.out.println("The month with the most reainfall of the year was month #" + String.format("%.0f", mostRain) + ".");
		System.out.println("The month with the least reainfall of the year was month #" + String.format("%.0f", leastRain) + ".");

	}
	
	public static double getTotalRainfall(double[] array, int ARRAY_SIZE)
	{ 
		double sum = 0;
		for (int i = 0; i < ARRAY_SIZE; i++) 
        {
            sum += array[i];
        }
	    return sum;
	}
	
	public static double averageMonthlyrainfall(double[] array,int ARRAY_SIZE)
	{ 
		
		double sum = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) 
        {
            sum += array[i];
        }
 
        double rainfall = sum / ARRAY_SIZE;
			
	    return rainfall;
	}
	
	public static double getMostRain(double[] array,int ARRAY_SIZE)
	{
		double most = array[0];
		
		for(int index = 1; index < ARRAY_SIZE; index++)
		{
			if(array[index] > most)
				most = array[index];
		}
         
		return most;
	}
	
	public static double getLeastRain(double[] array,int ARRAY_SIZE)
	{
		double least = array[0];
		
		for(int index = 1; index < ARRAY_SIZE; index++)
		{
			if(array[index] < least)
				least = array[index];
		}
		
		return least;
	}

}
