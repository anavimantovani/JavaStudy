//Reading data from a file
//Asking user to enter a filename and reading the entire file!

import java.io.*;
import java.util.Scanner; // Needed for the Scanner class
public class FileDemo5
{
     public static void main (String[] args) throws IOException
     {
	String fileName;
	Scanner keyboard = new Scanner(System.in);
             
      	// Get the amount of the purchase.
      	System.out.print("Enter file name : ");
      	fileName = keyboard.nextLine();

	//Open a file: Create an instance of File class.
	//Scanner class uses this file as input
	File file = new File(fileName);
	Scanner inputFile = new Scanner(file);

	//The Scanner class has a method called hadNext - to determine if a file has more data
	//to be read returns true if there is Data.
	//if end of file is reached and there is no more data, hasNext  returns false
	while(inputFile.hasNext())
	{	
		//Read the first line from the file.
		String line = inputFile.nextLine();
	
		//Display that line:
		System.out.println(line);
	}

	//Close the file
	inputFile.close();
      }
}
