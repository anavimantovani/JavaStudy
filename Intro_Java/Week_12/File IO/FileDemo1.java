//Write to a file
//Asking the user to input the file name.

import java.io.*;
import java.util.Scanner; // Needed for the Scanner class
public class FileDemo1
{
     public static void main (String[] args) throws IOException
     {
	String fileName;
	Scanner keyboard = new Scanner(System.in);
             
      	// Get the amount of the purchase.
      	System.out.print("Enter file name : ");
      	fileName = keyboard.nextLine();

	//to write to a file - you need PrintWriter class
	PrintWriter outputFile = new PrintWriter(fileName);
	outputFile.println("Deepa Janakiraman");
	outputFile.println("Computer Information Sciences");
	outputFile.println("BIC 1535");
	outputFile.println("College of DuPage");
	outputFile.println("Glen Ellyn, IL");
	outputFile.close();
      }
}
