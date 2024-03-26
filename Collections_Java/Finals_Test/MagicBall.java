//Author: Ana Victoria Gomes Mantovani
//Date: 12/15/2022
//Purpose: Magic 8 Ball game

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class MagicBall
{
	public static void main (String[] args) throws IOException
     {
    	 //Define the Scanner class
    	 Scanner keyboard = new Scanner(System.in);
    	 
    	 //Define the array of 12 strings
    	 String[] array = new String[12];
    	 String answer;
          
	    //Open the file to get the responses
	    File file = new File("C:\\Users\\COD_User\\eclipse-workspace\\final\\responses.txt");
	    Scanner sc = new Scanner(file);
	 
	    //While the text file has new lines, store each line into a different element of the array
	    while (sc.hasNextLine())
	    {
	    	for (int i = 0; i < array.length; i++)  
		    {  array[i] = sc.nextLine(); } 
	    }
	    
	    //Keep asking questions until the user wants to exit
	    do {
	    	//Prompt user for their question
	    	System.out.println("Enter your question or type (X) to exit:");
			answer = keyboard.nextLine();
			answer = answer.toUpperCase();
			
			//If user input an X, exit the program
			if (answer == "X")
			{
				break;
			}
			
			//instance of random class
			Random rand = new Random();
			//generates a number from 0 - 11
			int number = 12;
			int intRandom = rand.nextInt(number); 
			
			//Display the answer
			System.out.println();
			System.out.println(array[intRandom]);
			System.out.println();
			System.out.println();
			
	    } while (answer != "X");
	  }
}