//Reading data from a file
//Asking user to enter a filename and reading only the first line!

import java.io.*;
import java.util.Scanner; // Needed for the Scanner class
public class FileDemo4
{
     public static void main (String[] args) throws IOException
     {
	String fileName;
	//read from keyboard input
	Scanner keyboard = new Scanner(System.in);
             
      	// Get the amount of the purchase.
      	System.out.print("Enter file name : ");
      	fileName = keyboard.nextLine();

	//Open a file: Create an instance of File class.
	//Scanner class uses this file as input
	File file = new File(fileName);
	//read from file
	Scanner inputFile = new Scanner(file);

	//Read the first line from the file.
	String line = inputFile.nextLine();
	
	//Display that line:
	System.out.println("The first line in the file is : ");
	System.out.println(line);

	//Close the file
	inputFile.close();
      }
}
